public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList() {
	head = new Node("");
	tail = new Node("");
	head.setNext(tail);
    }

    public void add(String d) {
	if(head.toString().equals("")){
	    head.setData(d); 
	}
	else if(tail.toString().equals("")){
	    tail.setData(d);
	}
	else{
	    Node tmp = new Node(d);
	    tail.setNext(tmp);
	    tail = tail.getNext();
	}
    }
    
    public String toString() {
	Node tmp = head;
	String s = "";
	while(tmp != null){
	    s += tmp.toString() + " ";
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
	//	System.out.println(tmp2);
	tmp.setNext(tmp2.getNext());
	tmp2.setNext(tmp);
    }
    
    public String get(int index){
	Node tmp = head;
	int i = 0;
	while(i < index){
	    tmp = tmp.getNext();
	    i++;
	}
	return tmp.toString();
    }
    
    
    public String set(int index, String s){
	Node tmp = head;
	//	Node tmp2 = new Node(s);
	int i = 0;
	while(i < index-1){
	    tmp = tmp.getNext();
	    i++;
	}
	//System.out.println(tmp2);
	//tmp2.setNext(tmp.getNext().getNext());
	String ans = tmp.toString();
	tmp.setData(s);
	return ans;
    }
    
    public String remove(int index){
	if(index == 0){
	    String ans = head.toString();
	    head = head.getNext();
	    return ans;
	}
	Node tmp = head;
	int i = 0;
	while(i<index - 1){
	    tmp = tmp.getNext();
	    i++;
	}
	String ans = tmp.toString();
	tmp.setNext(tmp.getNext().getNext());
	return ans;
	
    }
    
    public int find(String s){
	Node tmp = head;
	int i = 0;
	while(tmp != null){
	    if(tmp.toString().equals(s)){
		return i;
	    }
	    tmp = tmp.getNext();
	    i++;
	}
	return -1;
    }
    
    public int length(){
	int length = 0;
	Node tmp = head;
	while(tmp!= null){
	    tmp = tmp.getNext();
	    length++;
	}
	return length;
    }


}
