class Node{
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class ReverseDLL 
{
	public static void main(String[] args) 
	{
		DLL ll = new DLL();

		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.print();
		ll.reverse();
		ll.print();
		System.out.println("Hello World!");
	}
}

class DLL
{
	Node head = null;
	Node tail = null;

	void add(int data){
		if(head == null){
			head = new Node(data);
			tail = head;
		}
		else{
			tail.next = new Node(data);
			tail.next.prev = tail;
			tail = tail.next;
		}
	}

	void reverse(){
		Node curr = head;
		Node next = null;
		Node prev = null;
		tail = head;

		while(curr != null){
			next = curr.next;
			curr.next = curr.prev;
			curr.prev = next;
			prev = curr;
			curr = next;
		}

		head = prev;
	}

	void print(){
		if(head == null){
			System.out.println("List is empty");
		}
		else{
			Node temp = head;

			while(temp != null){
				System.out.print(temp.data);
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
