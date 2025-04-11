import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name");
        String name=input.next();
        System.out.print("enter your hours worked");
        float hr = input.nextFloat();
        System.out.print("enter your pay rate");
        float payRate=input.nextFloat();
        System.out.println("your name :"+name);
        System.out.println("your hour worked :"+hr);
        System.out.println("your pay rate :"+payRate);
        System.out.println("Gross payment :"+hr * payRate);
        if (hr > 40)
        {double otHr= hr-40, ot= otHr *(payRate*1.5);
        System.out.println("your over time :"+ot);}
        else { System.out.println("No overtime" );}







    }
}
