package Test;
/*
 * ��̬�����ִ��˳��
 * �����ִ��˳��:
 * 1��������ľ�̬�����
 * 2��������ľ�̬�����
 * 3������ľ�̬�����
 * 4��������ķǾ�̬�����
 * 5��������Ĺ��캯��
 * 6������ķǾ�̬�����
 * 7������Ĺ��캯��
*/
public class StaticCodeBlockExecutionOrder{
	static {
		System.out.println("main1");
	}
	
	public static void main(String[] args) {
		A a = new A();
	}
}
class A extends B{
	A(){
		System.out.println("���๹��");
	}
	{
		System.out.println("a2");
	}
	static {
		System.out.println("a1");
	}
}
class B{
	public B(){
		System.out.println("���๹��");
	}
	{
		System.out.println("b2");
		
	}
	static{
		System.out.println("b1");
	}
}