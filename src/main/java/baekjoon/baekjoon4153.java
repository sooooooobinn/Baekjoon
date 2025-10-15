package baekjoon;

import java.util.Scanner;

public class baekjoon4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int l = a > b ? (a > c ? a : c) : (b > c ? b : c);

            
        }
    }
}
