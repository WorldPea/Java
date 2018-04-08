package Test;
/*
 * 静态代码块执行顺序
 * 代码的执行顺序:
 * 1、主调类的静态代码块
 * 2、对象父类的静态代码块
 * 3、对象的静态代码块
 * 4、对象父类的非静态代码块
 * 5、对象父类的构造函数
 * 6、对象的非静态代码块
 * 7、对象的构造函数
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
		System.out.println("子类构造");
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
		System.out.println("父类构造");
	}
	{
		System.out.println("b2");
		
	}
	static{
		System.out.println("b1");
	}
}