import java.util.*;
import java.io.*;

public class MyStack{
    private Node top;
    
    //Constructor 1
    public MyStack(){
	top = null;
    }

    //push 2
    public void push(String s){
	Node tmp = new Node(s);
	tmp.setNext(top);
	top = tmp;
    }
    //pop
    public String pop(){
	String s = top.getData();
	top = top.getNext();
	return s;
    }
    //peek
    public String peek(){
	return top.getData();
    }
    //isEmpty
    public boolean isEmpty(){
	return top == null;
    }
    //toString 3
    public String toString(){
	String s = "";
	Node tmp = top;
	while (tmp != null){
	    s += tmp.getData() + ", ";
	    tmp = tmp.getNext();
	}
	return s;
    }
}