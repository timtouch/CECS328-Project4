package com.cecs328;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Description: The program asks for a target sum. The user inputs the target and
 * the program uses the given array to find if any two values in the array equals the target sum.
 * The program will print the successful values if it finds them or informs the user that none was found.
 *
 * Created by Timothy on 10/17/2016.
 */
public class SumTwo {

    public static void main(String[] args) {
        Integer sum;
        Integer[] A = {2, 13, 8, 38, 63, 9, 11, 4, 1, 3};
        Hashtable<Integer, Integer> numbers = new Hashtable<>();
        Scanner in = new Scanner(System.in);

        //Populate the hash table with the array
        for (Integer aA : A) {
            numbers.put(aA, aA);
        }

        System.out.println("What sum are you looking for?");
        sum = in.nextInt();

        Integer complement;
        for (Integer aA : A) {
            complement = numbers.get(sum - aA);
            //If we found a complement, print it out

            if ((complement != null)) {
                System.out.printf("Sum: %d equals %d + %d%n", sum, aA, complement);

                return;
            }
        }

        System.out.printf("Sorry, there was no sum %d found between two number in this array", sum);


    }
}
