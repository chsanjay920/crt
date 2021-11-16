import java.util.*;

class pallandrom{
	static int reverse(int n)
	{
		int rev = 0;
		int t = n;
		while(t!=0){
			int r = t%10;
			rev = rev*10+r;
			t = t/10;
		}
		return rev;
	}
	static boolean ispallandrom(int n)
	{
		if(n == reverse(n))
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number");
		int n = sc.nextInt();
		if(ispallandrom(n))
		System.out.print(n+"is already number");
		else{
			while(!ispallandrom(n))
			{
				int rev = reverse(n);
				int sum = n + rev;
				System.out.println(n+" + "+rev+" = "+sum);
				n = sum;
			}
		}
	}	
}







