package Lab1;

public class Task1_2_missingValue {
	// Input: 10 11 12 13 14 16 17 19 20 
	// Output: 15 18
	public static int getMissingValues(int[] array) {
        int n = array.length;
        int sum1 = ((n)*(n+1))/2;
        int sum2 = 0;
        for(int i=0; i<n ; i++)
          sum2 += array[i];
        return sum2 - sum1;
    }
    public static void main(String[] args)
    {
        int[] array = { 1, 2, 4, 5, 6 };
        System.out.println(getMissingValues(array));
    }
}