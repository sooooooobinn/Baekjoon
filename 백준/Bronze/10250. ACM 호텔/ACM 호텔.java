import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i = 0; i<r; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int realH = (n%h == 0) ? h : (n%h);
            int realW = (n%h == 0) ? (n/h) : (n/h + 1);

            int sum = realH * 100 + realW;

            System.out.println(sum);
        }

    }
}
