// Brendan G.


import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	
// Creates a new scanner object
Scanner input = new Scanner(System.in);

// Greets new user 
System.out.println("Welcome to the BMI Calculator!");

// Prompts user to enter weight in pounds
System.out.print("Enter weight in pounds: ");
double weight = input.nextDouble();

// Prompts user to enter height in total inches 
System.out.print("Enter height in inches: ");
double height =input.nextDouble();
double BMI;

// Converts user input to kilogram and meters
BMI = (weight / 2.2046) / (height /39.37) / 2;

// Displays total BMI after Conversion
// Displays a thank note to user

System.out.println("Your Body Mass Index is = " + Math.floor(BMI)
+ " % ");
System.out.println("Thank You for using the BMI Calculator, Stay in Shape! =) ");
}
}
