package GatikPrasher;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] sortedArray = sortNumber(new int[] {7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] randomArray = new int[len];
        for(int i = 0; i < len; i++){

            randomArray[i] = random.nextInt(1000);

        }

        return randomArray;
    }

    public static int[] sortNumber(int[] sort) {

        int[] Array = Arrays.copyOf(sort, sort.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
        }

        for(int i = 0; i < Array.length - 1; i++){
            if(Array[i] < Array[i + 1]) {

                temp = Array[i];
                Array[i] = Array[i + 1];
                Array[i + 1] = temp;
                flag = true;
            }
        }

        return sort;


    }
}
