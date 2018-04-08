package Test;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
/*��ת����
 * ��k������������תn��Ԫ�ص����顣
 * ���磬��n = 7��k = 3ʱ������[1,2,3,4,5,6,7]����ת��[5,6,7,1,2,3,4]��
 * ע�⣺
 * �����ܶ��������������������3�ֲ�ͬ�ķ��������������⡣
 * */
public class RotateArray {
	public static void main(String[] args) {
		
		int[] a = {1,2};
		test2(a,1);
		for(int k:a)
			System.out.print(k+" ");
	}
	public static void test1(){
		/*���н������*/
		Queue queue = new ArrayBlockingQueue(5);
		for(int i=0;i<5;i++){
			queue.add(i);		
		}
		System.out.println(queue);
		for(int i=0;i<2;i++){
			Integer a;
			if(queue.peek() == null)
				System.out.println("����Ϊ�գ�");
			 a = (Integer)queue.poll();
			 queue.add(a);
		}
		System.out.println(queue);
	}
	public static void test2(int[] a, int k){
		/*
		 * �Լ��ⷨ
		 * ȱ�㣺��Ҫ����һ����������飬ռ�ÿռ�
		 * */
		k %= a.length;
		int[] b = new int[k+1];
		for(int i=0;i<=k;i++)
			b[i]=a[i];
		for(int j=k+1,i=0;j<a.length;j++,i++)
			a[i] = a[j];
		for(int z=a.length-k-1,i=0;z<a.length;z++,i++)
			a[z] = b[i];
	}
	public static void test3(int[] a, int k){
		/*
		 * ����ⷨ
		 * ����˼���ǣ����磬nums = [1,2,3,4,5,6,7]��k = 3��
		 * �������Ƿ�ת[1,2,3,4]�������[4,3 ��2,1]����ô���Ƿ�ת[5,6,7]�������[7,6,5]��
		 * ������ǽ��������з�ת�������[4,3,2,1,7,6,5] - > [ 5,6,7,1,2,3,4]
		 * 
		 * */
		if(a == null || a.length<2)
			return;
		k %= a.length;
		test3_reverse(a,0,k);
		test3_reverse(a,k+1,a.length-1);
		test3_reverse(a,0,a.length-1);
	}
	public static void test3_reverse(int[] a, int start, int end){
		int tmp = 0;
		while(start<end){
			tmp = a[start];
			a[start] = a[end];
			a[end] = tmp;
			start++;
			end--;
		}
	}
}
