import java.util.Scanner;

public class Temperature {
      public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double temperature;
        char temperatureSymb;
        double newTemperature;
        String Symb1 = "°C";
        String Symb2 = "°F";


        System.out.println("Enter the temperature: \n");
        temperature = scanner.nextDouble();

        System.out.println("Convert to Celsius or fahrenheit?  (C or F):\n");
        temperatureSymb = scanner.next().charAt(0);
        

           if (temperatureSymb == 'F' || temperatureSymb == 'f'){
            newTemperature = (temperature * (9.0/5.0)) + 32;
            System.out.println(newTemperature + Symb2 );
                
           } else if (temperatureSymb == 'C' || temperatureSymb == 'c'){
            newTemperature = (temperature - 32) * (5.0/9.0);
            System.out.println(newTemperature + Symb1 );

           } else{
            System.out.println("This symbol is not recognized by the program. \n");
           }
           scanner.close();
      }
    
}
