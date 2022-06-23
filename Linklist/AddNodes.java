import java.util.*;

class Node
{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class AddNodes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();

		Node head = null;
		Node temp = null;

		for(int i=0; i<n; i++){
			int x = sc.nextInt();

			if(head == null){
				head = new Node(x);
				temp = head;
			}
			else{
				temp.next = new Node(x);
				temp = temp.next;
			}
		}

		printList(head);
		head = AddAtFirstPlace(head, k);
		printList(head);

		head = AddNode(head, m);
		printList(head);
	}

	public static Node AddNode(Node head, int m){
		if(head == null){
			head = new Node(m);
			return head;
		}

		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new Node(m);

		return head;
	}

	public static Node AddAtFirstPlace(Node head, int k){
		if(head == null){
			head = new Node(k);
			return head;
		}
		else{
			Node temp = new Node(k);
			temp.next = head;
			head = temp;

			return head;
		}
		
	}

	public static void printList(Node head){
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
