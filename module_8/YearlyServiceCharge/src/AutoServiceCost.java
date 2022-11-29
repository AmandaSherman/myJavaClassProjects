/*Amanda Sherman
11/28/2022
Module 8 Assignment
Bellevue University
 */

public class AutoServiceCost {

    final static double SERVICE_CHARGE = 75;

    public static double yearlyService() {
        return SERVICE_CHARGE;
    }

    public static double yearlyService(double oilChange) {
        return SERVICE_CHARGE + oilChange;
    }

    public static double yearlyService(double oilChange, double tireRotation) {
        return SERVICE_CHARGE + oilChange + tireRotation;
    }

    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        return SERVICE_CHARGE + oilChange + tireRotation - coupon;
    }

    public static void main(String[] args) {

        System.out.println("Standard service charge only");
        System.out.println(yearlyService());

        System.out.println("\nStandard service charge with oil change");
        System.out.println(yearlyService(90));

        System.out.println("\nStandard service with high mileage oil change");
        System.out.println(yearlyService(110.80));

        System.out.println("\nStandard service, oil change, and tire rotation");
        System.out.println(yearlyService(90, 45));

        System.out.println("\nStandard service, high mileage oil change, and tire rotation");
        System.out.println(yearlyService(110.80, 60));

        System.out.println("\nStandard service charge, oil change, tire rotation, with added coupon!");
        System.out.println(yearlyService(90, 45, 60));

        System.out.println("\nStandard service charge, high mileage oil change, tire rotation, with added coupon!");
        System.out.println(yearlyService(110.80, 60, 60));
    }
}