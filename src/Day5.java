import java.util.Scanner;

public class Day5 {
    void runCode(){

        /*

        boolean hasHighIncome = false;
        boolean hasHighCredit = false;

        boolean hasCriminalRec = false;

        boolean isEligible = (hasHighIncome || hasHighCredit) && !hasCriminalRec;
        System.out.println(isEligible);
     */

        //FizzBuzz

        System.out.println("Enter The Number : ");
        int number;

        Scanner sc =new Scanner(System.in);
        number =sc.nextInt();

        if(number%15==0)
            System.out.println("FizzBuzz");
        else if (number%5==0)
            System.out.println("Fizz");
        else if (number%3==0)
            System.out.println("Buzz");
        else
            System.out.println(number);



    }

}
