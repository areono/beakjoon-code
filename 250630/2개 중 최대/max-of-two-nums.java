import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        int result = a>b ? a : b;
        System.out.println(result);
    }
}