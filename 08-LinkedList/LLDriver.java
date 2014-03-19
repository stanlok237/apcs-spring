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



    }
}
