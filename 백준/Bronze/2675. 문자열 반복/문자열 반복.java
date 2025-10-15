import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for( int i = 0; i<r; i++){
            int a = sc.nextInt();
            String s = sc.next();
            for(int j = 0; j<s.length(); j++){
                for(int o = 0; o<a; o++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
