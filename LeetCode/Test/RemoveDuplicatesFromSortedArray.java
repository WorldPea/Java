package Test;

/*����һ���������飬ɾ���ظ����ݣ�ʹÿ��Ԫ��ֻ����һ�β������µĳ��ȡ�
 * ��ҪΪ��������������ռ䣬������ͨ���� O��1�������ڴ��о͵��޸�����������ʵ�ִ�Ŀ�ġ�
 * ����
 * ����nums = [1,1,2]��
 * ��ĺ���Ӧ�÷���length = 2��num��ǰ����Ԫ�طֱ���1��2��
 * ���������µĳ�����������ʲô��û�й�ϵ��*/
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
