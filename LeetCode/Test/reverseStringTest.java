package Test;

/*反向字符串
 * 编写一个将字符串作为输入的函数，并返回反转的字符串
 * 示例：
 * 给定s =“hello”，返回“olleh”。
 * */
public class reverseStringTest{
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}
    public static String reverseString(String s) {
        char[] a = s.toCharArray();  //将字符串转换成字符数组
        int i=0, j=a.length-1;
        char tmp;
        while(i<j){				//对字符数组进行反转
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
        return String.valueOf(a);   //将反转成功的字符串重新转换成字符串然后返回
    }
}