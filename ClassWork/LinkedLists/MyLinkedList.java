public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
	head = null;
    }

    public void add(String d) {
	Node tmp = new Node(d);
	tmp.setNext(head); // you must do this first
	head=tmp; // you must do this second
    }
    
    public String toString() {
	return ""+head;

    }

}
