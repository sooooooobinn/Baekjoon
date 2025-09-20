package baekjoon;

import java.util.Scanner;

public class backjoon2475 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        for(int i = 0; i<5; i++){
            a[i] = in.nextInt();
        }

        for(int i=0; i<5; i++){
            sum += a[i]*a[i];
        }
        System.out.println(sum%10);
    }

}
