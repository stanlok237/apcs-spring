public class Driver{

    public static void main(String[]args){
	
	BST test = new BST();
	test.insert(1);
	test.insert(2);
	test.insert(100);
	System.out.println(test.search(1));
	System.out.println(test.search(2));
	System.out.println(test.search(100));
	System.out.println(test.search2(1));
	System.out.println(test.search2(2));
	System.out.println(test.search2(100));
	System.out.println(test.search(10002));
	System.out.println(test.search2(20013));
    }
}
