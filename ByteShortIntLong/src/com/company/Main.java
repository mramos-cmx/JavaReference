package com.company;

/*
Primitive types in Java:
- boolean
- byte: byte is a much smaller range. if using, make sure it's for a good reason. Range: [-128, 127]
- char
- short: larger range than byte, but smaller than int. [-32768, 32767]
- int: whole numbers [-2147483648, 2147483647]; Wrapper class: Integer
- long: ...long number! [-9223372036854775808, 9223372036854775807]
- float
- double

Each PDT has a wrapper class

Memory:
Byte: 8 bits (width: 8) [-2^7, 2^7)
Short: 16 bits (w: 16) 2^15 [-2^15, 2^15)
Int: 32 bits (w: 32) 2^31 [-2^31, 2^31)
Long: 64 bits (w: 64) 2^63 [-2^63, 2^63)
 */

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        // to get the range...
        // Integer is a *wrapper class* for int
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Integer max value = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1));  // this is an *overflow*
        System.out.println("Busted min value = " + (myMinIntValue - 1));  // this is *underflow*

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Minimum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Minimum Value = " + myMaxShortValue);

        long myLongValue = 100L;  // L at the end of the long literal to indicate long PDT
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Minimum Value = " + myMaxLongValue);
    }
}
