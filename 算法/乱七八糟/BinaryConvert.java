package ���߰���;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;
public class BinaryConvert {
/*
 * ʮ���Ƶ���ת��Ϊ�����ƻ������������Ƶ���
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Stack s = new Stack();
		while(num != -1){
			System.out.println("������һ������");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			convert(s,num);
			int i=0;
			while(!s.isEmpty()){
				System.out.print(s.pop());
				i++;
				if(i == 4)
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public static void convert(Stack s, int data){
		int N = data;
		int n;
		while(N != 0){
			n = N%2;
			N /= 2;
			s.push(n);
		}
	}

}
