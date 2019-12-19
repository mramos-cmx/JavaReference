package com.company;

/*
Char and String are N O T the same thing. It's similar in that it can store characters, but it can only store
a SINGLE character.

Although it's only a one character type, a char occupies 2 bytes (16 bits) of memory. It's because it allows you
to store Unicode characters that it doesn't just take up less space. Unicode can be represented by a four digit
hex code as well (see a chart at unicode-table.com)

A boolean value allows for 2 choices. T/F, Y/N, or 1/0. In Java it's going to be either true or false.

 */

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';  // SINGLE quotes
        char myUnicodeChar = '\u0044';  // notice that there's no error even though there's more than one character
        char myCopyrightChar = '\u00A9';  // the copyright symbol
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        boolean myTrueBool = true;
        boolean myFalseBool = false;

        boolean isCustomerOver21 = true;

        if (isCustomerOver21) {
            System.out.println("Legal!");
        } else {
            System.out.println("Not legal!");
        }
    }
}
