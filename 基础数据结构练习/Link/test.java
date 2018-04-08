package Link;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList L = new LinkList();
		for(int i=0;i<10;i++){
			L.add(i);
		}
		L.print();
		L.ReverseIteratively(L.head);
		L.print();
	}
}

