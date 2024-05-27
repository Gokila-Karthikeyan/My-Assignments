package week1.day2;

public class PrintDuplicates {
	    int[] num = {2, 5, 7, 7, 5, 9, 2, 3};

	    public void findAndPrintDuplicates() {
	        System.out.println("Duplicate values:");
	        for (int i = 0; i < num.length; i++) {
	            for (int j = i + 1; j < num.length; j++) {
	                if (num[i] == num[j]) {
	                    System.out.println(num[j]);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        PrintDuplicates printDuplicates = new PrintDuplicates();
	        printDuplicates.findAndPrintDuplicates();
	    }
	}
   



