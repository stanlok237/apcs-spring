import java.util.*;
import java.io.*;

public class QuickSelect{

    //Can't get Partitioning of the Array Correct

    public int quickselect(int[] a, int k){
	return quickselect(a,k,0,a.length - 1);
    }

    public int quickselect(int[] a, int k, int low, int high){
	//int middle = (low + high)/2;
	//int pivot = a[middle];
	
	Random r = new Random();
	int pivotIndex = low + r.nextInt(high - low + 1);

	int wall = low;
	int pivot = a[pivotIndex];
	
	//System.out.println( "\nMiddle: " + middle + " Pivot: " + pivot + " Low: " + low + " High: " + high);
	if(low >= high){
	    return a[k];
	}
	else{
	    //int[] temp = new int[a.length];
	    //    int wall = 0;
	    int temp = a[high];
	    a[high] = pivot;
	    a[pivotIndex] = temp;
	    //int count2 = 0;
	    //  System.out.println("Pivot: " + pivot);
	    for(int i = low; i < high; i++){
		for(int j = 0; j < a.length; j++){
		  System.out.print(a[j] + " ");
		}
		System.out.println();
		/*
		if (a[i] < pivot){
		    temp[low + count] = a[i];
		    count++;
		}
		else if(a[i] > pivot){
		    temp[high - count2] = a[i];
		    count2++;
		    }*/
		if(a[i] > pivot){
		    temp = a[wall];
		    a[wall] = a[i];
		    a[i] = temp;
		    wall++;
		}
		temp = a[wall];
		a[wall] = pivot;
		a[high] = temp;
		/*
		else{
		    System.out.println("yes");
		    temp[middle] = pivot;
		    //System.out.println(temp[i]);
		    }*/
	    }
	    //for(int i = 0; i < temp.length; i++){
	    //	 System.out.print(temp[i] + " ");
	    //}
	    //System.out.println();
	    //System.out.println("Middle: " +  middle);
	    if(wall < k){
		low = pivotIndex + 1;
		return quickselect(a,k,low,high);
	    }
	    else if(wall > k){
		high = pivotIndex - 1;
		return quickselect(a,k,low,high);
	    }
	    else{
		return a[k];
		
	    }
	 
	}
    }

}