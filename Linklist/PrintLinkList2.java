import java.util.*;

class Node
{
	int x;
	Node next;
	Node(int x){
		this.x = x;
	}
}

public class PrintLinkList2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node head = null;
		Node temp = null;

		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			//creating node
			if(head == null){
				head = new Node(x);
				temp = head;
			}
			else{
				temp.next = new Node(x);
				temp = temp.next;
			}
		}

		//Print LinkList
		printList(head);
		head = addAtFirst(head, 0);
		printList(head);
		addAtLast(head, 99);
		printList(head);
		head = deleteFromFirst(head);
		printList(head);
		deleteFromLast(head);
		printList(head);
	}

	//Delete from Last
	public static void deleteFromLast(Node head){
		if(head == null){
			return;
		}
		else{
			Node temp = head;
			Node prev = null;
			while(temp.next != null){
				prev = temp;
				temp = temp.next;
			}

			prev.next = null;
		}
	}

	//Delete from First Place
	public static Node deleteFromFirst(Node head){
		if(head == null){
			return head;
		}
		else{
			head = head.next;

			return head;
		}
	}

	//Add node at first Place
	public static Node addAtFirst(Node head, int k){
		if(head == null){
			return new Node(k);
		}
		else{
			Node temp = new Node(k);
			temp.next = head;
			head = temp;

			return head;
		}
	}

	//Add node at last place
	public static void addAtLast(Node head, int k){
		Node temp = head;
		if(temp == null){
			head = new Node(k);
		}

		else{
			while(temp.next != null){
				temp = temp.next;
			}

			temp.next = new Node(k);
		}
	}

	//Print Linklist
	public static void printList(Node head){
		if(head == null){
			return;
		}

		while(head != null){
			System.out.print(head.x + " ");
			head = head.next;
		}

		System.out.println();
	}
}
