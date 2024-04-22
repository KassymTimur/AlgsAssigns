import java.util.ArrayList;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of arrays
        int numArrays = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();
        // Read the arrays
        for (int i = 0; i < numArrays; i++) {
            int size = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                array.add(scanner.nextInt());
            }
            arrays.add(array);
        }
        // Read the number of queries
        int numQueries = scanner.nextInt();
        // Process queries
        for (int i = 0; i < numQueries; i++) {
            int x = scanner.nextInt(); // x'th array
            int y = scanner.nextInt(); // y'th element
            // Check if the x'th array exists and y'th element is within bounds
            if (x <= numArrays && !arrays.get(x - 1).isEmpty() && y <= arrays.get(x - 1).size()) {
                System.out.println(arrays.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }

        }
    }
}
