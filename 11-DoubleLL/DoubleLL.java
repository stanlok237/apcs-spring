//I worked with no one else since there was an odd number of students today

public class DoubleLL<E> {

    private class Node<E> {

	E data;
	Node<E> next, prev;
	public Node(E d){
	    this.data = d;
	}

	public String toString(){
	    return "" + data;
	}

	public void setData(E d){
	    data = d;
	}

	public E getData(){
	    return data;
	}

	public void setNext(Node<E> n){
	    next = n;
	}

	public Node<E> getNext() {
	    return next;
	}

	public void setPrev(Node<E> p){
	    prev = p;
	}

	public Node <E> getPrev() {
	    return prev;
	}
    }

    private Node<E> current;

    public void insert(E d) {
	Node<E> n = new Node<E> (d);
	if(current == null){
	    current = n;
	}
	else{
	    n.next = current;
	    n.prev = current.prev;
	    if(current.prev != null){
		//Prevents deletion of elements
		current.prev.next = n;
	    }
	    current.prev = n;
	    current = n;
	}
    }
    public boolean find(E d){
	Node<E> tmp = current;
	if(tmp == null){
	    return false;
	}
	while(tmp.getPrev() != null){
	    tmp = tmp.getPrev();
	}
	while(tmp != null){
	    if(tmp.toString().equals(d.toString())){
		return true;
	    }
	    tmp = tmp.getNext();
	}
	return false;
    }
    
    public E delete(E d){
	Node<E> tmp = current;
	if(tmp == null){
	    return null;
	}
	while(tmp.getPrev() != null){
	    tmp = tmp.getPrev();
	}
	while(tmp != null){
	    if(tmp.toString().equals(d.toString())){
		E ans = tmp.getData();
		Node<E> tmp2 = tmp.getNext();
		tmp.getPrev().setNext(tmp2);
		return ans;
	    }
	    tmp = tmp.getNext();
	}
	return null;
    }
    
    public E getCurrent(){
	return current.getData();
    }

    public void forward() {
	if (current.getNext() != null){
	    current = current.getNext();
	}

    }
    
    public void back(){
	if(current.getPrev() != null){
	    current = current.getPrev();
	}
    }

    public String toString(){
	
	//Circular toString()
	///*
	Node<E> tmp = current;
	if(tmp == null){
	    return "";
	}
	String s = tmp.toString() + " ";
	//System.out.println(s);
	String tmps = tmp.toString();
	while(tmp.getNext() != null){
	    //System.out.println(s + "\n");
	    s += tmp.getNext().getData() + " ";
	    tmp = tmp.getNext();
	}
	while (tmp.getPrev() != null){
	    //System.out.println();
	    //System.out.println(tmp);
	    tmp = tmp.getPrev();
	    //System.out.println(tmp);
	    //System.out.println();
	}
	while(!tmp.toString().equals(tmps)){
	    //System.out.println("test");
	    s += tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	//*/
	/* Old toString()
	Node<E> tmp = current;
	if(current == null){
	    return "";
	}
	while (tmp.getPrev() != null){
	    tmp = tmp.getPrev();
	}
	while (tmp != null){
	    s = tmp.getData() + " " + s;
	    tmp = tmp.getNext();
	}
	s+= "\n";
	*/
	return s;
    }

    public static void main(String[]args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);

	//	/*
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	//	*/
	System.out.println(L.find("world"));
	
	System.out.println(L.delete("world"));
	System.out.println(L);
    }
}