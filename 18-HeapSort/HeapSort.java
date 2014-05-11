public class HeapSort{

    public void makeHeap(int[] in, int a){
	int[] tmp = new int[a + 1];
	int index = 1;
	for (int i = 0; i < a; i++){
	    tmp[index] = in[i];
	    int count = index;
	    while(tmp[count] > tmp[count/2] && count/2 != 0){
		int temp = tmp[count];
		tmp[count] = tmp[count/2];
		tmp[count/2] = temp;
		count = count/2;
	    }
	    index ++;
	    
	}
	for(int i = 1; i < tmp.length; i++){
	    in[i-1] = tmp[i];
	}
	
    }    
    
    

   public void heapSort(int[] in){
       int end = in.length;
       //Make the initial array a heap
       makeHeap(in,end);
       /*
       for(int i = 0; i < in.length; i++){
	   System.out.print(in[i]);
       }
       System.out.println();
       */
       while (end > 0){
	   //Moves largest element to the end of the heap
	   int temp = in[0];
	   in[0] = in[end - 1];
	   in[end - 1] = temp;
	   end--;
	   //Places the max element back on top of the heap
	   makeHeap(in,end);
       }
   }
}
