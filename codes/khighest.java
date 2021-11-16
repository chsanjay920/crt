import java.util.*;
//do this without using inbuilt functions
//use log,pow,counts
class asc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String k = sc.next();
		for(int i=Integer.parseInt(s);i>=0;i--){
				if(!(String.valueOf(i).contains(k))) //String.valueOf converts any to string
				{	
					System.out.println(i);
					break;
				}
		}
	}
}