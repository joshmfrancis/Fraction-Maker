// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_2_1
// File Name: Fraction.java

// This function asks for a numerator and a denominator 
// and outputs a fraction from those criteria.

package problem_2_1;

import java.util.Scanner;                                                       // Imports the scanner object that listens to the input of the user.

public class Fraction {

    public static void main(String[] args) {

        int numerator;                                                          // Tells the program that that the input for the variable 'numerator' it is accepting is a integer.
        int denominator;                                                        // Tells the program that that the input for the variable 'denominator' it is accepting is a integer.

        Scanner scan = new Scanner(System.in);                                 // Creates a scanner object that listens to the inputs of the user.

        System.out.print("Enter Numerator: ");                                  // Where the user inputs the 'numerator' and where the next line of code scans
        numerator = scan.nextInt();                                             // Scans the input of the user (Denoted here as 'numerator') on the line where the print statement is
        

        System.out.print("Enter Denominator: ");                                // Where the user inputs the 'denominator' and where the next line of code scans
        denominator = scan.nextInt();                                           // Scans the input of the user (Denoted here as 'denominator') on the line where the print statement is

        System.out.println("Fraction: " + (double) numerator / (double) denominator); // Prints the division of the float values of the denoted values ('numerator' and 'denominator'), The 'double' data type represents floating point numbers (For the decimal numbers). The primitive data type 'double' can represent more digits than the primitive data type 'float'.

    }

}
