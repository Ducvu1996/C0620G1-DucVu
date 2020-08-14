package danh_sach.thuc_hanh.linked_list;

public class TestMyLinkedList {

	public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(20);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.addFirst(13);
        linkedList.addLast(10);
        linkedList.addLast(100);

//        linkedList.add(7,9);
//        linkedList.add(4,15);
        linkedList.printList();

	}

}
