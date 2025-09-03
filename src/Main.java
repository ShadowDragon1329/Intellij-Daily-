import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter The Day Number whose Code you would like to access : ");

        int dayNumber=0;

        Scanner sc =new Scanner(System.in);
        dayNumber = sc.nextInt();

        switch (dayNumber){
            case 1:
                Day1 d1 =new Day1();
                d1.runCode();
                break;
            case 2:
                Day2 d2 =new Day2();
                d2.runCode();
                break;
            case 3:
                Day3 d3 =new Day3();
                d3.runCode();
                break;
            case 4:
                Day4 d4 =new Day4();
                d4.runCode();
                break;
            case 5:
                Day5 d5 =new Day5();
                d5.runCode();
                break;
            default:
                System.out.println("Enter a Valid DayNumber");
        }


    }
}