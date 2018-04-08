package ����;

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
		
//		Bubble_Sort(arr);				/*ð������*/			
//		Quick_sort(arr,0,arr.length-1); /*��������*/
//		Insert_sort(arr);               /*��������*/
//		Choice_sort(arr);				/*ѡ������*/
		Merge_sort(arr,0,arr.length);
		long end_time = new Date().getTime();
		System.out.println("����ʱ��Ϊ��"+(end_time - start_time));
		
		
		int iCount=0;
		for(int k=0;k<1000;k++){
			if(iCount%10 == 0)
				System.out.println(" ");
			iCount++;
			System.out.print(arr[k]+" ");
		}
	}
	static void Merge(int[] arr, int l, int middle, int r){
		int[] aux = new int[r-l+1]; //��������
		for(int i=l;i<=r;i++){
			aux[i-l] = arr[i];
		}
			
		int i=l,j=middle+1;
		for(int k=l;k<=r;k++){
			if(i>middle){
				arr[k]=aux[j-l];
				j++;
			}
			else if(j>r){
				arr[k]=aux[i-l];
				i++;
			}
			else if(aux[i-l]>aux[j-l]){
				arr[k]=aux[i-l];
				i++;
			}
			else{
				arr[k]=aux[j-l];
				j++;
			}
		}
	}
	static void  Merge_sort(int[] arr, int l, int r){//�鲢����
		if(l>=r)
			return;
		int middle = (l+r)/2;
		Merge_sort(arr,l,middle);
		Merge_sort(arr,middle+1,r);
		Merge(arr,l,middle,r);
	}Merge_sort
	static void Insert_sort(int[] arr){  //��������
		int temp;
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else
					break;
			}
		}
	}
	static void Bubble_Sort(int[] arr){//ð������
		/*
		* ����˼��:���αȽ����ڵ�����������С������ǰ�棬
		*�������ں��档�������������������С����ǰ�ţ���������ţ�
		*�൱�����������������Գ���ð��������Ҫͨ������ѭ����ʵ�֡�
		*/
		int temp;
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
 				}
				
			}
		}
		
	}
	static void Choice_sort(int[] arr){//ѡ������
		int minIndex=0;
		int temp=0;
		for(int i =0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	static void Quick_sort(int[] arr,int left, int right){//��������
		
		if(left>right)
			return;
		int l=left,r=right;
		int key = arr[left];
		while(l<r){
			
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
