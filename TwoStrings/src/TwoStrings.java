//Amanda Sherman
//11/06/2022
//Bellevue University
//Module 4 Assignment

import java.util.Scanner;

public class TwoStrings {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
//        Prompt user to input two strings
        System.out.print("Enter first string: ");
        String first = input.nextLine();
        System.out.print("Enter second string: ");
        String second = input.nextLine();

//        Compare strings
        if (first.contains(second))
            System.out.println("Your second string " + second + " is a substring of your first string "
                    + first + "!!");
        else if (second.contains(first))
            System.out.println("Your first string " + first + " is a substring of you second string "
                    + second + "!!");
        else
            System.out.println("Your strings are neither a substring of the other.");
    }
}
