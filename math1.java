import java.util.Scanner;
import java.lang.Math;

public class math1 {
    public static void main (String [] args){
        // circumference = 2* pi *r;
        // area = pi * r^2;
        // volume = 4/3 * pi * r^3;
        Scanner scanner = new Scanner(System.in);

        double circumference;
        double area;
        double volume;
        double radius;

        System.out.println("Enter the value of radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4/3) * Math.PI * Math.pow(radius, 3);


        System.out.println("The value of circumference is: " + circumference);
        System.out.println("The value of area is: " + area);
        System.out.println("The value of volume is: " + volume);


scanner.close();

    }
    
}
