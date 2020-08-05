package ro.siit;

import java.util.Random;
import java.util.Scanner;

/**
 * Utilitaries class support functions for Algorithm classes
 *
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-05
 */
class Utilitaries {
    /**
     * Method for generation of an array with positive random numbers bound
     *
     * @param length the length of the array to be generated
     * @param bound the bound for the random generation
     * @return an array with integers
     */
    static int[] randomArray(int length,int bound) {
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0;i < length; i++) {
            arr[i] = rand.nextInt(bound);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }
    /**
     * Method to validate positive integer
     * from online course of SIIT :)
     *
     * @param keyboard input from keyboard as Scanner object.
     * @param s the message to be displayed for input.
     * @return the positive number
     */
    static int getPositiveInt(Scanner keyboard, String s) {
        int positiveNr = 0;
        boolean hasExceptions = false;
        System.out.println(s);
        do {
            try {
                positiveNr = Integer.parseInt(keyboard.nextLine());
                if (positiveNr <= 0) {
                    hasExceptions = true;
                    System.out.println("Please enter a positive number bigger than 0");
                }
                else {
                    hasExceptions = false;
                }
            }
            catch (Exception ex) {
                hasExceptions = true;
            }
        }while (hasExceptions);
        return positiveNr;
    }
    /**
     * Method to check if number is prime
     * Method is private and used within the class
     *
     * @param n the number to be checked
     * @return true - number prime, false - the number is not prime.
     */
    static boolean primeNumberCheck (int n) {
        boolean prime = false;
        if (n <= 1) {
            prime = false;
        }
        else if (n==2||n==3) {
            prime = true;
        }
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false; //the number is not prime, exit loop
                    break;
                } else {
                    prime = true;
                }
            }
        }
        return prime;
    }
}
