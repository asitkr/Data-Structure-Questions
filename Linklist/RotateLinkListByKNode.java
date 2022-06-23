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

class RotateLinkListByKNode 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Node SIze");
		int nodeSize = sc.nextInt();

		System.out.println("Enter a number want to rotate the node");
		int k = sc.nextInt();

		System.out.println("Enter node of Node size");

		Node head = null;
		Node temp = null;

		for(int i=0; i<nodeSize; i++){
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
		head = rotateByK(head, k);
		printList(head);
	}

	public static Node rotateByK(Node head, int k){
		if(head == null){
			return head;
		}

		int i = 0;

		while(i < k){
			Node temp1 = head;
			Node temp2 = head;

			head = head.next;

			while(temp1.next != null){
				temp1 = temp1.next;
			}

			temp1.next = temp2;
			temp2.next = null;

			i++;
		}

		return head;
	}

	public static void printList(Node head){
		if(head == null){
			return;
		}

		Node curr = head;

		while(curr != null){
			System.out.print(curr.data + " " );
			curr = curr.next;
		}
		System.out.println();
	}
}
