import java.util.*;
import java.io.*;

public class QuickSort{

    public Integer[] QuickSort(Integer [] arrayIn){
	
	if(arrayIn.length <= 1){
	    return arrayIn;
	}
	ArrayList<Integer> upper = new ArrayList<Integer>();
	ArrayList<Integer> lower = new ArrayList<Integer>();

	int middle = arrayIn.length / 2;
	int pivot = arrayIn[middle];

	//System.out.println(pivot);
	for(int i = 0; i < arrayIn.length; i++){
	    if(arrayIn[i] < pivot){
		//System.out.println("t1");
		lower.add(arrayIn[i]);
	    }
	    else{
		//System.out.println("t2");
		upper.add(arrayIn[i]);
	    }
	}
	
	Integer[] low = QuickSort(lower.toArray(new Integer[]{}));
	Integer[] high = QuickSort(upper.toArray(new Integer[]{}));
	
	for(int i = 0; i < low.length; i++){
	    System.out.print(low[i] + " ");
	}
	System.out.println();

	int count = 0;
	for(int i = 0; i < low.length; i++){
	    arrayIn[count] = low[i];
	    count++;
	}
	arrayIn[count] = pivot;
	count++;
	for(int i = 0; i < high.length; i++){
	    arrayIn[count] = high[i];
	    count++;
	}
	return arrayIn;
	
    }

    public int partition(int[] arrayIn, int left, int right){

	Random r = new Random();
	int pivotIndex = left + r.nextInt(right - left + 1);	

	int wall = left;
	int pivot = arrayIn[pivotIndex];

	int temp = arrayIn[right];
	arrayIn[right] = pivot;
	arrayIn[pivotIndex] = temp;

	for(int i = left; i < right; i++){
	    if(arrayIn[i] <= pivot){
		temp = arrayIn[wall];
		arrayIn[wall] = arrayIn[i];
		arrayIn[i] = temp;
		wall++;
	    }
	}
	//if(arrayIn[wall] > pivot){
	temp = arrayIn[wall];
	arrayIn[wall] = pivot;
	arrayIn[right] = temp;
	//	System.out.println("yes");
	
	//	}
	return wall;
    }

    public void quickSort(int[] arrayIn){
	quickSortHelp(arrayIn,0,arrayIn.length - 1);
    }

    public void quickSortHelp(int[] arrayIn, int low, int high){
	if(low >= high){
	    return;
	}

	int pivot = partition(arrayIn, low, high);
	quickSortHelp(arrayIn,low,pivot - 1);
	quickSortHelp(arrayIn,pivot+1,high);
    }
}