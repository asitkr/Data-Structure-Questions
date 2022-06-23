import java.util.*;

class Node
{
	int x;
	Node next;
	Node(int x){
		this.x = x;
	}
}

public class PrintLinkList1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Node head = null;
		Node temp = null;

		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			//Node newNode = new Node(x);

			if(head == null){
				//head = newNode();
				head = new Node(x);
				temp = head;
			}
			else{
				temp.next = new Node(x);
				temp = temp.next;
			}
		}

		printList(head);
	}

	public static void printList(Node head){
		if(head == null){
			return;
		}

		while(head != null){
			System.out.print(head.x + " " );
			head = head.next;
		}

		System.out.println();
	}
}
