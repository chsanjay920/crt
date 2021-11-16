import java.util.*;

class asc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++){
			int c = s.charAt(i);
			System.out.println("Ascii of "+s.charAt(i)+"  is : "+c);
		}
	
	}
}