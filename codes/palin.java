import java.util.*;

//A number will be given .You have to add the reverse of the number to itself 
//if it becomes palindrome then print else again add reverse of prev sum
//do until you find the palindrome
class palin{
	static void revaddpalin(int n){
		if(checkpalin(n))
				System.out.println(n+" + "+rev " = "+sum);
		else{
			while(!checkpalin(n)){
				int rev = revnum(n);
				int sum = n+rev;
				System.out.println()
				n=sum;
		}
		
	}
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		revaddplan(n);
	}
}