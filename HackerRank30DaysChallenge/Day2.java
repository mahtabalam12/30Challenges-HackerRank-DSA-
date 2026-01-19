import java.util.*;

public class Day2 {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100.0;
        double tax = meal_cost * tax_percent / 100.0;
        double totalCost = meal_cost + tip + tax;

        System.out.println("The total cost is " + Math.round(totalCost));4
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double meal_cost = sc.nextDouble();
        int tip_percent = sc.nextInt();
        int tax_percent = sc.nextInt();

        solve(meal_cost, tip_percent, tax_percent);
        sc.close();
    }
}
