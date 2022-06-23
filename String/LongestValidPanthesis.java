import java.util.*;

class LongestValidPanthesis 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(maxLength(str));;
	}

	public static int maxLength(String str){
		Stack<Integer> st = new Stack<>();
		st.push(-1);

		int count = 0;
		int i = 0;

		while(i < str.length()){
			if(str.charAt(i) == '('){
				st.push(i);
			}
			else{
				if(!st.isEmpty()){
					st.pop();
				}
				if(!st.isEmpty()){
					count = Math.max(count, i-st.peek());
				}
				else{
					st.push(i);
				}
			}

			i++;
		}

		return count;
	}
}
