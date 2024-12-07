package GatikPrasher;

import java.util.Arrays;
import java.util.Scanner;

import static GatikPrasher.ReverseArray.readIntegers;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        reverse(returnedArray);
        System.out.println("Final: " + Arrays.toString(returnedArray));
    }

    public static void reverse (int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i] = temp;
            System.out.println("---> " + array.toString());

        }

    }
}
