package Lab1;

import java.util.Arrays;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		super();
		this.array = array;
	}
	
	/* Task 1.1
	 * Method mirror that outputs the contents of an array in a 
	 * reverse order like a mirror 
	 * Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	 */
	public static int[] mirror(int[] array) {
		int[] result = new int[array.length*2];
		for(int i = 0; i < array.length; i++) {
			result[i] = array[i];
			result[result.length -1-i] = array[i];
			
		}
		return result;
		
	}
	 
	// Test
	public static void main(String[] args) {
		// mirror() method
		int[] array = {1,2,3};
		int[] result = mirror(array);
		System.out.println(Arrays.toString(result));
		
	
	}

}
