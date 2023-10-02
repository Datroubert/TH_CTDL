package Lab2;

public class Lab2_task_1_2 {
	public static int getFibonacci(int n) {
		if(n==1) {
			return 0;
			
		}else if (n==2) {
			return 1;
			
		} else {
			return getFibonacci(n-2) + getFibonacci(n-1);
			
		}
	}
	// This method is used to display a Fibonaccci series based on 
	// the parameter n. Ex. n=10 ==> 0 1 1 2 3 5 8 13 21 34
		public static void printFibonacci(int n) {
			for(int i = 0; i<n; i++) {
				System.out.println(getFibonacci(i) + "");
			
		}
	}
		public static void main(String[] args) {
			System.out.println(Lab2_task_1_2.getFibonacci(6));
		}

}
