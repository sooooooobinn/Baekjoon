package baekjoon;

import java.util.Scanner;

public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
            a[i] = a[i] % 42;

        }
        System.out.println(sum);
    }
}
