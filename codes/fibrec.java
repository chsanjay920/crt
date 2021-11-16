import java.util.*;

class fibrec{
    //0 1 1 2 3 5 8 13 21 34 55 89 144
    //0 1 2 3 4 5 6  7  8  9  10 11 12
    static int fib(int n){
        if(n<=1)
            return n;
        else
            return fib(n-1)+fib(n-2);

    }
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));

	}
}
