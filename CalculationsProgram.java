/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
/*
  Name: Nicholas Caesar
  Date: 4/15/2020
  Description: Asks the user to enter their first name, last name, first number, and second number, and then returns the user first and last name and the result of the calculations based on the numbers the user chose
*/
import java.util.Scanner;
public class CalculationsProgram 
{
    public static void main(String[] args) 
    {
        //declare 'input' as a scanner variable to prompt and get user data
        Scanner input = new Scanner(System.in);        
        
        //declare the variables as strings
        String firstName, lastName;
        //prompt and get the first and last name from the user        
        System.out.println("Enter your First name");        
        firstName = input.nextLine();
              
        System.out.println("Enter your last name");        
        lastName = input.nextLine();
        
        
        //prompt and get the two numbers from the user
        Double number1, number2;
        System.out.println("Enter first number");
        number1 = input.nextDouble();
        
        System.out.println("Enter second number");
        number2 = input.nextDouble();
        
        //declare the variables as Double so to allow the user to enter any number
        Double addition,subtraction,multiplication,division;
        
        //set the variables equal to the calulation needed for the variable
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
        
        input.close();        
        
        System.out.println("Hello "+ firstName +" "+ lastName +" You Entered "+ number1 +" and "+ number2);
        System.out.println("The Sum of numbers you entered is "+addition);
        System.out.println("The Difference of numbers you entered is "+subtraction);
        System.out.println("The Product of numbers you entered is "+multiplication);
        System.out.println("The Quotient of numbers you entered is "+division);
        
    }
}
