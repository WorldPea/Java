package Test;
/*122�����ʱ�������������ƱII
 * ��������һ�����飬���е�i ��Ԫ���ǵ�i�������Ʊ�ļ۸�
 * ���һ���㷨���ҵ��������������Ը�����Ҫ��ɾ����ܶ�Ľ��ף���������������һ�ι�Ʊ����
 * ���ǣ�������ͬʱ���ж�ʽ��ף������������ٴι���֮ǰ���۹�Ʊ��
 * */
public class BestTimeToBuyAndSellStock2 {
	public static void main(String[] args){
		int[] A = {1,2,7,4,5,6};
		System.out.println(maxProfit1(A));
		System.out.println(maxProfit2(A));
	}
	public static int maxProfit1(int[] price){
		/*�ⷨһ
		 * �ӵ�һ�쿪ʼ�����������ң�ֻҪ�ҵ���һ���ǰһ��۸�ߵ�
		 * ��������֪���������Ʊ�۸���ǣ���ô�ҽ���϶�����ǰ������ù�Ʊ����
		 * �ͼ�ȥǰһ��ļ۸����ò�ֵ���Ǿֲ�����ȫ�������������������*/
		int total=0;
		for(int i=0;i<price.length-1;i++){
			if(price[i+1] > price[i]){
				total += price[i+1] - price[i]; 
			}
		}
		return total;
	}
	public static int maxProfit2(int[] price){
		/*�ⷨ��
		 * �ӵ�һ�쿪ʼ�����������ң����ҵ�һ���۸���͵㣨���ȣ����������
		 * Ȼ������Ӹò��ȴ�������һ���۸���ߵ㣨���壩���������
		 * ���ڵĲ����ȥ���ȼ�Ϊ���õľֲ��������
		 * ������еľֲ���������ܺ;�����������
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
