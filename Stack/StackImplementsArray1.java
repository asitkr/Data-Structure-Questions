class StackImplementsArray1
{
	int capacity;
	int top;
	int[] arr;
	StackImplementsArray1(){
		capacity = 10;
		top = -1;
		arr = new int[capacity];
	}

	void push(int data){
		if(top == capacity-1){
			System.out.println("Overflow");
		}
		top++;
		arr[top] = data;
	}

	int pop(){
		if(top == -1){
			System.out.println("Under flow");
		}

		int res = arr[top];
		top--;
		return res;
	}

	int peek(){
		if(top == -1){
			System.out.println("Under flow");
		}

		return arr[top];
	}

	boolean isEmpty(){
		return (top == -1);
	}

	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		StackImplementsArray1 st = new StackImplementsArray1();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}
