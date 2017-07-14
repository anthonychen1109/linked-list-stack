
public class LinkedListStack {
	
	private Node Top;
	private int data;
	private int count;
	
	public LinkedListStack(int d){
		data = d;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}//if
		else{
			System.out.println(Top.data);
			Node temp = Top;
			Top = Top.getNext();
			return temp.getData();
		}//else
	}//pop method
	
	public Boolean isEmpty(){
		if (Top == null){
			return true;
		}//if
		else{
			return false;
		}//else
	}//isEmpty
	
    public void push(int d){
        Node newTop;
        if(isEmpty()){
        	newTop= new Node(d, null);
            Top = newTop;
            System.out.println("NULL");
            count++;
        }//if
        else{
            newTop= new Node(d,Top);
            Top = newTop;
            System.out.println("next node " + Top.getNext());
            count++;
        }//else
    }//push function
	
}//class
