package lecture21;

public class LinkedList {

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
		if (size == 0) {
			head = n;
			tail = n;
			size++;
		} else {
			n.next = head;
			head = n;
			size++;
		}
	}

	public void addlast(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head = n;
			tail = n;
			size++;
		} else {
			tail.next = n;
			tail = n;
			size++;
		}
	}

	public void addAtAnyposition(int data, int pos) {
		if (pos == 0) {
			addfirst(data);
		} else if (pos == size) {
			addlast(data);
		} else {
			Node temp = head;
			for (int i = 0; i < pos - 1; i++) {
				temp = temp.next;
			}

			Node n = new Node(data);
			Node x = temp.next; // next wale ka data

			temp.next = n;
			n.next = x;
			size++;
		}
	}

	public void removeFirst() {
		if (size == 0) {
			System.out.println("Linked List Does not exist.");
			return;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		return;

	}

	public void removeLast() {
		if (size == 0) {
			System.out.println("Linked List is Empty.");
		} else {
			Node temp = head;
			for (int i = 0; i < size - 2; i++) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
			size--;

		}
	}
	
	public void removeAnyPosition(int pos){
		if(pos==0) {
			removeFirst();
		}else if(pos==size){
			removeLast();
		}else {
			Node temp=head;
			for(int i =0; i<pos-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
			size--;
			
		}
		
		
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addfirst(10);
		list.addfirst(20);
		list.addlast(50);
		list.addlast(70);
		list.addAtAnyposition(1000, 3);
		list.removeFirst();
		list.removeLast();
		list.addlast(6);
		list.removeAnyPosition(2);
		list.print();
		int size=list.size;
		System.out.println(size);

	}
}
