package com.company;

/*
Floating point numbers are fractional numbers. Floating points are real numbers and are used for precision.

Float is a single precision number
Double is a double precision number

Floats (single precision) occupies 32 bits (4 bytes). Double precision is 2x that. (64 bits/8 bytes)

Doubles have a much larger range and more precision than floats. Keep that in mind for mathematical operations
where precision is important.

Floating point numbers are *assumed* to be doubles unless you explicitly state otherwise.

A float will have up to 7 digits after the decimal point
A double will have up to 16

The double PDT is recommended because it's faster to process at the chip level and in the Java library's Math
functions.

Float and double are good for GENERAL floating point operations. However, for problems that require precision,
they aren't the best. BigDecimal is built to handle this.
 */
public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.0 / 3.0;  // Java automatically treats floating point numbers as doubles!

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double pounds = 100.0;
        poundsToKilograms(pounds);
    }

    private static void poundsToKilograms(double pounds) {
        System.out.println(pounds + " pound(s) is " + (pounds * 0.45359237) + " kilogram(s)");
    }
}
