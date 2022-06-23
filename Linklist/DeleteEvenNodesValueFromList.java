class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class DeleteEvenNodesValueFromList
{
	public static void main(String[] args) 
	{
		DLinkList ll = new DLinkList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.print();
	}
}

class DLinkList
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

	void print(){
		if(head == null){
			System.out.println("List is Empty");
			return;
		}

		Node curr = head;

		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}
