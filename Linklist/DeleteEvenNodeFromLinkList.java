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

class DeleteEvenNodeFromLinkList 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

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
		deleteEvenNode(head);
	}

	public static void deleteEvenNode(Node head){
		if(head == null || head.next == null){
			return head;
		}
		
		Node curr = head;
		
	}

	public static void printList(Node head){
		if(head == null){
			return;
		}
		
		Node curr = head;

		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}
