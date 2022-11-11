/*
Amanda Sherman
11/14/2022
Bellevue University
Module 5 Assignment
 */

public class ThreetoNinetynine {
    public static void main(String[] args) {
        double answer = 0;

//for loop (initial action; condition for loop; action-restart)
        for (int num = 3; num <=99; num = num +2) {
            answer += (1 / num);
        }
            System.out.printf("%.4f\n", answer);


    }
}
