/*
Amanda Sherman
Bellevue University
Module 2 Programming Assignment

Version 2
 */

import javax.swing.*;

public class FindTempAgain {
    public static void main(String[] args) {

        double waterMass;
        String massInput;

        massInput = JOptionPane.showInputDialog (null, "Enter amount of"
                + " water in kg");

        waterMass = Double.parseDouble(massInput);

        double initialTemp;
        String initialTempInput;

        initialTempInput = JOptionPane.showInputDialog ( null, "Enter "
                +"initial water temperature in Celsius");

        initialTemp = Double.parseDouble (initialTempInput);

        double finalTemp;
        String finalTempInput;

        finalTempInput = JOptionPane.showInputDialog ( null, "Enter "
                +"final water temperature in Celsius");

        finalTemp = Double.parseDouble (finalTempInput);

        double Q;
        Q = waterMass * (finalTemp - initialTemp) * 4184;

        JOptionPane.showMessageDialog ( null, "The Energy needed to "
                +"heat " + waterMass + "kg of water from " + initialTemp + " degrees Celsius"
                +" to " + finalTemp + " degrees Celsius is " + Q + " Joules.");
    }
}
