/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
/*
  Filename: HelloWorldJavaProgram.java
  Name: Nicholas Caesar
  Date: 4/15/2020
  Description: The creates an integer and declares a number (any number); add 5 to the integer using a separate statement. Next double the variable. In the last statement, subtract 7 from the variable (will take one integer, add 5, double it, subtract 7 from it, and display the final number on the screen  
*/
public class ChangingNumbers 
{
    public static void main(String[] args) 
    {
        //declare 'initialValue' as an integer and set the value of the integer 
        int initialValue = 8;
        
        //Print the text to display to the user the value they are starting with on screen
        System.out.println("I started with "+ initialValue);
        
        //declare 'addition' as an integer and set it to add 5 to the starting value
        int addition;
        addition = initialValue + 5;
        
        //Print the text to display the value of the variable after adding 5 to it
        System.out.println("I added 5 to get "+addition);
        
        //set addition to take its current value to double it
        addition = addition * 2;
        
        //Print the text to display to the the new value of the variable after doubling it
        System.out.println("After doubling the number "+addition);
        
        //declare 'finalValue' as an integer and set it subtract 7 from 'multiply'
        int finalValue;
        finalValue = addition - 7;
        
        //Print the text to show the user the final value
        System.out.println("After subtracting 7, my final number is "+finalValue);
            
    }
    
}
