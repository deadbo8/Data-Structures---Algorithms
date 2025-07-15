package lecture21;


class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data =data;
		next = null;
	}
}

public class LinkedList_Demo1 {
	public static void main(String[] args) {
		Node n1= new Node(10);
		Node n2= new Node(7);
		Node n3= new Node(900);
		
		n1.next=n2;
		n2.next=n3;
		
		
		Node temp =n1;
		
		while(temp !=null) {
			System.out.println(temp.data+" ");
			temp= temp.next;
		}
		
	}
}
