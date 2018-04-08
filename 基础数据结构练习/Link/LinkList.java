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

    public Node ReverseIteratively(Node head) {//链表反转
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
    }
    
    
}