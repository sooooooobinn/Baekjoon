import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] arr = new int[26];

        for(int i = 0; i<26; i++) {
            arr[i] = -1;
        }
        for(int i = 0; i<S.length(); i++) {
            char c = S.charAt(i);
            int n = c - 'a';
            if(arr[n] == -1) {
                arr[n] = i;
            }
        }
        for(int i = 0; i<26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
