 import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Convert to binary string
        String binary = Integer.toBinaryString(n);

        int maxCount = 0;
        int currentCount = 0;

        // Traverse the binary string
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0; // reset when 0 comes
            }
        }

        // Print result
        System.out.println(maxCount);
    }
}

    

