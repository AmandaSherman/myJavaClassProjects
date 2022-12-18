/*
Amanda Sherman
12/17/2022
Module 11 Assignment
Bellevue University
 */

import java.util.Arrays;

public class BigandSmall {

    public static void main(String[] args){
        int [][] array = {
                {3, 81, 3, 75},
                {5, 73, 976, 37, 48},
                {1, 20, 17, 56}
        };
        double [][] array2 = {
                {56.98, 20.17, 19.82, .0009},
                {81.04, .11, 73.66, .00098, 9.9, 1.09, .2, 126.6},
                {3.00, 16.17, -.5, .00099},
                {.26, 47.09, .0008}
        };

        System.out.println("The location of the largest element in the int array is:" +
                Arrays.toString(locateLargest(array)));

        System.out.println("The location of the largest element in the double array is:" +
                Arrays.toString(locateLargest(array2)));

        System.out.println("The location of the smallest element in the int array is:" +
                Arrays.toString(locateSmallest(array)));

        System.out.println("The location of the smallest element in the double array is:" +
                Arrays.toString(locateSmallest(array2)));
    }
    public static int [] locateLargest (int [][] arrayParam) {
        int [] result = {0, 0};
        int largest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam.length[i]; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
    return result;
    }
    public static int [] locateLargest (double [][] arrayParam) {
        int [] result = {0, 0};
        double largest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
    return result;
    }
    public static int [] locateSmallest (int [][] arrayParam) {
        int [] result = {0, 0};
        int smallest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
    return result;
    }
    public static int [] locateSmallest (double [][] arrayParam) {
        int [] result ={0, 0};
        double smallest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
    return result;
    }
}
