package assignment;

import java.util.ArrayList;
import java.util.List;

public class ReverseCollection {
	public static void main(String[] args) {
        String[] elements = {"HCL", "Wipro", "Aspire Systems", "CTS"};
        List<String> list = new ArrayList<String>();
        for (String element : elements) {
            list.add(element);
        }
        System.out.print("Reversed Collection: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}
