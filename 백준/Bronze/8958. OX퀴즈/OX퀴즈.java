import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n; i++){
            String s = sc.nextLine();
            int sum = 0;
            int num = 0;

            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j) == 'O'){
                    num++;
                    sum += num;
                }
                else {
                    num = 0;
                }
            }
            System.out.println(sum);
        }

    }
}
