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

class FindKthNodeFromEnd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

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
		System.out.println(findKthNodeFromLast(head, k));
	}

	public static int findKthNodeFromLast(Node head, int k){
		if(head == null){
			return 0;
		}

		Node temp = head;
		Node curr = head;

		 while(k > 1){
			temp = temp.next;
			k--;
		 }

		 while(temp.next != null){
			temp = temp.next;
			curr = curr.next;
		 }

		 return curr.data;
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
