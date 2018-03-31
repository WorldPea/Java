package 排序;

import java.util.Date;
import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[1000];
		
		for(int i=0;i<1000;i++){
			arr[i] = (int)(Math.random()*1000);
		}
		long start_time = new Date().getTime();
		Bubble_Sort(arr);				/*冒泡排序*/			
//		Quick_sort(arr,0,arr.length-1); /*快速排序*/
		long end_time = new Date().getTime();
		System.out.println("运行时间为："+(end_time - start_time));
		System.out.println("循环次数为："+count);
		int iCount=0;
		for(int k=0;k<1000;k++){
			if(iCount%10 == 0)
				System.out.println(" ");
			iCount++;
			System.out.print(arr[k]+" ");
		}
	}
	static void Bubble_Sort(int[] arr){//冒泡排序
		int temp;
		int count = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 				}
				count++;
			}
		}
		System.out.println("循环次数为："+count);
	}
	static int count = 0;
	static void Quick_sort(int[] arr,int left, int right){//快速排序
		
		if(left>right)
			return;
		int l=left,r=right;
		int key = arr[left];
		while(l<r){
			count++;
			while(l<r && key <= arr[r])
				r--;
			arr[l] = arr[r];
			while(l<r && key >= arr[l]){
				l++;
			}
			arr[r]=arr[l];
		}
		arr[l]=key;
		Quick_sort(arr,left,l-1);
		Quick_sort(arr,l+1,right);
	}
}
