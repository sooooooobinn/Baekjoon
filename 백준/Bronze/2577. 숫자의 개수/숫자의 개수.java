import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a * b * c;

        String str = String.valueOf(sum);

        int[] st = new int[str.length()];

        for(int i = 0; i<str.length(); i++){
            st[i] = str.charAt(i) - '0';
        }

        int[] count = new int[10];

        for (int i = 0; i < st.length; i++) {
            count[st[i]]++;
        }
        for(int i = 0; i< count.length; i++){
            System.out.println(count[i]);
        }
    }
}
