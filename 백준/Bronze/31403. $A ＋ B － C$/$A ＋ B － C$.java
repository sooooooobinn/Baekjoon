import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        int sum1 = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        int sum2 = Integer.parseInt(a+b) - Integer.parseInt(c);

        System.out.println(sum1);
        System.out.println(sum2);
    }
}