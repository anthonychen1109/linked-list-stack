
public class Node {
	
	public int data;
	public Node next;
	public Node previous;
	
	public Node(int d){
		data = d;
	}//Node constructor
	
	public Node(int d, Node n){
		data = d;
		next = n;
	}//node constructor
	
	public int getData(){
		return data;
	}//getData
	
	public Node getNext(){
		return next;
	}//getNext
	
}//class
