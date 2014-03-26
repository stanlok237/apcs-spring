import java.util.*;
import java.io.*;

public class MyLinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;

    public Iterator<E> iterator(){
	
    }
    

    public MyLinkedList() {
	head = new Node<E>(null);
	tail = new Node<E>(null);
	head.setNext(tail);
    }

    public void add(E d) {
	if(head == null)){
	    head.setData(d); 
	}
	else if(tail == null){
	    tail.setData(d);
	}
	else{
	    Node<E> tmp = new Node<E>(d);
	    tail.setNext(tmp);
	    tail = tail.getNext();
	}
    }
    
    public String toString() {
	Node<E> tmp = head;
	String s = "";
	while(tmp != null){
	    s += tmp.toString() + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }



    public void add(int index, E s){
	Node<E> tmp = new Node<E>(s);
	Node<E> tmp2 = head;
	int i = 0;
	while(i < index - 1){
	    tmp2 = tmp2.getNext();
	    i++;
	}
	//	System.out.println(tmp2);
	tmp.setNext(tmp2.getNext());
	tmp2.setNext(tmp);
    }
    
    public E get(int index){
	Node<E> tmp = head;
	int i = 0;
	while(i < index){
	    tmp = tmp.getNext();
	    i++;
	}
	return tmp.getData();
    }
    
    
    public E set(int index, E s){
	Node<E> tmp = head;
	//	Node tmp2 = new Node(s);
	int i = 0;
	while(i < index-1){
	    tmp = tmp.getNext();
	    i++;
	}
	//System.out.println(tmp2);
	//tmp2.setNext(tmp.getNext().getNext());
	E ans = tmp.getData();
	tmp.setData(s);
	return ans;
    }
    
    public E remove(int index){
	if(index == 0){
	    E ans = head.getData();
	    head = head.getNext();
	    return ans;
	}
	Node<E> tmp = head;
	int i = 0;
	while(i<index - 1){
	    tmp = tmp.getNext();
	    i++;
	}
	E ans = tmp.getData();
	tmp.setNext(tmp.getNext().getNext());
	return ans;
	
    }
    
    public int find(E s){
	Node<E> tmp = head;
	int i = 0;
	while(tmp != null){
	    if(tmp.getData().equals(s)){
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
