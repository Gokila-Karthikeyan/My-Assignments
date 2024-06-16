package assignment.week1.day2;

public class PalindromeCheck {
	public static void main(String[] args) {
        
        int number1 = 121;
        int number2 = 12345;
        checkPalindrome(number1);
        checkPalindrome(number2);
    }

    public static void checkPalindrome(int num) {
        int input = num;
        int output = 0; 
        int temp = input;
        while (temp != 0) {
            int rem = temp % 10;
            output = output * 10 + rem;
            temp = temp / 10;
        }
        if (input == output) {
            System.out.println(input + " :It is a Palindrome");
        } else {
            System.out.println(input + " :It is not a Palindrome");
        }
    }
}