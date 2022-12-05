/*Amanda Sherman
12/04/2022
Module 9 Assignment
Bellevue University*/

import java.util.Scanner;

public class Array_Calculations {

    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        //Declare the array name and size
        int[] harray = new int[20];

        //Read input for the array
        System.out.print("Enter 20 integer values each separated by \"Enter\": ");
        for(int value=0; value<20; value++) {
            harray[value] = keyboard.nextInt();
        }

        //Initialize max and min value
        int max_value = harray[0];
        int min_value = harray[0];

        //find max value
        for (int values = 0; values < harray.length; values++) {
            if (harray[values] > max_value)
                max_value = harray[values];
        }
        //find min value
        for (int values = 0; values < harray.length; values++) {
            if (harray[values] < min_value)
                min_value = harray[values];
        }

        //Initialize sum
        int sum = 0;

        for( int num : harray) {
            sum += num;
        }

        //turn sum into double to get accurate average value
        double sum2 = sum;
        double average = sum2 / 20;

        //Print the calculations
        System.out.println("The highest value in the array is "+ max_value);

        System.out.println("The lowest value in the array is "+ min_value);

        System.out.println("The average of all the integers in the array is "+ average);

        System.out.println("The sum of all the integers in the array is "+ sum);
    }
}
