import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of students: ");
        int n = sc.nextInt();
        int[] students = new int[n];
        System.out.println("Enter students' preferences: ");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        System.out.println("Enter amount of samsa: ");
        int m = sc.nextInt();
        int[] samsas = new int[m];
        System.out.println("Enter samsa types: ");
        for (int i = 0; i < m; i++) {
            samsas[i] = sc.nextInt();
        }
        System.out.println("Unsatisfied students:" + countUnsatisfied(students, samsas));
    }
    public static int countUnsatisfied(int[] students, int[] samsas){
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students){
            queue.add(student);
        }
        int i = 0;
        while (!queue.isEmpty() && i< samsas.length){
            int student = queue.poll();
            if(student == samsas[i]){
                i++;
            }
            else{
                queue.add(student);
            }
        }
        return queue.size();
    }
}
