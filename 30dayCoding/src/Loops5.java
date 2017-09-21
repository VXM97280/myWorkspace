import java.util.Scanner;

/**
 * Created by vmalladi on 9/1/17.
 */
public class Loops5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            int b = n * i;
            System.out.println(n + " x " + i + " = " + b);
        }

    }
}
