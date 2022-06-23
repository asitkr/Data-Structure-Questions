class ConvertFirstCharacterIntoUpperCase 
{
	public static void main(String[] args) 
	{
		//String str = "my name is ashit kumar sinha";
		String str = "name";
		String firstChar = str.substring(0, 1);
		String remaingChar = str.substring(1, str.length());

		firstChar = firstChar.toUpperCase();

		System.out.println(firstChar + remaingChar);
	}
}
