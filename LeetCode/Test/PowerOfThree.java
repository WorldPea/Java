package Test;

public class PowerOfThree {
/*����һ����������дһ��������ȷ�����Ƿ��������ݡ�
 * ������
 * �����������һ�㣬����ʹ���κ�ѭ��/�ݹ飿
 * */
	public static void main(String[] args){
		int n=3;
		for(int i=0;i<18;i++){
			n *= 3;
			System.out.println(n+" "+isPowerOfThree2(n));
		}
	}
		public static boolean isPowerOfThree1(int n) {//����һ
			if(n>1)
				while(n%3==0)
					n/=3;
			return n==1;
		}
		public static boolean isPowerOfThree2(int n){//������
			// 1162261467 is 3^19,  3^20 is bigger than int  
		    return ( n>0 &&  1162261467%n==0);
		}
		
	
}
