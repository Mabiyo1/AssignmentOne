/*
Write a Java program to solve the following problem using modularity:
        -- Write a method that rotates a one-dimensional array with one position to the left in a circular
        way, so that the first element becomes the last element (shift left). Call this method
        shiftLeft. For example, if the array is 17 34 22 55 37 10, then after rotation the array is
        34 22 55 37 10 17
        -- Write a method that rotates a one-dimensional array with one position to the right in a
        circular way, so that the last element becomes the first element (shift right). Call this method
        shiftRight. For example, if the array is 17 34 22 55 37 10, then after rotation the array is 10
        17 34 22 55 37
        -- Overload the method shiftLeft so that you rotate the array left by k positions. For example,
        if the array is 17 34 22 55 37 10 and k = 2, then after rotation the array is 22 55 37 10 17
        34
        -- Overload the method shiftRight so that you rotate the array right by k positions. For
        example, if the array is 17 34 22 55 37 10 and k = 2, then after rotation the array is
        37 10 17 34 22 55
        -- Write a method shiftLeftK so that you rotate the array left by k positions. The method
        should preserve the original array and save the results of the left rotation into a second array.
        Method signature: public static int[] shiftLeftK(int[]list, int s, int k)
        -- Write a method shiftRightK so that you rotate the array right by k positions. The method
        should preserve the original array and save the results of the right rotation into a second
        array. Method signature: public static int[] shiftRightK(int[]list, int s, int k)
Your program will invoke methods to initialize the array (random values between 1 and 100) print the
array before the rotation, rotate the array, and then print the array (or the resulting array) after
rotation. Use dynamic arrays and ask the user for the array size. Like in the previous program, you will
use a method called menu(), that should print a list of options , including the option to exit the
program. Your program should loop until the user chooses to exit. In this loop you are required to use a
switch statement for all possible cases.
 */
public class Modularity {
    public static void main(String[] args) {
        //TODO: Driver program
    }

    //TODO: shiftLeft
    public static void shiftLeft(int[] arr, int size) {

    }

    //TODO: shiftRight
    public static void shiftRight(int[] arr, int size) {

    }

    //TODO: shiftLeft by k
    public static void shiftLeft(int[] arr, int size, int k) {

    }

    //TODO: shiftRight by k
    public static void shiftRight(int[] arr, int size, int k) {

    }

    //TODO shiftLeftK value returning
    public static int[] shiftLeftK(int[] arr, int size, int k) {
        return new int[]{};
    }

    //TODO: shiftRightK value returning
    public static int[] shiftRightK(int arr, int size, int k) {
        return new int[]{};
    }

    //TODO: menu method
    public static void menu() {

    }
}
