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
	int i = 0;
	Node tmp = head;
	String s = "";
	while(tmp != null){
	    s += tmp.getNext() + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }



    public void add(int index, String s){
	Node tmp = new Node(s);
	Node tmp2 = head;
	int i = 0;
	while(i < index - 1){
	    tmp2 = tmp2.getNext();
	    i++;
	}
	System.out.println(tmp2);
	tmp.setNext(tmp2.getNext());
	tmp2.setNext(tmp);
	head = tmp2;
    }
    /*
    public String get(int i){

    }

    public String set(int i, String s){
	
    }

    public String remove(int i){

    }

    public int find(String s){

    }

    public int length(){

    }

*/
}
