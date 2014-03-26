import java.util.*;
import java.io.*;

public class MyLLIterator<E> implements Iterator <E>{

    private Node<E> currentNode;

    public MyLLIterator<E>(Node n){
	currentNode = n;
    }

    public boolean hasNext(){
	if(currentNode.getNext() != null ){
	    return true;
	}
	return false;
    }

    public E next(){
	E ans = currentNode.getData();
	currentNode = currentNode.getNext();
	return ans;
    }

    public void remove(){
    }

}