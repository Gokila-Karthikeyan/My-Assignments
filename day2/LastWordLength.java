package week3.day2;

public class LastWordLength {
	public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length != 0) {
                    break;
                }
            } else {
                length++;
            }
        }
        
        return length;
    }
    public static void main(String[] args) {
        LastWordLength solution = new LastWordLength();
        System.out.println(solution.lengthOfLastWord("Hello World")); 
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); 
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy")); 
    }
}
