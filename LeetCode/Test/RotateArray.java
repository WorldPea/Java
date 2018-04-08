package Test;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
/*旋转阵列
 * 以k个步骤向右旋转n个元素的数组。
 * 例如，当n = 7和k = 3时，数组[1,2,3,4,5,6,7]被旋转到[5,6,7,1,2,3,4]。
 * 注意：
 * 尽可能多地提出解决方案，至少有3种不同的方法来解决这个问题。
 * */
public class RotateArray {
	public static void main(String[] args) {
		
		int[] a = {1,2};
		test2(a,1);
		for(int k:a)
			System.out.print(k+" ");
	}
	public static void test1(){
		/*队列解决方法*/
		Queue queue = new ArrayBlockingQueue(5);
		for(int i=0;i<5;i++){
			queue.add(i);		
		}
		System.out.println(queue);
		for(int i=0;i<2;i++){
			Integer a;
			if(queue.peek() == null)
				System.out.println("队列为空！");
			 a = (Integer)queue.poll();
			 queue.add(a);
		}
		System.out.println(queue);
	}
	public static void test2(int[] a, int k){
		/*
		 * 自己解法
		 * 缺点：需要申请一个额外的数组，占用空间
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
		 * 经典解法
		 * 基本思想是，例如，nums = [1,2,3,4,5,6,7]和k = 3，
		 * 首先我们反转[1,2,3,4]，它变成[4,3 ，2,1]。那么我们反转[5,6,7]，它变成[7,6,5]，
		 * 最后我们将整个阵列反转，它变成[4,3,2,1,7,6,5] - > [ 5,6,7,1,2,3,4]
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
