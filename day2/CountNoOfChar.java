package week3.day2;

public class CountNoOfChar {

	public static void main(String[] args) {
		String name="Gokila";
		
		int count=0;
		for (int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count++;

			}
		}
		System.out.println("The no of occurrences of 'a':"+count);
	}

}
