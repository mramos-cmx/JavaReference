package com.company;

/*
byte, short, int, long, float, double, char, boolean are the eight primitive types

int, double, boolean, and char are the most commonly used types

String is a data type that's NOT a primitive type, but a class instantiation. It's kind of favored, so it has
some different properties and behaviors. A String is a sequence of characters limited by memory, or the max value
of an int

Strings are immutable in Java. You cannot change a string after it's created. A new one is created for us when
a change is made.

The code here with appending to strings is NOT the most efficient approach. StringBuffer is a better way, but
more on that later on
 */

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is now equal to " + myString);
        myString = myString + " \u00A9 2019";  // you can add in Unicode in it
        System.out.println("myString is now equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";  // because this was working with string literals, it's an append rather than math
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;  // this is STILL an append operation
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;  // STILL AN APPEND OPERATION
        System.out.println("LastString is now equal to " + lastString);

    }
}
