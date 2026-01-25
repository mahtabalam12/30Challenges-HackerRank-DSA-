 
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // number of test cases
        sc.nextLine();          // consume newline

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            String even = "";
            String odd = "";

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even += s.charAt(j);
                } else {
                    odd += s.charAt(j);
                }
            }

            System.out.println(even + " " + odd);
        }
        sc.close();
    }
}

