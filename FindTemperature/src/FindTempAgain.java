import javax.swing.*;

public class FindTempAgain {
    public static void main(String[] args) {

        int waterMass;
        String massInput;

        massInput = JOptionPane.showInputDialog (null, "Enter amount of"
                + " water in kg");

        waterMass = Integer.parseInt(massInput);

        int initialTemp;
        String initialTempInput;

        initialTempInput = JOptionPane.showInputDialog ( null, "Enter "
                +"initial water temperature in Celsius");

        initialTemp = Integer.parseInt (initialTempInput);

        int finalTemp;
        String finalTempInput;

        finalTempInput = JOptionPane.showInputDialog ( null, "Enter "
                +"final water temperature in Celsius");

        finalTemp = Integer.parseInt (finalTempInput);

        int Q;
        Q = waterMass * (finalTemp - initialTemp) * 4184;

        JOptionPane.showMessageDialog ( null, "The Energy needed to "
                +"heat " + waterMass + "kg of water from " + initialTemp + " degrees Celsius"
                +" to " + finalTemp + " degrees Celsius is " + Q + " Joules.");
    }
}
