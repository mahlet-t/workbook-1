import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the first number");
        double num1 = input.nextDouble();
        System.out.print("enter the second number:");
        double num2 = input.nextDouble();

        System.out.println("possible calculation:");
        System.out.println("A=add");
        System.out.println("S=subtract");
        System.out.println("M= multiply");
        System.out.println("D= divide");
        System.out.println("0: exit" );
while (true) {
    System.out.println("please select an option: ");
    String choice = input.next();
        if (choice.equals("M")) {
            double result = num1 * num2;
            System.out.println((int) num1 + " * " + (int) num2 + " = " + (int) result);
        } else if (choice.equals("A")) {
            double result = num1 + num2;
            System.out.println((int) num1 + "+" + (int) num2 + "=" + (int) result);
        } else if (choice.equals("s")) {
            double result = num1 - num2;
            System.out.println((int) num1 + "-" + (int) num2 + "=" + (int) result);
        } else if (choice.equals("d")) {
            double result = num1 / num2;
            System.out.println((int) num1 + "/" + (int) num2 + "=" + result);
        }
        else if((choice.equals("0"))) {
            System.out.println("Good bye!");break; }
        else {
            System.out.println("your choice is wrong try again "); }






        }
    } }
