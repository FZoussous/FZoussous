import java.util.Scanner;

public class MADLIBS {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String adjective1;
       String noun1;
       String adjective2;
       String verb1;
       String adjective3;
           


        System.out.println("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective3 = scanner.nextLine();


       System.out.print(" Today I went to a " + adjective1 + " restaurant.");
       System.out.print("In an exibit I saw a " + noun1 +  ".");
       System.out.print(noun1 + " was so " + adjective2 + " and" + verb1 + " !");
       System.out.print("I felt " + adjective3 +  ".");
        scanner.close();
    }
}