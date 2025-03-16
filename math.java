import java.lang.Math;
import java.util.Scanner;

public class math {
    public static void main ( String [] args){

        //HYPOTENUSE c = sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();

        System.out.println("Enter the value of b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The value of c is: " + c);
       
scanner.close();
    }
    
}
