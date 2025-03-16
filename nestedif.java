public class nestedif {
    public static void main(String [] args){
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent && isSenior){
            System.out.println("you get a student discount of 50%");
            price *= 0.50 ;
        }
        else{
            System.out.println("You don't get one");
            price = price;

        }
        System.out.println("The price of a ticket is: $" + price);
    }
    
}
