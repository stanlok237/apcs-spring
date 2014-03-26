public class LLDriver {
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();
	System.out.println(L);
	L.add("Sully");
	System.out.println(L);
	L.add("Mike");
	System.out.println(L);
	L.add("Randall");
	System.out.println(L);
	L.add("Boo");
	System.out.println(L);

	L.add(2,"Steve");
	
	System.out.println(L);
	System.out.println();

	
	System.out.println(L.get(0));
	System.out.println(L.get(1));
	System.out.println(L.get(2));
	System.out.println(L.get(3));
	System.out.println(L.get(4));
	
	
	System.out.println();
	System.out.println(L.set(0,"God"));
	System.out.println();

	System.out.println(L.get(0));
	System.out.println(L.get(1));
	System.out.println(L.get(2));
	System.out.println(L.get(3));
	System.out.println(L.get(4));

	System.out.println();
	System.out.println(L.remove(0));
	System.out.println();

	System.out.println(L.get(0));
	System.out.println(L.get(1));
	System.out.println(L.get(2));
	System.out.println(L.get(3));
	//System.out.println(L.get(4));
	
	System.out.println();
	System.out.println(L.find("Steve"));
	//System.out.println(L);
	System.out.println();

	System.out.println(L.length());
	
    }
}
