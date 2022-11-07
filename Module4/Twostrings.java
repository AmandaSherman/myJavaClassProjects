//Write a program that prompts a user to enter two strings
// and then checks the strings entered and reports
// if either the first string is a substring of the second string,
// or if the second string is a substring of the first string.

import java.util.Scanner;

public class TwoStrings {
    public static void main (String[] args) {
//        Prompt user to input two strings
        System.out.print("Enter first string: ");
        String first = input.nextLine();
        System.out.print("Enter second string: ");
        String second = input.nextLine();

//        Compare strings
        if (first.contains(second))
            System.out.println("Your second string " + second + " is a substring of your first string " 
                    + first + " !!")
        else if (second.contains(first))
            System.out.println("Your first string " + first + " is a substring of you second string "
                    + second + " !!")
            
        }
    }
}
