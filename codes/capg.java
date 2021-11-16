import java.util.*;

class capg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        int s=0;
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                s=s+i;
            }
        }
        if(n==s){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect numbeer");
        }
	}
}