import java.util.Scanner;

/**
 * Created by vmalladi on 8/31/17.
 */
public class DataTypes1 {
    public static void main (String args[]){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);


        int j = scan.nextInt();
        double e = scan.nextDouble();
        String t = scan.nextLine();
        String r = scan.nextLine();

        System.out.println(i+j);
        System.out.println(d+e);
        System.out.println(s+r);
    }

}
