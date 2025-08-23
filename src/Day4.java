import java.util.Scanner;

public class Day4 {
    void runCode(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Principle Amount : ");
        int principle = sc.nextInt();
        System.out.print("\nEnter your Annual Interset Rate : ");
        double intrestRate = ((sc.nextDouble())/12)/100;
        System.out.print("\nEnter your Time Period in Years : ");
        double timeMonths = (sc.nextDouble())*12;

        double mortgage;

        mortgage=(principle*intrestRate*(Math.pow((1+intrestRate),timeMonths)))/(Math.pow((1+intrestRate),timeMonths)-1);

        System.out.println("Your Mortgage is " + mortgage);

    }
}
