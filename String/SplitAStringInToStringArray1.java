class SplitAStringInToStringArray1 
{
	public static void main(String[] args) 
	{
		String str = "i like apple";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				System.out.println();
				continue;
			}
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
