import java.util.*;

class fib
{
	static int fibb(int n){
		if(n <= 1)
			return n;
		else{
			return fibb(n-1)+fibb(n-2);
		}
	}
	public static void main(String args[])
	{
		System.out.print("enter a number : " );
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibb(n));
	}
}