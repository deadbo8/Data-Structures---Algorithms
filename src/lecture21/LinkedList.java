package lecture21;

public class LinkedList{


	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;
	Node tail;
	int size;

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	public void addfirst(int data) {
		Node n = new Node(data);
		if(size==0) {
			head=n;
			tail=n;
			size++;
		}else{
			n.next=head;
			head=n;
			size++;
		}
	}
	
	public void addlast(int data) {
		Node n = new Node(data);
		if(size==0) {
			head=n;
			tail=n;
			size++;
		}else{
			tail.next=n;
			tail=n;
			size++;
		}
	}
	
	public void addAtAnyposition(int data, int pos) {
		if(pos==0) {
			addfirst(data);
		}else if(pos==size) {
			addlast(data);
		}else {
			Node temp = head;
			for(int i =0; i<pos-1;i++) {
				temp=temp.next;
			}
			
			Node n = new Node(data);
			Node x = temp.next;  //next wale ka data
			
			temp.next=n;
			n.next=x;
			size++;
		}
	}
	

	
		public static void main(String[] args) {
			 LinkedList list = new LinkedList();
			
			list.addfirst(10);
			list.addfirst(20);
			list.addlast(50);
			list.addlast(70);
			list.addAtAnyposition(1000,3);
			list.print();
			
		}
}

