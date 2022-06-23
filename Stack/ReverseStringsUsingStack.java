import java.util.Stack;

class ReverseStringsUsingStack
{
	public static void main(String[] args) 
	{
		String str = "hello";
		String s = "";

		Stack<Character> st = new Stack<>();

		for(int i=0; i<str.length(); i++){
			st.push(str.charAt(i));
		}

		while(!st.isEmpty()){
			s += st.pop();
		}

		System.out.println(s);
	}
}
