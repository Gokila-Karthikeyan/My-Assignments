package assignment;

public class IntersectionOfNumbers {
		public static void main(String[] args) {
	        int[] array1 = {3, 2, 11, 4, 6, 7};
            int[] array2 = {1, 2, 8, 4, 9, 7};
	        System.out.println("Intersection of numbers:");
	        for (int num1 : array1) {
	            for (int num2 : array2) {
	                if (num1 == num2) {
	                    System.out.println(num1);
	                    break;
	                }
	            }
	        }
	    }
	}
