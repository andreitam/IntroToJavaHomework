package ro.siit;

import java.util.Scanner;
import java.util.Random;
/**
 * The Algorithms program implements the algorithms that
 * are used to solve the homework, due on 9th of August.
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-03
 */
public class Algorithms {
    /**
     * Method calculates the sum of the first 100 numbers higher than 0
     *
     * @return the sum of the first 100 numbers higher than 0
     */
    public int sumFirstOnehundred() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
    /**
     * Method displays the smallest number from an array of number
     *
     * @param arr an integer array.
     * @return the smallest number in the array
     */
    public int smallestNumberInArray(int[] arr) {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }
    /**
     * Method for generation of an array with positive random numbers bound
     *
     * @param length the length of the array to be generated
     * @param bound the bound for the random generation
     * @return an array with integers
     */
    public static int[] randomArray(int length,int bound) {
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
     * Method for displaing the max digit from a number.
     * Works with negative integers also
     *
     * @param n the number to be checked
     * @return the biggest digit from the input n number
     */
    public int maxDigitFromNumber(int n) {
        int max = 0;
        while (n != 0) {
            int rem = n % 10;
            if (Math.abs(rem) >= max) {
                max = Math.abs(rem);
            }
            n = n / 10;
        }
        return max;
    }
    /**
     * Method checking if a number is palindrom( e.g palindrom 1221, 34143)
     * Works with negative integers also.
     * Return void, BUT outputs a message if the number is
     * or is NOT palindrome.
     *
     * @param n the number to be checked
     * @return void
     */
    public void palindromCheck(int n) {
        int number = n;
        int reversed = 0;
        //calculate reversed
        do {
            reversed = (reversed * 10) + n % 10;
            n = n / 10;
        }while(n != 0);
        if (number==reversed) {
            System.out.println("The number "+number+" is a palindrome");
        }
        else {
            System.out.println("The number "+number+" is NOT a palindrome");
        }
    }
    /**
     * Method for displaing all the prime numbers lower than a given number
     * Returns void, BUT prints the prime numbers.
     *
     * @param range the range for displaying the prime numbers
     * @return void
     */
    public void primeNumbersDispaly(int range) {
        for (int i = 0;i <= range; i++) {
            if (primeNumberCheck(i)==true) {
                System.out.print(" "+i+" ");
            }
        }
    }
    /**
     * Method to check if number is prime
     * Method is private and used within the class
     *
     * @param n the number to be checked
     * @return true - number prime, false - the number is not prime.
     */
    private static boolean primeNumberCheck (int n) {
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
    /**
     * Method to validate positive integer
     * from online course of SIIT :)
     *
     * @param keyboard input from keyboard as Scanner object.
     * @param s the message to be displayed for input.
     * @return the positive number
     */
    public static int getPositiveInt(Scanner keyboard, String s) {
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
}

