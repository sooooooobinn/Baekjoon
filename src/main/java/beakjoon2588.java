import java.util.Scanner;

public class beakjoon2588 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = b/100;
        int m = (b%100)/10;
        int c = b%10;
        System.out.println(a*c);
        System.out.println(a*m);
        System.out.println(a*n);
        System.out.println(a*b);
    }
}
