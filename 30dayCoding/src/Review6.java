import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by vmalladi on 9/7/17.
 */
public class Review6 {
    public static void main (String Args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    //int cnt = str.length();
    //System.out.println(cnt);
        char[] charArray = str.toCharArray();
       // System.out.println(Arrays.toString(charArray));
       // System.out.println(charArray.length);
        //System.out.println(charArray[2]);
        for (int i=0; i<charArray.length;i++){
            if(i%2==0){
                System.out.print(charArray[i]);

            }





        }



    }
}
