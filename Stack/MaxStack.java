import java.util.*;

class MyStack
{
	Stack<Integer> st = new Stack<Integer>();
	int maxEle;

	void getMax(){
		if(st.isEmpty()){
			System.out.println("Stack is empty");
		}
		else{
			System.out.println(maxEle);
		}
	}

	void peek(){
		if(st.empty()){
			System.out.println("Stack is empty");
			return;
		}

		int t = st.peek();
		System.out.print("Top Most Element is: ");

		if(t > maxEle){
			System.out.println(maxEle);
		}
		else{
			System.out.println(t);
		}
	}

	void pop(){
		if(st.empty()){
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.print("Top Most Element Removed: ");
		int t = st.peek();
		st.pop();

		if(t > maxEle){
			System.out.print(maxEle + "\n");
			maxEle = 2 * maxEle - t;
		}
		else{
			System.out.print(t + "\n");
		}
	}

	void push(int x){
		if(st.isEmpty()){
			maxEle = x;
			st.push(x);
			System.out.print("Number Inserted: " + x + "\n");
            return;
		}

		if(x > maxEle){
			st.push(2*x - maxEle);
			maxEle = x;
		}


		else{
			st.push(x);
		}
		System.out.print("Number Inserted: " + x + "\n");
	}
}

class MaxStack 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		MyStack s = new MyStack();
		s.push(3);
		s.push(5);
		s.getMax();
		s.push(7);
		s.push(19);
		s.getMax();
		s.pop();
		s.getMax();
		s.pop();
		s.peek();
	}
}
