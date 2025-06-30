import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int result = a==1 ? 0 : 1;
        if(result == 0){
            System.out.println("t");
        }
        else{
            System.out.println("f");
        }
    }
}