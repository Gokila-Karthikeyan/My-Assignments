package week1.day1;

public class FibonacciSeries {
	
	    public static void generateFibonacci(int range) {
	        int num1 = 0, num2 = 1;
	        System.out.print("Fibonacci Series for range " + range + ": ");
	        System.out.print(num1);
	        if (range >= 1) {
	            System.out.print(", " + num2);
	        }
	        for (int i = 2; ; i++) {
	            int nextFib = num1 + num2;
	            if (nextFib > range) {
	                break;
	            }
	            System.out.print(", " + nextFib);
	            num1 = num2;
	            num2 = nextFib;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int range = 8; 
	        generateFibonacci(range);
	    }
	}
