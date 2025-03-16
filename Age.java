import java.util.Scanner;

public class Age {
    public static  void main (String [] args){
          Scanner scanner = new Scanner(System.in);


          int age = scanner.nextInt();
          if (age < 12 ){
                System.out.println("learn to pray");

          } else if ( age >= 12){
            System.out.println(" You should pray ur obligations to worship Allah");

          } else if (age >= 18){
            System.out.println("You should pray your obligations and sunnah to worship Allah");

          } else if (age >= 20){
            System.out.println("You should pray your obligations and sunnah to worship Allah and also pray the night prayer");

          } else if (age >= 30){
            System.out.println("You should pray your obligations and sunnah to worship Allah and also pray the night prayer and also fast the month of Ramadan");

          } else if (age >= 40){
            System.out.println("You should pray your obligations and sunnah to worship Allah and also pray the night prayer and also fast the month of Ramadan and also give charity");

          } else if (age >= 50){
            System.out.println("You should pray your obligations and sunnah to worship Allah and also pray the night prayer and also fast the month of Ramadan and also give charity and also perform Hajj");

          } else {
            System.out.println("You should pray fast give sharity and perform Hajj and also perform Umrah if u can");

          }

scanner.close();
    }
    
}
