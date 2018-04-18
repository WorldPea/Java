package Queue;
class Node{
	int data;
	Node next = null;
	Node(){}
	Node(Node next,int data){
		this.next = next;
		this.data = data;
	}
}
class Queue{
	int size = 0;
	private Node first = null;
	private Node end = null;
	public void push(int data){
		Node newNode = new Node(null,data);
		if(isEmpty()){
			this.end = newNode;
			this.first = this.end;
			size++;
			return;
		}
		this.end.next = newNode;
		this.end = newNode;
		size++;
		return;
	}
	public Object pop(){
		if(isEmpty()){
			System.out.println("队列为空！无法出队！");
			return null;
		}
		Node tmp = this.first;
		this.first = this.first.next;
		tmp.next = null;
		size--;
		return tmp.data;
	}
	public int getSize(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public void display(){
		Node tmp = first;
		for(int i=0;i<this.size;i++){
			if(tmp == null)
				return;
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
}

public class queueTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(3);
		q.display();
		q.pop();
		q.display();
	}

}
