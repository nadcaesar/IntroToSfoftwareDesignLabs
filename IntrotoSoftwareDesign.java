/*
  Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package main; //Oranizational line that says where the source code is located

import java.util.Scanner;

public class IntrotoSoftwareDesign //this is basically my notes from class about java
{
    public static void main(String[] args) //acts as the main entry point of the code. Represents where the compiler starts to read thge code
    {
    //JAVA TUTORIAL FOUR NOTES
        Scanner input;
        input = new Scanner(System.in);
        String word = input.next();
        System.out.println(word);
        input.close();
        
        /*
    JAVA TUTORIAL ONE AND TWO NOTES    
        //System.out.println("Hello Universe!");
        //<type of variable> name_of_variablel;
        int x; //integer (0,1,2,3)
        x = 42;
        double y;// double can store decimals or fractions
        y = 3.1415;
        
        char z; //character basically any letter in the alphabet and allows for  %, & and !
        z = 'A'; //when using chartacters, surround with single quotes
        
        String wombat; //String STRINGS HAVE TO USE DOUBLE QUOTETATION MARKS
        wombat= "wombat";
        
        System.out.print("x = ");
        System.out.println(x);
        System.out.print("y = ");
        System.out.println(y);
        System.out.print("z = ");
        System.out.println(z);
        System.out.print("wombat = ");
        System.out.println(wombat);
        */
        
        
    }    
}
