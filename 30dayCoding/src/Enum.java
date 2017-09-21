import java.util.Scanner;

/**
 * Created by vmalladi on 9/12/17.
 */
public class Enum {

    enum Day{
        Monday, Tuesday, Wednesday, Thursday,
        Friday, Saturday, Sunday
    }

    Day day;

    public Enum (Day day){
        this.day = day;
    }

    public void dayIsLike(){
        switch (day){
            case Monday:
                System.out.println("Good day as Sunday");
                break;
            case Tuesday:
                System.out.println("After Monday");
                break;
            case Wednesday:
            case Friday:
            case Thursday:
            case Saturday:
            case Sunday:
                System.out.println("Working days");
                break;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Enum e1 = new Enum(Day.valueOf(str));
        e1.dayIsLike();
    }
}
