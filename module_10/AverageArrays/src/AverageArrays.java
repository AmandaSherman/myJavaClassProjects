/* Amanda Sherman
12/11/2022
Module 10 Assignment
Bellevue University */


import java.util.Arrays;

public class AverageArrays {

    public static short average(short [] array) {
        short sum = 0;
        for (short num : array) {
            sum = (short) (sum + num);
        }
        return (short) (sum / array.length);
    }

    public static long average(long [] array) {
        long sum = 0;
        for (long num : array) {
            sum = sum + num;
        }
        return sum / array.length;
    }

    public static int average(int [] array) {
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        return sum / array.length;
    }

    public static double average(double [] array) {
        double sum = 0;
        for(double num : array) {
            sum = sum + num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        short [] arrayshort = {1, 5, 9, 14};
        long [] arraylong = {98, 45, 730, 222, 13, 120};
        int [] arrayint = {4, 10, 27, 36, 45, 54, 63, 72, 81};
        double  [] arraydouble = {1.04, 2.95, 29.37, 200.12, 40.19};

        System.out.println("The first array is " + Arrays.toString(arrayshort));
        System.out.println("The average of this array is " + average(arrayshort));

        System.out.println("The second array is " + Arrays.toString(arraylong));
        System.out.println("The average of this array is " + average(arraylong));

        System.out.println("The third array is " + Arrays.toString(arrayint));
        System.out.println("The average of this array is " + average(arrayint));

        System.out.println("The last array is " + Arrays.toString(arraydouble));
        System.out.println("The average of this array is " + average(arraydouble));
    }
}
