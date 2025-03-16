import java.util.Scanner;

public class bankingProg {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int choice;
        double amount = 0, balance = 0;
        String currency = "MAD";
        
while(true){
        System.out.println("********************");
        System.out.println(  "BANKING PROGRAM"  );
        System.out.println("********************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("********************");

        System.out.println("Enter yout choice (1-4):");
        choice = scanner.nextInt();



     if (choice == 1){
        System.out.println("Your current balance is: " + balance + " " + currency);

     } else if (choice == 2){
        System.out.println("Enter an amount to be deposit:");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative");
        }else{
        balance += amount;
        }
     } else if (choice == 3){
        System.out.println("The amount to withdraw is: ");
        amount = scanner.nextDouble();
        if (amount > balance){
           System.out.println("INSUFFICIENT FUNDS");
        }else if(amount <= balance){
            balance -= amount;
        }
     } else if (choice == 4){
        System.out.println("You've exited the program successfully");
        break;

     } else {
        System.out.println("Invalid choice please choose a number between (1-4)");
        System.out.println("Enter yout choice (1-4):");
        choice = scanner.nextInt();
     }
    }



scanner.close();


    }
}