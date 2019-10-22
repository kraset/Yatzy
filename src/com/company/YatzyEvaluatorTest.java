package com.company;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class YatzyEvaluatorTest {

    @org.junit.Test
    public void isYatzy() {
        int[] roll = {1, 2, 3, 4, 5};
        boolean isYatzy = YatzyEvaluator.isYatzy(roll);
        assertFalse(isYatzy);

        int[] roll2 = {3, 3, 3, 3, 3};
        isYatzy = YatzyEvaluator.isYatzy(roll2);
        assertTrue(isYatzy);
    }

    @org.junit.Test
    public void isFourOfAKind() {
        boolean result;

        int[] roll = {1, 2, 3, 4, 5};
        result = YatzyEvaluator.isFourOfAKind(roll);
        assertFalse(result);

        int[] roll2 = {1, 3, 3, 3, 3};
        result = YatzyEvaluator.isFourOfAKind(roll2);
        assertTrue(result);

        int[] roll3 = {1, 6, 6, 6, 6};
        result = YatzyEvaluator.isFourOfAKind(roll3);
        assertTrue(result);
    }

    @org.junit.Test
    public void isThreeOfAKind() {
        assertTrue(false);
    }

    @org.junit.Test
    public void isSmallStraight() {
        boolean result;

        int[] roll2 = {1, 3, 4, 5, 6};
        result = YatzyEvaluator.isSmallStraight(roll2);
        assertFalse(result);

        int[] roll3 = {2, 3, 4, 5, 6};
        result = YatzyEvaluator.isSmallStraight(roll3);
        assertFalse(result);

        int[] roll = {1, 2, 3, 4, 5};
        result = YatzyEvaluator.isSmallStraight(roll);
        assertTrue(result);
    }

    @org.junit.Test
    /*
     * Test a method that wants user input from scanner.
     * Instead of reading from keyboard, the scanner will use the input string below.
     * To separate between several nextLine, use \n as delimiter between each line.
     */
    public void enterName() {
        //Instead of reading from keyboard, the scanner will use the input string below.
        String input = "Christian\nAndersson\n25";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        //Now this method will ask from input from the Scanner,
        //...but it will use the input-string above instead of reading from user's keyboard
        //... so we can simulate user input from the scanner.
        Person person  = YatzyEvaluator.enterPersonDetails();
        System.out.println(person);
    }
}