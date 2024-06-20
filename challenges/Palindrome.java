package challenges;

public class Palindrome {
	public boolean isPalindrome(String s) {
        StringBuilder normalized = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                normalized.append(Character.toLowerCase(c));
            }
        }
        int left = 0, right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }   
    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(s1));
        String s2 = "race a car";
        System.out.println(solution.isPalindrome(s2));
        String s3 = " ";
        System.out.println(solution.isPalindrome(s3)); 
    }
}
