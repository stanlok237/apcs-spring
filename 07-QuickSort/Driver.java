import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[]args){

	Random r = new Random();
	
	QuickSort quick = new QuickSort();

	int [] test = {3,41,23,12,5124,1235,12312,1,2,3,123,12357,1100,12,14,21};
	quick.quickSort(test);
	System.out.println();
	
	for(int i = 0; i < test.length; i++){
	    System.out.println(test[i]);
	}
	
    }
}