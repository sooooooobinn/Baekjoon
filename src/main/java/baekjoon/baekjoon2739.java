package baekjoon;
import java.util.Scanner;

public class baekjoon2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        for(int i = 1; i<=9; i++){
            System.out.println(sum + " * " + i + " = " + sum*i);
        }
    }
}
