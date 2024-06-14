package assignment;

import java.util.Arrays;

public class SecondFromLat {
	public static void main(String[] args) {
        int[] array = {3, 2, 11, 4, 6, 7};
        Arrays.sort(array);
        if (array.length >= 2) {
            int secondFromLast = array[array.length - 2];
            System.out.println("Second element from the last: " + secondFromLast);
        } else {
            System.out.println("Array does not have enough elements.");
        }
    }

}
