package beakjoon;

import java.util.Scanner;

public class Beakjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;

        if(a==b && a==c) {
            sum = 1;
        }
        else if(a==b || a==c || b==c) {

        }
        else{
            int num = a > b ? ((a > c) ? a : c) : ((b > c) ? b : c);
            sum = num * 100;
        }
    }
}
