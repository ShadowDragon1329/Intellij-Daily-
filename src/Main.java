import java.awt.*;
import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //printing hello world
        System.out.println("Hello World");

     //variable types

      /*  int studentAge=13;
    long studentDebt = 3_123_456_789L;
    float studentMarks=39.5F;
    double studentPercentage=99.99;
    char studentGrade='O';
    boolean isPass =true;
*/
    //Date package
        Date now =new Date();
    //sout is shortcut for System.out.println();
        System.out.println(now);

    //Point Package
    //for example
        //int x=1;
        //int y=x;
        //x++;
        //sout(y) would print 1
    //now using Point

        Point point1=new Point(1,2);
        Point point2=point1;

        point1.x=2;

        System.out.println(point2);


    //Strings
    String hello ="Hello World!!!";
        System.out.println(hello);
    // the symbol '\' is useful for adding "" in a string as well as '\' itself as' \\ '  for example

    String message="Hello \"World\""+"\nMy address is C:\\Users\\Intellij \t this is a Tab";
        System.out.println(message);

    //Arrays
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
        System.out.println(Arrays.toString(numbers));
    }
}