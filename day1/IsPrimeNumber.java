package week1.day1;

public class IsPrimeNumber {
	
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int number = 17; 
	        boolean prime =isPrime(number);
	        if (prime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

		
	}

