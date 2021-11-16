import java.util.*;
class capgemini{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String k = sc.next();
		for(int i=Integer.parseInt(n)-1; i > 0;i--)
		{
			if(!String.valueOf(i).contains(k)){
				System.out.println(i);
				break;
			}
		}
	}
}