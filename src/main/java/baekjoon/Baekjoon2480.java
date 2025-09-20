package baekjoon;

import java.util.Scanner;

public class Baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;

        if(a==b && a==c) {
            sum = 10000 + (1000*a);
        }
        else if(a==b || a==c || b==c) {
            if(a==c){
                sum = 1000 + (100*a);
            }
            else if(a==b){
                sum = 1000 + (100*b);
            }
            else{
                sum = 1000 + (100*c);
            }
        }
        else{
            int num = a > b ? ((a > c) ? a : c) : ((b > c) ? b : c);
            sum = num * 100;
        }
        System.out.println(sum);
    }
}
