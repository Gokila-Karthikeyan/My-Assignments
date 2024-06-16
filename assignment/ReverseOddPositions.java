package assignment;

public class ReverseOddPositions {
	public static void main(String[] args) {
        String test = "I am a software tester";
        String[] words = test.split("\\s+");
        
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) { 
                System.out.print(words[i] + " ");
            } else { 
                String reversedWord = reverseWord(words[i]);
                System.out.print(reversedWord + " ");
            }
        }
    }
    
    private static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        
        return new String(charArray);
    }

}
