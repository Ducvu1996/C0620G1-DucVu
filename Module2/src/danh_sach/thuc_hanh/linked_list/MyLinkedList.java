package danh_sach.thuc_hanh.linked_list;

public class MyLinkedList {
	private  Node head;
	private Node tail;
    private  int numNodes;
    
    
    public MyLinkedList(Object data) {
        head = new Node(data);
        tail=head;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
       holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(Object data) {
    	if(head==null) {
    		head= new Node(data);
    	}
		Node temp = tail;
    	temp.next = new Node(data);
    	tail=temp.next;
    	numNodes++;
    }
//    public E remove(int index) {
//    	if(checkIndex(index)) {
//    		
//    		return (E) ;	
//    	}
//    	
//    }
    public Node get(int index){
       checkIndex(index);
    	Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    int getSize() {
    	return this.numNodes;
    }
     boolean checkIndex(int index) {
    	 if(index>=0||index<this.getSize())
    		 return true;
    	 else return false;
     }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    } 
}
