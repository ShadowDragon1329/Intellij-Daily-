import java.util.Scanner;

public class Day4 {
    void runCode() {
        int principle = 0;
        double intrestRate = 0;
        double timeMonths = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your Principle Amount : ");
            principle = sc.nextInt();
            if (principle >= 1_000 && principle <= 1_00_000)
                break;
            System.out.println("Enter Amount between 1,000 and 1,00,000");
        }
        while (true) {
            System.out.print("\nEnter your Annual Interset Rate : ");
            intrestRate = ((sc.nextDouble()) / 12) / 100;
            if (intrestRate >= 1 && intrestRate <= 100)
                break;
            System.out.println("Enter Rate between 1 and 100");
        }


        System.out.print("\nEnter your Time Period in Years : ");
        timeMonths = (sc.nextDouble()) * 12;


        double mortgage;

        mortgage=(principle*intrestRate*(Math.pow((1+intrestRate),timeMonths)))/(Math.pow((1+intrestRate),timeMonths)-1);

        System.out.println("Your Mortgage is " + mortgage);

    }
}
