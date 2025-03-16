 import java.util.Scanner;
public class Dish {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         

         System.out.println("What item would you like to buy? :");
         String item = scanner.nextLine();
         System.out.println("What is the price for each? :");
         double price = scanner.nextDouble();
         System.out.println("How many would you like? :");
         int quantity = scanner.nextInt();
         String currency = "MAD";


          System.out.println("You have bought " + quantity + " " + item + "/s" );
          double total = price * quantity;
          System.out.println("The total price is: " + total + " " + currency);

          scanner.close();
    }     
  }

      
    

