import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A= input.nextInt();

        int[] p = new int[A+1];

        for(int i =2;i<=A;i++){
            p[i] = p[i-1]+1;

            if(i%2==0) {
                p[i]= Math.min(p[i], p[i/2]+1);
            }
            if(i%3==0){
                p[i] = Math.min(p[i],p[i/3]+1);
            }
        }
        System.out.println(p[A]);
    }
}
