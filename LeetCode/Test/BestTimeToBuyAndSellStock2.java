package Test;
/*122、最佳时机买入和卖出股票II
 * 假设你有一个数组，其中第i 个元素是第i天给定股票的价格。
 * 设计一个算法来找到最大的利润。您可以根据需要完成尽可能多的交易（即多次买入和卖出一次股票）。
 * 但是，您不得同时进行多笔交易（即您必须在再次购买之前出售股票）
 * */
public class BestTimeToBuyAndSellStock2 {
	public static void main(String[] args){
		int[] A = {1,2,7,4,5,6};
		System.out.println(maxProfit1(A));
		System.out.println(maxProfit2(A));
	}
	public static int maxProfit1(int[] price){
		/*解法一
		 * 从第一天开始，依次往后找，只要找到后一天比前一天价格高的
		 * （即假设知道明天天股票价格会涨，那么我今天肯定会提前买大量该股票），
		 * 就减去前一天的价格所得差值就是局部利润，全部加起来就是最大利润*/
		int total=0;
		for(int i=0;i<price.length-1;i++){
			if(price[i+1] > price[i]){
				total += price[i+1] - price[i]; 
			}
		}
		return total;
	}
	public static int maxProfit2(int[] price){
		/*解法二
		 * 从第一天开始，依次往后找，先找到一个价格最低点（波谷）标记下来，
		 * 然后继续从该波谷处往后找一个价格最高点（波峰）标记下来，
		 * 相邻的波峰减去波谷即为所得的局部最大利润
		 * 最后所有的局部最大利润总和就是最大的利润。
		 * */
		int total=0;
		int min,max;
		for(int i=0;i<price.length-1;i++){
			while(i<price.length-1 && price[i+1]<price[i])
				i++;
			min = i;
			while(i<price.length-1 && price[i+1]>price[i])
				i++;
			max = i;
			total += price[max] - price[min];
		}
		return total;
	}
}
