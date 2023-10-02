package Lab2;

public class Lab2_task_1_1 {
	//S(n) = 1-2+3-4+...+((-1) ^ (n+1)).n, n>0
	public static int getSn1(int n) {
		if (n == 1 ) {
			return 1;
		}else { 
				return (int) (getSn1(n-1) + Math.pow(-1, n+1)*n);
			
		
		}
	}
		//S(n) = 1+1.2+1.2.3+...+1.2.3...n, n>0
		public static int sum(int n) {
			int sum = 1;
			for (int i = n; i>=1; --i) {
				sum*=i;
				
			}
			return sum;
			
		}
		public static int getSn2(int n) {
			if(n==1) {
				return 1;
				
		}else {
			return (int) (getSn2(n-1)+ sum(n));
			
		}
			
	}
		// S(n)=1^2+2^2+3^2+....+n^2 ,   n>0
		public static int getSn3(int n ) {
			if(n==1) {
				return(int) Math.pow(1, 2);
				
			}else {
				return (int) (getSn3(n-1)+Math.pow(n, 2));
				
			}
		}
		
		// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n),  n>=0
		public static double getSn4(int n) {
			if(n==0) {
				return 1;
				
			}else {
				return getSn4(n-1)+1/p(n);
				
			}
		}
		private static double p(int n) {
			// TODO Auto-generated method stub
			double s=1;
			for(int i =1; i<=n; i++) {
				s*= i*2;
			}
			return s;
		}
		public static void main(String[] args) {
			System.out.println(Lab2_task_1_1.getSn1(2));
			System.out.println(Lab2_task_1_1.getSn2(4));
			System.out.println(Lab2_task_1_1.getSn3(3));
			System.out.println(Lab2_task_1_1.getSn4(2));
		}

}
