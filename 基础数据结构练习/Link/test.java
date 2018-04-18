package Link;

import Link.LinkList.Node;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList L = new LinkList();
		for(int i=0;i<10;i++){
			L.add(i);
		}
		L.reverseList();
		while(L.head != null){
			System.out.print(L.head.data);
			L.head = L.head.next;
		}
		L.reverseList();
		while(L.head != null){
			System.out.print(L.head.data);
			L.head = L.head.next;
		}
		/*L.removeNthFromEnd(5);
		L.print();*/
		
	}
	   
}

