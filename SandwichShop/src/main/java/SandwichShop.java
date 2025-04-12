import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        askuser(input);
    }
    public static void askuser(Scanner input) {
while (true) {
        System.out.println("choose size");
        System.out.println("(1)Regular");
        System.out.println("(2)large");
        System.out.println("(0)Exit");
        String size =input.next();
        double price= 0.0;
        boolean validChoice =false;
        if (size.equals("1")){
            price=5.45;
            System.out.println("The Base Price is: "+price);
            validChoice= true;
        } else if (size.equals("2")) {
            price=8.95;
            System.out.println("the Base Price is: "+price);
            validChoice=true;
        } else if (size.equals("0")) {
            System.out.println("Thanks for choosing us! Good bye!");break;

        } else {
            System.out.println("wrong choice try again");
        }
        if (validChoice){
        System.out.println("enter your age for discount");
        int age= input.nextInt();
     if (age<=17){
         price = price-(price*0.10);
         System.out.println("price after discount: "+price);
     } else if (age>=65) {
         price = price-(price*0.20);
         System.out.println("price after discount: "+ price);
     }
     else {
         System.out.println("no discount pay full price: " + price);
     }

    }
} } }