class Node
{
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data = data;
	}
}

class DoublyLinkedListCreate
{
	public static void main(String[] args) 
	{
		doubleLinklist ll = new doubleLinklist();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.print();
		System.out.println("Hello World!");
	}
}

class doubleLinklist
{
	Node head = null;
	Node tail = null;
	Node prev = null;

	void add(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = head;
			head.prev = null;
			tail.next = null;
		}
		else{
			tail.next = newNode;
			tail.next.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	void print(){
		Node curr = head;

		if(head == null){
			System.out.println("Linked List is empty ");
			return;
		}

		while(curr != null){
			System.out.print(curr.data + " " );
			curr = curr.next;
		}

		System.out.println();
	}
}
