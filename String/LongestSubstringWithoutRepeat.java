class LongestSubstringWithoutRepeat
{
	public static void main(String[] args) 
	{
		String s = "abcacbbb";
		String str = "";

		for(int i=0; i<s.length()-1; i++){
			for(int j=i+1; j<s.length(); j++){
				if(s.charAt(i) != s.charAt(j)){
					//str = str + s.charAt(i);
					System.out.print(s.charAt(i) + " ");
				}
				//System.out.println();
			}
		}

		//System.out.println(str);
	}
}
