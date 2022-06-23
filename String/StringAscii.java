class StringAscii 
{
	public static void main(String[] args) 
	{
		String s = "Hello World";

		String str = s.toLowerCase();

		for(int i=0; i<str.length(); i++){
			int ascii = str.charAt(i) - 'a';
			System.out.print(ascii + " ");
		}
	}
}
