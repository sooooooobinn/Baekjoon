package baekjoon;

import java.util.Scanner;

public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] main = new int[10];
        int sum = 0;

        for(int i = 0; i<10; i++) {
            int n = sc.nextInt();
            int r = n % 42;

            boolean exist = false;

            for(int j = 0; j < sum; j++) {
                if(r == main[j]){
                    exist = true;
                    break;
                }
            }

            if(!exist) {
                main[sum] = r;
                sum++;
            }
        }
        System.out.println(sum);
    }
}
