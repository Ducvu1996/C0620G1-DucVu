package danh_sach.bai_tap.linked_list;

public class MyLinkedListTest {
	public static void main(String[] args) {
	MyLinkedList<String> myLinkedList = new MyLinkedList<>();
	
	myLinkedList.addFirst("A");
	myLinkedList.addFirst("B");
	myLinkedList.addFirst("C");
	myLinkedList.addFirst("D");
	myLinkedList.addFirst("E");
	//myLinkedList.clear();
	MyLinkedList<String> newLinkedList = myLinkedList.clone();
	myLinkedList.printList();
	newLinkedList.printList();
	}
}
