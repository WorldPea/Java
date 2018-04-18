package Tree;

class Node{
	int value;
	Node next = null;
	Node(int data){
		this.value = data;
	}
	Node(){}
	public void add(Node head,int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		while(head.next != null){
			head = head.next;
		}
		head.next = new Node(data);
		return;
	}
}
public class TreeTest {
	public static void main(String[] args){
		Node head1 = new Node(1);
		Node head2 = new Node(2);
		for(int i=1;i<10;i++){
			int data1 = 2*i;
			int data2 = 4*i;
			head1.add(head1,data1);
			head2.add(head2,data2);
		}
		printAll(head1);
		printAll(head2);
		printNode(head1,head2);
	}
	public static void printAll(Node head){
		while(head != null){
			System.out.print(head.value+" ");
			head = head.next;
		}
		System.out.println(" ");
	}
	public static void printNode(Node head1, Node head2){
		while(head1 != null && head2 != null){
			if(head1.value == head2.value){
				System.out.print(head1.value+" ");
				head1 = head1.next;
				head2 = head2.next;
			}
			else if(head1.value < head2.value)
				head1 = head1.next;
			else
				head2 = head2.next;
		}
		System.out.println(" ");
	}
}
