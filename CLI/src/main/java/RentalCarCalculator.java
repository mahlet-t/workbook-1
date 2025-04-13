
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("choose pickup date monday-sunday");
            String day = input.next();
            System.out.println("for how many days you want rent");
            int numDay = input.nextInt();
            double price = numDay * 29.99;
            System.out.println("Basic car rental is: " + price);
            System.out.println("optional cost");
            while (true) {
                System.out.println("do you want an electronic toll tag at $3.95/day");
                String tollTag = input.next();
                if (tollTag.equalsIgnoreCase("yes")) {
                    price = price + (3.95 * numDay);
                    break;

                } else if (tollTag.equalsIgnoreCase("no")) {
                    System.out.println("toll tag not selected");break;

                } else {
                    System.out.println("invalid input. please type yes or no");
                }
            }
            while (true) {
                System.out.println("do you want a GPS at $2.95/day");
                String GPS = input.next();
                if (GPS.equals("yes")) {
                    price = price + (2.95 * numDay);
                    break;
                }
                else if (GPS.equalsIgnoreCase("no")) {
                    System.out.println("Gps not selected");break;
                } else {
                    System.out.println("invalid input. please type yes or no");
                }
            }
            while (true) {
                System.out.println("do you want roadside assistance at $3.95/day");
                String roadsideAssistance = input.next();
                if (roadsideAssistance.equals("yes")) {
                    price = price + (3.95 * numDay);
                    break;
                } else if (roadsideAssistance.equalsIgnoreCase("no")) {
                    System.out.println("road side assistance not selected");break;
                }
                else {
                    System.out.println("invalid input. please type yes or no");
                }
            }
            System.out.println("your current age");
            int age = input.nextInt();
            if (age < 25) {
                price = price + (price * 0.3);
            }
            System.out.println("Pickup day: "+day);
            System.out.println("Days rented: "+numDay);
            System.out.printf("Total price : %.2f\n", price);
            System.out.println("Do you want to do another rental");
            String again=input.next();
            if (!again.equalsIgnoreCase("yes")){
                System.out.println("thank you for using RCC! Good bye!");
                break;
            }

        }

    }

}