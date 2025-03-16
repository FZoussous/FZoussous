import java.util.Scanner;

public class WeightConvertion {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        int option;
        double weight;
        double newWeight;

        System.out.println("Weight Conversion Program\n");
        System.out.println("1: Convert lbs to kgs\n");
        System.out.println("2: Convert kgs to lbs\n");

        System.out.println("Choose an option: \n");
        option = scanner.nextInt();

        

        if (option == 1){
            System.out.println("Enter the weight in lbs: \n");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45;
            System.out.println("The new weight en kgs is: " + newWeight);

        }
        else if( option == 2){
            System.out.println("Enter the weight in kgs: \n");
            weight = scanner.nextDouble();
            newWeight = weight * 2.2;
            System.out.println("The new weight en lbs is: " + newWeight);
           
        }
        else {
            System.out.println("The option is not in the menu");
        }

         scanner.close();

    }
    
}
