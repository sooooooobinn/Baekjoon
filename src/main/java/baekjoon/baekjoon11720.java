package baekjoon;

import java.util.Scanner;

public class baekjoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        for(int i = 0; i<a; i++){
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
