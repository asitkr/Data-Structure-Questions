import java.util.*;

class PatternPrinting 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

/*
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j + " ");
			}
			for(int j=i-1; j>=1; j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(j + " ");
			}
			for(int j=i-1; j>=1; j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}

*/
		int i=1;
		while(i <= n){
			for(int j=1; j<=i; j++){
				System.out.print(j + " ");
			}
			for(int j=i-1; j>=1; j--){
				System.out.print(j + " ");
			}
			System.out.println();
			i++;
		}

		i = n-1;
		while(i >= 1){
			for(int j=1; j<=i; j++){
				System.out.print(j + " ");
			}
			for(int j=i-1; j>=1; j--){
				System.out.print(j + " ");
			}
			System.out.println();
			i--;
		}
	}
}
