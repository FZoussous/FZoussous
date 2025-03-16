import java.util.Scanner;

public class Calculator {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
            
            double number1, number2, result;
            char operator;



            System.out.println("Enter the first number: ");
            number1 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /, ^): ");
            operator = scanner.next().charAt(0);

            System.out.println("Enter the second number: ");
            number2 = scanner.nextDouble();

            switch (operator) {

                case '+' :
                result = number1 + number2; System.out.println(result);
                break;
                case '-' : 
                result = number1 - number2; System.out.println(result);
                break;
                case '*': 
                result = number1 * number2; System.out.println(result);
                break;
                case '/':
                if (number2 == 0 ){
                    System.out.println("Error: Division by zero in not allowed.");
                }else{
                result = number1 / number2; System.out.println(result);
                }
                break;
                case '^': 
                result = Math.pow(number1, number2); System.out.println(result);
                break;
                default: 
                System.out.println("This symbol is recognized by the prrogramm");

            }
                
                  


        scanner.close();

    }
    
}
