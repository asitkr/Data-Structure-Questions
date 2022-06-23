import java.util.Stack;

class Print_Stack
{
	public static void main(String[] args) 
	{
		Stack<Integer> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		st1.push(100);
		st2.push('$');

		System.out.println(st1.pop() + " " + st2.pop());
	}
}
