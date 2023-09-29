package Lab1;

public class Task1_1_removeDup {
	/*Task 1.1
	  * removes all duplicate elements from an array and returns a new array
	  * Input: 1 3 5 1 3 7 9 8
	  * Output: 1 3 5 7 9 8
	  */
	public static int removeDuplicates(int array[], int n) {
		if(n==0 || n==1 ) 
			return n;
		
		int j = 0;
		for (int i = 0; i< n-1; i++)
			if (array[i] != array[i+1])
				array[j++] = array[i];
				array[j++] = array[n-1];
				return j;
	}
	//Test
	public static void main(String[] args) {
		// removeDuplicates() method
				int array[] = {1,1,3,3,5,7,9,8};
				int n = array.length;
				
				n = removeDuplicates(array, n);
				for (int i = 0; i<n; i++)
			
					System.out.println(array[i] + "");
	}
}
