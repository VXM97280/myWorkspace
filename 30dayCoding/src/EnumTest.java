import java.util.Scanner;

/**
 * Created by vmalladi on 9/12/17.
 */
public class EnumTest {

    enum Car{
        FORD, HYUNDAI, HONDA, TOYOTA;
    }

    Car car;

    public EnumTest (Car car){
        this.car = car;
    }

    public void nameTheCar(){
        switch (car){
            case FORD:
                System.out.println("Best American truck");
                break;
            case HONDA:
                System.out.println("Best car in America");
                break;
            case TOYOTA:
                System.out.println("Best sedan in America");
                break;
            case HYUNDAI:
                System.out.println("Best fast growing car in America");
                break;

        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        EnumTest e2 = new EnumTest(Car.valueOf(str1));
        e2.nameTheCar();


    }


}
