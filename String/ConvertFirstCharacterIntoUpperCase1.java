import java.util.*;

class ConvertFirstCharacterIntoUpperCase1 
{
	public static void main(String[] args) 
	{
		String str = "my name is ashit kumar sinha";
		char[] arr = str.toCharArray();
		boolean flag = true;

		for(int i=0; i<arr.length; i++){
			if(Character.isLetter(arr[i])){
				if(flag){
					arr[i] = Character.toUpperCase(arr[i]);
					flag = false;
				}
			}
			else{
				flag = true;
			}
		}
		System.out.println(String.valueOf(arr));
	}
}