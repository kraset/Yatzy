package com.company;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class YatzyEvaluator {

    public static boolean isYatzy(int[] roll){
        int number = roll[0];
        return (number == roll[1] &&
                number == roll[2] &&
                number == roll[3] &&
                number == roll[4] );
    }

    public static boolean isFourOfAKind(int[] roll){
        int[] numbers  = new int[6];
        for (int i=0; i<roll.length; i++){
            numbers[roll[i]-1]++;
        }
        //System.out.println(numbers[10]);

        return (numbers[0] >=4 ||
                numbers[1] >=4 ||
                numbers[2] >=4 ||
                numbers[3] >=4 ||
                numbers[4] >=4 ||
                numbers[5] >=4 );
    }

    public static boolean isThreeOfAKind(int[] roll){
        return true;
    }

    public static boolean isSmallStraight(int[] roll){
        return true;
    }

    public static boolean isBigStraight(int[] roll){
        return true;
    }

    /*
     * Test how to use the scanner with Unit-Test.
     *
     * Note!!! While unit-testing the keyboard cannot be used!
     * Therefore, the UnitTest class will redirect input in System.in from keyboard
     * to a bytestream, like this:
     *
     * String input = "Christian\nAndersson\n25";
     * System.setIn(new ByteArrayInputStream(input.getBytes()));
     *
     * After that, this method is called from the UnitTest.
     */
    public static Person enterPersonDetails(){
        Scanner scanner = new Scanner(System.in);

        //The input will not come from keyboard, but from the predefined bytearray: Christian
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println(firstName);

        //The input will not come from keyboard, but from the predefined bytearray: Andersson
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println(lastName);


        //The input will not come from keyboard, but from the predefined bytearray: 25
        System.out.println("Enter age: ");
        String age = scanner.nextLine();
        System.out.println(age);
        int ageNumber = Integer.parseInt(age); //parse to integer

        return new Person(firstName, lastName, ageNumber);
    }

}
