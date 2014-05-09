public class HeapSort{

    public void makeHeap(int[] in){
	int[] tmp = new int[in.length + 1];
	int index = 1;
	for (int i = 0; i < in.length; i++){
	    if(index ==0){
		tmp[index] = in[i];
		index++;
	    }
	    else {
		tmp[index] = in[i];
		int count = index;
		while(tmp[count] > tmp[count/2]){
		    int temp = tmp[count];
		    tmp[count] = tmp[count/2];
		    tmp[count/2] = temp;
		    count = count/2;
		}
		index ++;
	    }
	}
	for(int i = 1; i < tmp.length; i++){
	    in[i-1] = tmp[i];
	}

    }    
 


   public void heapSort(int[] in){

	int end = in.length;
	
	//Make the array a heap
	
	makeHeap(in);

	//Sort the heap here

    }
}