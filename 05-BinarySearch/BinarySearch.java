import java.util.*;
import java.io.*;

public class BinarySearch{

    public int rbsearch(int n, int[] L){
	return rbsearch(n, L, 0, L.length - 1);
    }
    
    public int rbsearch(int n, int[] L, int bot, int top){

	int middle = (bot + top) / 2;
	
	if(top <= bot){
	    if(L[middle] == n){
		return middle;
	    }
	    return -1;
	}
	
	else if(L[middle] < n){
	    bot = middle + 1;
	    return rbsearch(n,L,bot,top);
	}
	else if(L[middle] > n){
	    top = middle - 1;
	    return rbsearch(n,L,bot,top);
	}
	return -1;
    }

    public int ibsearch(int n, int [] L){
	int middle = L.length / 2;
	int top = L.length - 1;
	int bot = 0;

	while (bot <= top){
	    if(L[middle] == n){
		return middle;
	    }
	    
	    if(L[middle] > n){
		top = middle - 1;
		middle = (bot + top)/2;
	    }
	    else{
		bot = middle + 1;
		middle = (bot + top)/2;
	    }
	}
	return -1;
    }
	    
}