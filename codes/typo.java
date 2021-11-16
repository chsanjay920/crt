import java.util.*;

class typo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char s = sc.nextLine().charAt(0);
		int asc = s;
		System.out.println("ASCII  : "+asc);
	}
}