import java.util.*;

class ReverseStringUsingStack
{
	public static void main(String[] args) 
	{
		String str = "hello";
		String s = "";

		Stack<Character> st = new Stack<>();

		int i = 0;
		while(i < str.length()){
			st.push(str.charAt(i));
			i++;
		}

		while(!st.isEmpty()){
			s = s + st.pop();
		}

		System.out.println(s);
	}
}
