import java.util.*;
import java.util.LinkedList;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        // creating new container
        Deque<Integer> deque = new LinkedList<>();
        List<String> operations = new ArrayList<>();
        // calculating all inputs into buffer
        for (int i = 0; i < n; i++) {
            operations.add(scanner.nextLine());
        }
        // operation buffer
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            switch (parts[0]) {
                case "1" -> {
                    // adding element from left
                    int x = Integer.parseInt(parts[1]);
                    deque.addFirst(x);
                }
                case "2" -> {
                    // adding element from left
                    int x = Integer.parseInt(parts[1]);
                    deque.addLast(x);
                }
                case "3" ->
                    // deleting element form left and writing it
                        System.out.println(deque.removeFirst());
                case "4" ->
                    // deleting element form right and writing it
                        System.out.println(deque.removeLast());
                }
            }
        scanner.close();
        }
}
