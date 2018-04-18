package Test;

public class PowerOfThree {
/*给定一个整数，编写一个函数来确定它是否是三的幂。
 * 跟进：
 * 你可以做到这一点，而不使用任何循环/递归？
 * */
	public static void main(String[] args){
		int n=3;
		for(int i=0;i<18;i++){
			n *= 3;
			System.out.println(n+" "+isPowerOfThree2(n));
		}
	}
		public static boolean isPowerOfThree1(int n) {//方法一
			if(n>1)
				while(n%3==0)
					n/=3;
			return n==1;
		}
		public static boolean isPowerOfThree2(int n){//方法二
			// 1162261467 is 3^19,  3^20 is bigger than int  
		    return ( n>0 &&  1162261467%n==0);
		}
		
	
}
