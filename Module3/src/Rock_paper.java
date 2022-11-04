/*
Amanda Sherman
Bellevue University
Module 3 Programming Assignment

Rock, Paper, Scissors
 */

import java.util.Scanner;

public class Rock_paper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number 1-Rock, 2-Paper, or 3-Scissor: ");
        int human = input.nextInt();

        int computer = (int)((Math.random() * (4 - 1)) + 1);
        System.out.print("The computer chose: "+ computer + "-");

        //I kept getting a prompt to change to an enhanced switch statement.
        //I kept this one because this is like the version in the text, and it worked fine for me.
        switch (computer) {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissor");
        }

        //I could have done this if, else if, and else. This made more sense to me though.
        if (human == computer)
            System.out.println("Tie Game");
        else if (((human == 1) && (computer == 2))
            || ((human == 2) && (computer == 3))
            || ((human == 3) && (computer == 1)))
            System.out.println("You lose");
        else if (((human == 1) && (computer == 3))
                || ((human == 2) && (computer == 1))
                || ((human == 3) && (computer == 2)))
            System.out.println("You win!");
    }

}
