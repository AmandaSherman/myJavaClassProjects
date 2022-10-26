/*
Amanda Sherman
Bellevue University
Module 2 Programming Assignment

Version 1
 */

import java.util.Scanner;

public class FindTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print ("Enter amount of water in kg: ");
        double waterMass = input.nextDouble();

        System.out.print ("Enter initial water temperature in Celsius: ");
        double initialTemp = input.nextDouble();

        System.out.print ("Enter final water temperature in Celsius: ");
        double finalTemp = input.nextDouble();

        double Q;
        Q = waterMass * (finalTemp - initialTemp) *4184;

        System.out.print ("The energy needed to heat " + waterMass + "kg of water from "
                + initialTemp + " degrees Celsius to " + finalTemp + " degrees Celsius is "
                + Q + " Joules.");
    }
}
