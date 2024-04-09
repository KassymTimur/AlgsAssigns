import java.util.Scanner;

public static int recursSquareSum(int n) {
    if (n == 0) {
        return 0;
    } else {
        return n * n + recursSquareSum(n - 1);
    }
} //problem 1

public static int recursArrSum(int[] arr, int n) {
    if (n == 0) {
        return 0;
    } else {
        return arr[n - 1] + recursArrSum(arr, n - 1);
    }
} //problem 2

public static int recursPosSum(int n) {
    if (n == 1) {
        return n;
    } else {
        return n + recursPosSum(n - 1);
    }
} //problem 3

public static int recursPowerSum(int b, int n) {
    if (n == 0) {
        return 1;
    } else {
        return (int) Math.pow(b, n) + recursPowerSum(b, n - 1);
    }
} //problem 4

public static void recursReverseNum(int n, Scanner scanner) {
    if (n == 0)
        return;
    else {
        int num = scanner.nextInt();
        recursReverseNum(n - 1, scanner);
        System.out.print(num + " ");
    }
} //problem 5

public static void recursReverseStr(int n, Scanner scanner) {
    if (n == 0) {
        return;
    } else {
        String str = scanner.nextLine();
        recursReverseStr(n-1, scanner);
        String[] words = str.split(" ");
        for (int i= words.length -1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
    }
}//problem 6

public static class recursNumberSpiral {
    static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void fillSpiral(int[][] matr, int n, int dir, int row, int col, int s) {
        if (n > s * s) {
            return;
        }
        matr[row][col] = n;
        int nextRow = row + directions[dir][0];
        int nextCol = col + directions[dir][1];
        if (nextRow < 0 || nextRow >= s || nextCol < 0 || nextCol >= s || matr[nextRow][nextCol] != 0) {
            dir = (dir + 1) % 4;
            nextRow = row + directions[dir][0];
            nextCol = col + directions[dir][1];
        }
        fillSpiral(matr, n + 1, dir, nextRow, nextCol, s);
    }

    public static void printMatr(int[][] matr) {
        for (int[] row : matr) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
} //problem 7

public static void recursSeqGenerator(int n, int k, int[] seq, int id){
    if (id==n){
        for(int i=0;i<n;i++){
            System.out.print(seq[i]+" ");
        }
        System.out.println();
        return;
    }
    for (int i=1; i<=k; i++){
        seq[id]=i;
        recursSeqGenerator(n,k,seq,id+1);
    }
} //problem 8

public static class PermutatioGenerator{
    public static void printPermutations(String str) {
        char[] chars = str.toCharArray();
        printPermutations(chars, 0);
    }

    private static void printPermutations(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(chars);
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            printPermutations(chars, index + 1);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    } //problem 9

public static boolean isPowOfTwo(int n){
    if (n<=0){
        return false;
    }
    return (n&(n-1))==0;
} //problem 10

public static void main() {
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int arrSize = array.length;
    Scanner sc = new Scanner(System.in);

    System.out.print("Input n="); //square summing up to n
    int inp = sc.nextInt();
    if (inp < 0) {
        System.out.println("Error: \"n\" is not positive");
    } else {
        System.out.println(recursSquareSum(inp));
    }

    System.out.print("Input up to 11: m=");
    int inp1 = sc.nextInt(); //array summing up to m-th element
    if (inp1 <= 0 || inp1 > arrSize) {
        System.out.println("Error: Input is either too small or exceeds array size");
    } else {
        int res = recursArrSum(array, inp1);
        System.out.println(res);
    }

    System.out.print("Input positive integer k=");
    int inp2 = sc.nextInt(); //summing integers up to k
    if (inp2 < 1) {
        System.out.println("Error: \"k\" is not positive");
    } else {
        System.out.println(recursPosSum(inp2));
    }

    System.out.println("Input two parameters b and j:");
    int inp_b = sc.nextInt(); //summing parametric power up to b-th element of j-th power
    int inp_j = sc.nextInt();
    if (inp_j < 0) {
        System.out.println("Error: Power must be positive");
    } else {
        int res1 = recursPowerSum(inp_b, inp_j);
        System.out.println(res1);
    }
    System.out.print("Input number of elements: ");
    int inp_e = sc.nextInt(); //reversing the number sequence that is given
    if (inp_e <= 0) {
        System.out.println("Error: Number of elements must be positive");
    } else {
        System.out.println("Input sequence: ");
        recursReverseNum(inp_e, sc);
    }
    System.out.println("Input number of elements: ");
    int inp3 = sc.nextInt(); //reversing the string sequence that is given
    if (inp3 <= 0) {
        System.out.println("Error: Number of elements must be positive ");
    } else {
        System.out.print("Input strings: ");
        recursReverseStr(inp3, sc);
    }
    System.out.println("Enter dimensions of spiral: ");
    int spirSize = sc.nextInt(); //making spiralled matrix filled with numbers in clockwise span
    if(spirSize<=0) {
        System.out.println("Error: Matrix size should be positive");
    }
    else{
        int[][] spiralMatr = new int[spirSize][spirSize];
    recursNumberSpiral.fillSpiral(spiralMatr, 1, 0, 0, 0, spirSize);
    recursNumberSpiral.printMatr(spiralMatr);
    }
    System.out.println("Input numbers to create sequence: ");
    int seqStrt = sc.nextInt(); //the starting number
    int seqEnd = sc.nextInt(); //the ending number
    if (seqStrt<=0||seqEnd<=0){
        System.out.println("Error: Either number cannot be negative");
    }
    else{
        int[] seq = new int[seqStrt];
        recursSeqGenerator(seqStrt,seqEnd,seq,0);
    }
    System.out.print("Input a string: ");
    String input = sc.next(); //inputting a string to calculate its permutations
    PermutatioGenerator.printPermutations(input);
    System.out.print("Enter a number: ");
    int maxNum = sc.nextInt(); //inputting a number to determine if it's power of 2 or not
    sc.close();
    for(int i=0; i<=maxNum; i++){
        System.out.print(i);
        if(isPowOfTwo(i)){
            System.out.println(" is a power of 2;");
        }
        else{
            System.out.println(" is not a power of 2;");
        }
    }
}