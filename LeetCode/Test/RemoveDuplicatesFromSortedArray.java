package Test;

/*给定一个有序数组，删除重复内容，使每个元素只出现一次并返回新的长度。
 * 不要为其他数组分配额外空间，您必须通过在 O（1）额外内存中就地修改输入数组来实现此目的。
 * 例：
 * 给定nums = [1,1,2]，
 * 你的函数应该返回length = 2，num的前两个元素分别是1和2。
 * 无论你在新的长度以外留下什么都没有关系。*/
public class RemoveDuplicatesFromSortedArray{
	public static void main(String[] args){
		int[] a={1,2,3,4,4,4,5,5,5,6,7,8,9};
		int total = A(a);
		for(int i=0;i<total;i++){
			System.out.println(a[i]);
		}
	}
	public static int A(int[] arr){
		if(arr.length == 0)
			return 0;
		int total=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != arr[total])
				arr[++total] = arr[i];
		}
		return ++total;
	}
}
