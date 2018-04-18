package Link;

import Link.LinkList.Node;

class LinkList{
	Node head = null;
	class Node{
		int data;//数据域
		Node next = null; //指针域
		public Node(int d){this.data = d;}
	}
	public void add(int d){   //添加节点
		Node newnode = new Node(d);
		if(head == null){
			head = newnode;
			return;
		}
		Node tmp = head;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		tmp.next = newnode;
	}
	public void print(){   //输出所有节点
		Node tmp = head;
		while(tmp != null){
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
		System.out.println();
	}
	public boolean delete(int index){  //根据索引删除相应的节点
		
		if(index < 1 || index > length() || length() < 0)
			return false;
		if(index == 1){    
			head = head.next;
			return true;
		}
		int i=1;
		Node preNode = head;
		Node curNode = head.next;
		while(curNode != null){
			i++;
			if(i == index){
				preNode.next = curNode.next;
				return true;
			}
			else{
				preNode =  curNode;
				curNode = curNode.next;
			}
		}
		return false;
	}
	public int length(){  //获取链表长度
		Node tmp = head;
		int length = 0;
		while(tmp != null){
			length++;
			tmp = tmp.next;
		}
		return length;
	}
	
	public Node removeNthFromEnd(int n) {  //有问题版本，假如链表为[1],删除第1个节点则会出现错误
		/*从列表结尾删除第N个节点
		 * 给定一个链表，从列表末尾删除第n 个节点并返回它的头部。
		 * 例如，
		 * 给定链表：1-> 2-> 3-> 4-> 5，并且n = 2。
		 * 从结尾删除第二个节点后，链表将变为1-> 2-> 3-> 5。
		 */
        int i = length() - n;
        Node tmp = head;
        if(i == 0&&length()==1){
        	head = null;
        }else{
        while(i>1){
        	tmp = tmp.next;
        	i--;
        }
        tmp.next = tmp.next.next;
        }
        return tmp;

    }

	public Node reverseList() {
	        Node pre = null;
	        Node now = head;
	        while(now != null){
	            Node newNode = now.next;
	            now.next = pre;
	            pre = now;
	            now = newNode;
	        }
	        return pre;
	    }
	/*public Node removeNthFromEnd(int n){
		 * 从列表结尾删除第N个节点
		 * 给定一个链表，从列表末尾删除第n 个节点并返回它的头部。
		 * 例如，
		 * 给定链表：1-> 2-> 3-> 4-> 5，并且n = 2。
		 * 从结尾删除第二个节点后，链表将变为1-> 2-> 3-> 5。
		 * 
		 
		Node fast = head;
		Node slow = head;
		Node preNode = null;
		for(int i=0;i<=n;i++){
			preNode = fast;
			fast = fast.next;
		}	
		if(fast == null){
			fast = preNode;
		}
		while(fast != null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}

    public Node ReverseIteratively() {//链表反转
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;
            if (pNext == null) {
                pReversedHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        this.head = pReversedHead;
        return this.head;
    }*/
}