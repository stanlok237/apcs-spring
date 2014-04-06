import java.util.*;
import java.io.*;

public class MyStack{
    private String[] list;
    private int top;
    //Constructor 
    public MyStack(){
	top = 0;
	list = new String[10];
    }

    //push 2
    public void push(String s){
	/*
	Node tmp = new Node(s);
	tmp.setNext(top);
	top = tmp;
	*/
	if(top == list.length){
	    String[] tmp = new String[list.length * 2];
	    for(int i = 0; i < list.length; i++){
		tmp[i] = list[i];
	    }
	    list = tmp;
	}
	list[top] = s;
	top++;
	//System.out.println(top);
    }
    //pop
    public String pop(){
	String s = list[top - 1];
	//System.out.println(top);
	list[top - 1] = null;
	top--; 
	return s;
    }
    //peek
    public String peek(){
	return list[top - 1];
    }
    //isEmpty
    public boolean isEmpty(){
	//System.out.println(list[0]==null);
	return list[0] == null;
    }
    //toString 3
    public String toString(){
	String s = "";
	/*Node tmp = top;
	while (tmp != null){
	    s += tmp.getData() + ", ";
	    tmp = tmp.getNext();
	    }*/
	for(int i = 0; i < top; i++){
	    s += list[i] + ", ";
	}
	return s;
    }
}