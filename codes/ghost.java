import java.util.*;

class ghost{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		String s;
		int a = sc.nextInt();
		s = (a%4==0 && a%100!=0)?"leap year":(a%400==0)?"leap year":"not leap year";
		System.out.println(s);

	}
}