public class BST{

    public class Node {
	private int data;
	private Node left,right;

	// write all necessary constructors and get/set methods
	
	public Node(int n){
	    data = n;
	    left = null;
	    right = null;
	}

	public void setLeft(Node n){
	    left = n;
	}
	
	public void setRight(Node n){
	    right = n;
	}
	
	public Node getLeft(){
	    return left;
	}

	public Node getRight(){
	    return right;
	}

	public void setData(int n){
	    data = n;
	}

	public int getData(){
	    return data;
	}
    }

    
    private Node root;
    
    public BST() {
	root = null;
    }
    
    public Node search(int x){ 
	Node tmp = root; 
	while(tmp!=null && tmp.getData()!=x){ 
	    if(x < tmp.getData()) 
		tmp = tmp.getLeft(); 
	    if(x > tmp.getData()) 
		tmp = tmp.getRight(); 
	} 
	return tmp; 
    } 

    public void insert(int x){
	Node tmp = root;
	Node back = root;
	Node leaf = new Node(x);
	if (tmp == null){
	    tmp = leaf;
	    root = tmp;
	}
	while(tmp != null){
	    if(tmp.getData() < x){
		back = tmp;
		tmp = tmp.getRight();
	    }
	    else{
		back = tmp;
		tmp = tmp.getLeft();
	    }
	}
	if(x > back.getData()){
	    back.setRight(leaf);
	}
	else{
	    back.setLeft(leaf);
	}
    }
    public Node search2(int x){
	Node tmp = root;
	return search2(tmp, x);
    }
    
    public Node search2(Node c, int x){
	if(c == null){
	    return null;
	}
	else if(c.getData() == x){
	    return c;
	}
	else if(x > c.getData()){
	    return search2(c.getRight(),x);
	}
	else
	    return search2(c.getLeft(),x);
    }

}
	
