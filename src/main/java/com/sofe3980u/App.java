package com.sofe3980u;

/* SOFE3980 Homework Assignemnt 
 * White Box Testing
 * Daniel Grewal 100768376
 */

public class App {

    public static int countCharInArray(char[] inputArray, char charToFind) {
        int count = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == charToFind)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCharInArray("hello".toCharArray(), 'l'));
    }
}
