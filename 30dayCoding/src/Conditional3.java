import java.io.*;
import java.util.*;
/*Given an integer, , perform the following conditional actions:

        If  is odd, print Weird
        If  is even and in the inclusive range of  to , print Not Weird
        If  is even and in the inclusive range of  to , print Weird
        If  is even and greater than , print Not Weird
        Complete the stub code provided in your editor to print whether or not  is weird.

/**
 * Created by vmalladi on 9/1/17.
 */

public class Conditional3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else if (n%2==0 && (n>=2 && n<=5)){
            // Complete the code
            ans = "Not Weird";
        }
        else if(n%2==0 && (n>=6 && n<=20)){
            ans = "Weird";
        }
        else if (n%2==0 && (n>=20)){
            ans = "Not Weird";
        }

        System.out.println(ans);
    }
}

