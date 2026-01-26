
    import java.util.*;
public class Day7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // size of array
        int[] arr = new int[n];

        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // print in reverse order
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


