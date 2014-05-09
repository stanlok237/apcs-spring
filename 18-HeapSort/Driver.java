public class Driver{

    public static void main(String[]args){

	HeapSort heap = new HeapSort();

	int[] test = {1,4,6,7,8,3,9};
	heap.heapSort(test);
	for(int i = 0; i < test.length; i++){
	    System.out.println(test[i]);
	}
    }
}