package beakjoon;

import java.util.Scanner;

public class beakjoon10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < a){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
