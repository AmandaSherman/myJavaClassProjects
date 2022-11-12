/*
Amanda Sherman
11/14/2022
Bellevue University
Module 5 Assignment
 */

public class ThreetoNinetynine {
    public static void main(String[] args) {

        double answer = 0;

        for (double num = 3.0; num <=99; num += 2) {
            answer += (1.0 / num);
        }
        System.out.println(answer);

        double answer2 = 0;

        for (double num = 99.0; num >=3; num -= 2) {
            answer2 += (1.0 / num);
        }
        System.out.print(answer2);
    }
}
