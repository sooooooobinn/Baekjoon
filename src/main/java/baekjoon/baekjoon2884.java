package baekjoon;

import java.util.Scanner;

public class baekjoon2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        m -= 45;

        if(m < 0)
        {
            m += 60;
            h -= 1;
        }

        if (h < 0)h = 23;

        System.out.print(h + " " + m);
    }
}
