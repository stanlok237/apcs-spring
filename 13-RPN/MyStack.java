import java.util.*;
import java.io.*;

public class MyStack{
    private int[] list;
    private int top;
    //Constructor 
    public MyStack(){
	top = 0;
	list = new int[10];
    }

    //push 2
    public void push(int s){
	/*
	Node tmp = new Node(s);
	tmp.setNext(top);
	top = tmp;
	*/
	if(top == list.length){
	    int[] tmp = new int[list.length * 2];
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
    public int pop(){
	int s = list[top - 1];
	//System.out.println(top);
	list[top - 1] = 0;
	top--; 
	return s;
    }
    //peek
    public int peek(){
	return list[top - 1];
    }
    //isEmpty
    public boolean isEmpty(){
	//System.out.println(list[0]==null);
	return list[0] == 0;
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