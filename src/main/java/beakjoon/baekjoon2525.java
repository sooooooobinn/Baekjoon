package beakjoon;

import java.util.Scanner;

public class baekjoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int time = h * 60 + m;
        time += n;

        int hours = time / 60;
        int minutes = time % 60;
        hours = hours % 24;

        System.out.println(hours + " " + minutes);
    }
}