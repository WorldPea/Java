package ����;

public class HuiWen {
	public static void main(String[] args) {
		
		if(isTrue(12121)){
			System.out.println("�ǻ�������");
		}else
			System.out.println("���ǻ�������");
	}
	static boolean isTrue(int x){
		int num=x;
		int sum = 0;
		while(num != 0){
			sum = sum*10 + num%10;
			num /= 10;
		}
		if(x == sum){
			return true;
		}else
			return false;
	}
}
