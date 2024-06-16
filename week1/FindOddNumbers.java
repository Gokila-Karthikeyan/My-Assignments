package assignmengt.week1;

public class FindOddNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxRange = 10;
        System.out.println("Odd numbers from 1 to " + maxRange + ":");
        for (int i = 1; i <= maxRange; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
	}
}
