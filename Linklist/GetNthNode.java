class Node
{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}

class GetNthNode
{
	public static void main(String[] args) 
	{
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		printList(head);
		System.out.println(getNthNodeFromList(head, 2));
		//addAtIndex(head, 2, 10);
		printList(head);
	}

	public static int getNthNodeFromList(Node head, int k){
		if(head == null){
			return 0;
		}

		Node temp = head;
		int count = 0;

		while(temp != null){
			if(count == k){
				break;
			}
			count++;
			temp = temp.next;
		}
		//temp.next = new Node(10);
		return temp.data;
	}

	static void printList(Node head){
		if(head == null){
			return;
		}
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}
}
