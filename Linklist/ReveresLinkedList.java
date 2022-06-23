class Node
{
	char data;
	Node next;
	Node prev;
	Node(char data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class ReveresLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedListC ll = new LinkedListC();

		String str = "abcd";
		for(int i=str.length()-1; i>=0; i--){
			ll.add(str.charAt(i));
		}

		ll.print();
		//System.out.println("Hello World!");
	}
}

class LinkedListC
{
	Node head = null;
	Node tail = null;

	void add(char data){
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
			System.out.println("List is empty");
		}
		else{
			Node temp = head;

			while(temp != null){
				System.out.print(temp.data);
				temp = temp.next;
			}
		}
	}
}
