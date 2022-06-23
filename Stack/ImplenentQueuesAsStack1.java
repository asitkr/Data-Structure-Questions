import java.util.*;

class ImplenentQueuesAsStack1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);

		st.peek();

		System.out.print(st.pop() + " ");
		
		st.peek();
	}
}

class Stack
{
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	void push(int data){
		if(q1.isEmpty()){
			q1.add(data);
		}
		else{
			while(!q1.isEmpty()){
				q2.add(q1.peek());
				q1.poll();
			}

			q1.add(data);

			while(!q2.isEmpty()){
				q1.add(q2.peek());
				q2.poll();
			}
		}
	}

	void peek(){
		if(q1.isEmpty()){
			System.out.println("Stack is Empty ");
		}

		System.out.println(q1.peek());
	}

	int pop(){
		if(q1.isEmpty()){
			return -1;
		}

		while(!q1.isEmpty()){
			return q1.poll();
		}

		return -1;
	}
}
