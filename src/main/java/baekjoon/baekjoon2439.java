package baekjoon;

import java.util.Scanner;

public class baekjoon2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = a; i>0; i--){

            for(int e = 1; e<i; e++){
                System.out.print(" ");
            }
            for(int j = a; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
