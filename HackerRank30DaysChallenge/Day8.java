
    
import java.util.*;
public class Day8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of entries
        int n = sc.nextInt();
        sc.nextLine();   // consume leftover newline

        // Phone book using HashMap
        HashMap<String, String> phoneBook = new HashMap<>();

        // Read phone book entries
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String phone = sc.next();
            phoneBook.put(name, phone);
        }

        // Read queries until no more input
        while (sc.hasNext()) {
            String query = sc.next();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}

