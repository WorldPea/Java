package Test;

/*�����ַ���
 * ��дһ�����ַ�����Ϊ����ĺ����������ط�ת���ַ���
 * ʾ����
 * ����s =��hello�������ء�olleh����
 * */
public class reverseStringTest{
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}
    public static String reverseString(String s) {
        char[] a = s.toCharArray();  //���ַ���ת�����ַ�����
        int i=0, j=a.length-1;
        char tmp;
        while(i<j){				//���ַ�������з�ת
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
        return String.valueOf(a);   //����ת�ɹ����ַ�������ת�����ַ���Ȼ�󷵻�
    }
}