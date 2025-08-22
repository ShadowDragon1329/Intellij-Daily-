import java.text.NumberFormat;
import java.util.Scanner;

public class Day3 {
    void runCode(){
        System.out.println("\nDay3 Starts Here!!!!\n");
        NumberFormat precent = NumberFormat.getPercentInstance();
        String result = precent.format(2.5);
        System.out.println(result);

        //Another method to use NumberFormat in same line of code

        String result2 =NumberFormat.getCurrencyInstance().format(1234567890.123);
        System.out.println(result2);


        //Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your Account Balance :");

        double salary = sc.nextDouble();
        System.out.println("Your Salary is :"+salary);

        System.out.println("Please Enter Account Holder's Name :");


    }
}
