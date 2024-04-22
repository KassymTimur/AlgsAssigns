package Problem_pack;

import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseString(input));
    }
    public static String reverseString(String s){
        if (s.isEmpty()){
            return s;
        }
        else{
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}
