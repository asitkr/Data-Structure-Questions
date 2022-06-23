class LongestCommonPrefixUsingWordMatching
{
	public static void main(String[] args) 
	{
		//String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		String arr[]  = {"apple", "ape", "april"};

		String ans = prefixString(arr);

		if(ans.length() > 0){
			System.out.println(ans);
		}
		else{
			System.out.println("Not found");
		}
	}

	public static String prefixString(String[] arr){
		String prefix = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			prefix = commonPrefix(prefix, arr[i]);
		}

		return prefix;
	}

	public static String commonPrefix(String str1, String str2){
		String ans = "";

		//for(int i=0, j=0; i<str1.length() && j<str2.length(); i++, j++){
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				break;
			}

			ans += str1.charAt(i);
		}

		return ans;
	}
}
