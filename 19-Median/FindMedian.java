public class FindMedian{

    private class Heap{
	//Max Heap
	public void makeMaxHeap(int[] in, int a){
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
	
	public void makeMinHeap(int[] in, int a){
	    
	    
    }
    