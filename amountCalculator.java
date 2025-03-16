import java.util.Scanner;
import java.lang.Math;


public class amountCalculator {
      public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        

        int Principal;
        int interestrate;
        int compound;
        int years;
        double amount;
        String currency = "DH";


        System.out.println("Enter the Principal amount: ");
        Principal = scanner.nextInt();

        System.out.println("Enter the interest rate (in %): ");
        interestrate = scanner.nextInt();

        System.out.println("Enter the # of times compounded per year: ");
        compound = scanner.nextInt(); 

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        amount = Principal * Math.pow((1 + interestrate/compound), compound*years);
        System.out.println("The amount after " + years + " " + "years is:" + amount + " " +currency);
        scanner.close();
      }
}
      