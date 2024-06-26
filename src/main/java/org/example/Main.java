package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

int [] smallNums = {1, 2, 3, 4, 5};



//all arrays are on the heap

System.out.println(Arrays.toString(smallNums));
System.out.println(smallNums[0]);
        System.out.println(smallNums[1]);
        System.out.println(smallNums[2]);
        System.out.println(smallNums[3]);
        System.out.println(smallNums[4]);

        for (int i = 0; i < smallNums.length; i++) {
            System.out.println(smallNums[i]);
        }



    }
}