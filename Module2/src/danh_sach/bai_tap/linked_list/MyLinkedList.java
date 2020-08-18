package danh_sach.bai_tap.linked_list;

public class MyLinkedList<E> {
	private Node head;
	//private Node tail;
	private int numNodes=0;
	
	public MyLinkedList() {
		
	}
	public MyLinkedList( E element) {
		head = new Node(element);
	
		numNodes++;
	}

	static class Node{
		private Node next;
		private Object data;
		Node(Object data){
			this.data=data;
		}
		public Object getData() {
			return this.data;
		}
	}
	public void add(int index,E data) {
		Node temp=head;
		Node holder;
		// chạy đến vị trị index-1
		for(int i=0;i<index-1 && temp.next!=null;i++) {
			temp=temp.next;
		}
		//holder tham chiếu đến vị trị index
		holder=temp.next;
		// node tại vị trị index - trỏ đến node mới
		temp.next= new Node(data);
		//node = đến holder
		temp.next.next=holder;
		numNodes++;
	}
	public void addFirst(E data) {
		Node temp =head;
		head = new Node(data);
		head.next = temp;
		numNodes++;
	}
	public void addLast(E data) {
		Node temp= head;
		while(temp.next!=null) {
			temp= temp.next;
		}
		temp.next= new Node(data);
		numNodes++;
	}
	public Object get(int index) {
		Node temp =head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	public E remove(int index) {
		if(index<0||index>numNodes) {
			throw new IndexOutOfBoundsException();
		}
		Node temp=head;
		Object data;
		if(index==0) {
			data= temp.data;
			head=temp.next;
		}else {
			for(int i=0;i<index-1 && temp.next!=null;i++) {
				temp=temp.next;
			}
			data = temp.next.data;
			temp.next=temp.next.next;
			
		}
		numNodes--;
		return (E)data;
	}
	public boolean  remove(E data){
		if(head.data.equals(data)) {
			remove(0);
			return true;
		}else {
			Node temp =head;
			while(temp.next!=null) {
				if(temp.next.data.equals(data)) {
					temp.next=temp.next.next;
					numNodes--;
					return true;
				}
				temp=temp.next;
			}
			return false;
		}
	}
	public MyLinkedList<E> clone(){
		if(numNodes==0) {
			throw new NullPointerException("linkedList null");
			
		}
		Node temp =head;
		MyLinkedList<E> newLinkedList= new MyLinkedList<>();
		newLinkedList.addFirst((E)temp.data);
		temp=temp.next;
		while(temp!=null) {
			newLinkedList.addLast((E)temp.data);
			temp=temp.next;
		}
		return newLinkedList;
	}
	public void clear() {
		Node temp=head;
		head=null;
		while(temp.next!=null) {
			temp.next=null;
		}
		numNodes=0;
	}
	public int indexOf(E element) {
		Node temp =head;
		for(int i=0;i<numNodes;i++) {
			if(temp.data.equals(element)) {
				return i;
			}
			temp=temp.next;
		}
		return -1;
	}
	public boolean contain(E element) {
		return indexOf(element)>=0;
	}
	public void printList() {
	  Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
       
	}
}
