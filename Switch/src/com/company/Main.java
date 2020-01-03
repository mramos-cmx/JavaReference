package com.company;

/*
Switch statements are a form of flow control that's a different approach to the if-else statement
You have a default case which functions like the else block, and then cases where you test the value for
truthiness

switch(targetValue) {

    case [what targetValue may equal]:
        [what to do]
        break;

    ...more cases

    default:
        [what to do]
        break;

}

Choice to use switch vs. if-else tends to be stylistic.

Can be used with byte, short, char, int, and Strings (java 8+)
 */
public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        charTest('A');
        charTest('C');
        charTest('F');
        charTest('E');

    }

    public static void charTest(char character) {
        switch(character) {
            case 'A':
                System.out.println("Character was A");
                break;

            case 'B':
                System.out.println("Character was B");
                break;

            case 'C':
                System.out.println("Character was C");
                break;

            case 'D':
                System.out.println("Character was D");
                break;

            case 'E':
                System.out.println("Character was E");
                break;

            default:
                System.out.println("Character not found");
                break;
        }
    }
}
