package ro.siit;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Algorithms algo = new Algorithms();
        Scanner scan = new Scanner(System.in);
        String str1 = "Enter a positive integer bigger than 0:"; //message for input of positive integer
        String str2 = "Enter an integer:"; //message for input of integer

        System.out.println("Calculate the sum of the first 100 numbers higher than 0:");
        System.out.println(algo.sumFirstOnehundred());
        System.out.println(" ");

        System.out.println("Display the smallest number from an array of number");
        System.out.println(algo.smallestNumberInArray(Algorithms.randomArray(Algorithms.getPositiveInt(scan,str1), Algorithms.getPositiveInt(scan,str1))));
        System.out.println(" ");

        System.out.println("Display the max digit from a number. "+str2);
        System.out.println(algo.maxDigitFromNumber(scan.nextInt()));
        System.out.println(" ");

        System.out.println("Check if a number is palindrom. "+str2);
        algo.palindromCheck(scan.nextInt());
        System.out.println(" ");

        System.out.println("Display all the prime numbers lower than a given number");
        algo.primeNumbersDispaly(Algorithms.getPositiveInt(scan,str1));
        System.out.println(" ");

        //to be contiuned to write results in an excel using apache.poi API
    }
}