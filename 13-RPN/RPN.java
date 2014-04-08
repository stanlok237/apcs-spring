import java.util.*;
import java.io.*;

public class RPN{
    
    public static void main(String[]args){

	Scanner scan = new Scanner(System.in);
	MyStack stack =  new MyStack();
	String next;
	
	while(true){
	    
	    next = scan.next();
	    //System.out.println(next);

	    if(next.equals("+")){
		int a = stack.pop();
		int b = stack.pop();
		stack.push(a + b);
		System.out.println(stack);
		//System.out.println("add");
	    }
	    else if(next.equals("-")){
		int a = stack.pop();
		int b = stack.pop();
		stack.push(a - b);
		System.out.println(stack);
		//System.out.println("sub");
	    }
	    else if(next.equals("/")){
		int a = stack.pop();
		int b = stack.pop();
		stack.push(a / b);
		System.out.println(stack);
		//System.out.println("div");
	    }
	    else if(next.equals("*")){
		int a = stack.pop();
		int b = stack.pop();
		stack.push(a * b);
		System.out.println(stack);
		//System.out.println("mul");
	    }
	    else{
		try{
		    int tmp = Integer.parseInt(next);
		    stack.push(tmp);
		    System.out.println(stack);
		}
		catch(NumberFormatException e){
		    System.out.println("Invalid Input");
		}
		catch(Exception e){
		    e.printStackTrace();
		}
	    }
	}
	    

    }
}