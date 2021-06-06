/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Oliver Moreno
 */
package ex22;

import java.util.Scanner;
/*
Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different.
If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges
Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String firstNum = in.nextLine();
        System.out.print("Enter the second number: ");
        String secondNum = in.nextLine();
        System.out.print("Enter the third number: ");
        String thirdNum = in.nextLine();

        // converting strings to integers
        int x = Integer.parseInt(firstNum);
        int y = Integer.parseInt(secondNum);
        int z = Integer.parseInt(thirdNum);

        // if any of the numbers are the same, exit the program
        if (x == y || x == z || y == z) {
            System.exit(0);
        }
        // x is the largest number
        if (x > y && x > z) {
            System.out.printf("The largest number is %d.\n", x);
        }
        // y is the largest number
        if (y > x && y > z) {
            System.out.printf("The largest number is %d.\n", y);
        }
        // z is the largest number
        if (z > x && z > y) {
            System.out.printf("The largest number is %d.\n", z);
        }

    }
}
