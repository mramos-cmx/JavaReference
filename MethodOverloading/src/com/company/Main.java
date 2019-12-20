package com.company;

/*
Method overloading is when we use the same method name with different parameters.

When overloading methods, you need to create a unique method signature. Each method name is the same, so the
signature is in the parameters. Just changing the return type won't change the signature.

Method overloading is considered good practice rather than having separate names for code that does a similar
process.

- improves code readability and re-usability
- easier to remember just one method name
- achieves consistency in naming
- gives us flexibility to call a similar method with different types of data
 */

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Michael", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double measurement = calcFeetAndInchesToCentimeters(5, 11);
        System.out.println("5 ft, 11 inches in cm is " + measurement + "cm");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // CHALLENGE
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0) return -1;

        // converts feet to inches then to cm, adds to converted inches
        return calcFeetAndInchesToCentimeters(feet * 12) + calcFeetAndInchesToCentimeters(inches);
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) return -1;

        return inches * 2.54;
    }

}
