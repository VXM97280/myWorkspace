import java.util.Scanner;

/**
 * Created by vmalladi on 8/30/17.
 */
public class Arithmetic2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextInt(); // tip percentage
        double taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * (tipPercent/100);
        double tax = mealCost * (taxPercent/100);
        double totalCost1 = mealCost + tip + tax;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(totalCost1);

        // Print your result
        System.out.print("The total meal cost is " +totalCost+ " dollars");
    }
}
