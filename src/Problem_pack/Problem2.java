package Problem_pack;

import java.util.ArrayList;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int numElements = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // Read the elements
        for (int i = 0; i < numElements; i++) {
            list.add(scanner.nextInt());
        }

        // Read the number of queries
        int numQueries = scanner.nextInt();
        scanner.nextLine();  // consume the newline

        // Process queries
        for (int i = 0; i < numQueries; i++) {
            String queryType = scanner.nextLine();

            if (queryType.equalsIgnoreCase("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else if (queryType.equalsIgnoreCase("Delete")) {
                int x = scanner.nextInt();
                list.remove(x);
            }

            if (scanner.hasNextLine()) {
                scanner.nextLine();  // consume the newline
            }
        }

        // Print the modified list
        for (int num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
