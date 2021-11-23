import java.util.*;

class subject{
	public String name;
	public int marks;
	public String grade;
	Scanner sc;
	public subject()
	{
		sc = new Scanner(System.in);
	}
	public void getname()
	{
		name = sc.next();
	}
	public void getmarks()
	{
		marks = sc.nextInt();
		if(marks > 45)
			grade = "p";	
		else
			grade = "f";
	}
	public void print()
	{
		System.out.print(name+" "+marks+" "+grade+"  |  ");
	}
	
}
public class a{

	public static void main(String args[])
	{	
		
		int total = 0;
		int n,highest=0;
		Scanner sc= new Scanner(System.in);
		String g="pass";
		System.out.println("Enter number of subjects:");
		n = sc.nextInt();
		subject x[] = new subject[n];
		System.out.println("Enter subject names:");
		for(int i=0;i<n;i++)
		{
			x[i] = new subject();	
			x[i].getname();	
		}
		System.out.println("Enter subject marks:");
		for(int i=0;i<n;i++)
		{	
			x[i].getmarks();	
		}
		for(int i=0;i<n;i++)
		{	
			x[i].print();	
		}
		for(int i=0;i<n;i++)
		{	
			if(x[i].grade.equals("f"))
			{
				g = "fail";
			}
			total = total + x[i].marks;	
			if(highest < x[i].marks)
			{
				highest = x[i].marks;
			}
		}
		float avg = total / n;
		if(avg > 80)
		g = "FIRST CLASS";
		else if(avg > 60)
		g = "second class"; 
		else
		g = "FAIL";
		System.out.println("TOTAL : "+total+" avg : "+avg+"OVERALLSTATUC : "+g);
		System.out.println("cd SCORES HIGHTES MARKS = "+highest);
	}
}



