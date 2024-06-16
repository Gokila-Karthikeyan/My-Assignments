package assignment.week1.day2;

import java.util.Arrays;

public class FindMissingElement {
	public static int findMissing(int[] arr) {
        Arrays.sort(arr); 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1; 
            }
        }
        
       return arr.length + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 6, 7};
        int missing = findMissing(arr);
        System.out.println("Missing Number: " + missing);
    }
}
