import java.util.Scanner;

//The objective of the program is to prompt the user to enter
//a temperature in Fahrenheit and compute the conversions of Fahrenheit
//to Celsius and Celsius to Kelvin
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        //Requesting input from user. Input requested is a whole or decimal number
        //of degrees temperature in Fahrenheit
        System.out.println ("Please enter a temperature in Fahrenheit");
            double Fahrenheit = in.nextDouble();
        //Reiterating user's response, may not be necessary?
        //Added for extra basic Java practice
        System.out.println ("You entered " + Fahrenheit + " degrees Fahrenheit");

        //Calculations for conversions from Fahrenheit to Celsius and
        //from Celsius to Kelvin
            double Celsius = (Fahrenheit * 5/9)-32;
            double Kelvin = Celsius + 273.15;

        //Displaying conversions as output to the user to view.
        System.out.println(Fahrenheit + " degrees Fahrenheit is " + Celsius +
        " degrees Celsius and " + Kelvin + " degrees in Kelvin.");

        }
    }
