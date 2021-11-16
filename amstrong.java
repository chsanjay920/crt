import java.util.*;
import java.lang.Math;
class ams{
	static boolean isArmstrong(int n){
		int temp = n;
		int sum = 0;
		int count = (int)Math.log10(n)+1;
		while(temp!=0)
		{
			int k = temp%10;
			sum = sum + (int)Math.pow(k,count);
			temp = temp/10;
		}
		if(sum == n)
			return true;
		else
			return false;
			
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		for(int i=n;i>0;i--)
		{
			System.out.print(i+" ");
			if(isArmstrong(i)){
			System.out.print(i+"is armstrong"); 
			break;	
			}
		}
		//System.out.print(isArmstrong(153));
	}	
}