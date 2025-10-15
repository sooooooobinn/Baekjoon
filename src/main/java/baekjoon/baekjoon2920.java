package baekjoon;

import java.util.Scanner;

public class baekjoon2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i<a.length-1; i++){
            if(a[i] > a[i+1]){
                ascending = false;
            }
            else if(a[i] < a[i+1]){
                descending = false;
            }
        }

        if(ascending){
            System.out.println("ascending");
        }
        else if(descending){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}
