/*
Amanda Sherman
11/14/2022
Bellevue University
Module 5 Assignment
 */

public class ThreetoNinetynine {
    public static void main(String[] args) {
        //Assign the initial value
        double num = 3.0;
//for loop (initial action; condition for loop; action-restart)
        for (num = 3.0; num <=99.0; num = num +2) {
            double answer = 1 / num;
            //loop body
            System.out.println(answer);
        }
//while loop
        //condition or end value
        while (num >= 3.0) {
            double answer = 1 / num;
            //loop body
            System.out.println(answer);
            //action after loop then restart
            num = num - 2;
        }
    }
}
