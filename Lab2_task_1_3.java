package Lab2;

public class Lab2_task_1_3 {
	public static void printPascalTriangle(int row) {
		
	}
		public static int[] getPascalTriangle(int n) {
			if(n==1) {
				return new int[] {1};
			}else {
			int []n1 = getPascalTriangle(n-1);
			return generateNextRow(n1); 
		}
	}

	public static int[] generateNextRow(int[] prevRow) {
		int[]array = new int[prevRow.length+1];
		array[0] = array[array.length-1]=1;
		for(int i=0; i<prevRow.length-1; i++) {
			array[i+1] = prevRow[i]+prevRow[i+1];
	}
		
	return array;
	}
	public static void printArray(int []array) {
		for(int i:array) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		int []prevRow = {1,2,1};
		printArray(generateNextRow(prevRow));
		System.out.println();
		printArray(getPascalTriangle(4));
	}

}
