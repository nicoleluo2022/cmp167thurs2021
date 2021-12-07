
public class RecursionCh12 {
	/*public static int sum(int target) {
		if (target <=0) {
			return 0;
		}
		else
			return target + sum(target- 1);
	}*/
	/*public static int fib(int n) {
		if (n<=1)
			return n;
		else
			return fib(n-1) + fib(n-2);
	}*/
	public static void main(String [] args) {
		int n = 5;
		int result = factorial(n); //11
		System.out.println(result); //15
		//System.out.println(fib(6)); //8
	}
	//Write a recursive method that will calculate the product of all numbers from 1 up to a target (factorial)
	public static int factorial(int target) {
		if (target <=0) {
			return 1;
		}
		else
			return target * factorial(target - 1);
	}

}
