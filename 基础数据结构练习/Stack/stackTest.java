package Stack;

class Node{//数据类
	int data;
	Node next = null;
	Node(){}
	Node(Node next, int data){
		this.data = data;
		this.next = next;
	}
	public String toString(){
		return "Node[data="+data+",next="+next+"]";
	}
}
class stack{//栈操作
	private int size = 0;
	private Node top = null;//定义栈顶
	public boolean isEmpty(){
		return size == 0 ? true:false;
	}
	public void push(int data){
		top = new Node(top,data);
		size++;
	}
	public Object pop(){
		if(isEmpty()){
			System.out.println("当前栈为空！不能出栈！");
			return null;
		}
		Node tmp = top;
		top = top.next;
		tmp.next = null;
		size--;
		return tmp.data;
	}
	public Object peek(){
		return this.top.data;
	}
	public int getSize(){
		return size;
	}
	public void display(){
		if(size == 0){
			System.out.println("栈为空！");
			return;
		}	
		while(top !=null){
			System.out.println(top.data);
			top = top.next;
		}
	}
}
public class stackTest {
	public static void main(String[] args) throws Exception{
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.display();
	}
}
