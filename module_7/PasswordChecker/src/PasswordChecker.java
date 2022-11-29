/*Amanda Sherman
11/28/2022
Module 7 Assignment
Bellevue University
 */

import java.util.Scanner;

public class PasswordChecker {

    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print(
                "1. Password must be at least 8 characters long\n" +
                        "2. Must contain both letters and numbers\n" +
                        "3. Must contain one or more lower case letter\n" +
                        "4. Must contain one or more upper case letter\n" +
                        "Enter password: ");
        String password = keyboard.nextLine();

        if (valid_Password(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Not a valid password: " + password);
        }

    }

    public static boolean valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charcsCountUp = 0;
        int charcsCountLow =0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char charcs = password.charAt(i);

            if (is_Number(charcs)) numCount++;
            else if (is_Upper_Letter(charcs)) charcsCountUp++;
            else if (is_Lower_Letter(charcs)) charcsCountLow++;
            else return false;
        }


        return (charcsCountUp >= 1 && charcsCountLow >= 1 && numCount >= 1);
    }

    public static boolean is_Upper_Letter(char charcs) {

        return (charcs >= 'A' && charcs <= 'Z');
    }

    public static boolean is_Lower_Letter(char charcs) {

        return (charcs >= 'a' && charcs <= 'z');
    }


    public static boolean is_Number(char charcs) {

        return (charcs >= '0' && charcs <= '9');
    }

}