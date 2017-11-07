package com.tasks2;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int increment = length / 2;
        while (increment > 0){
            for (int i = 0; i < length; i++) {
                int j = i;
                int temp = array[i];
                while (j >= increment && array[j - increment] > temp){
                    array[j] = array[j - increment];
                    j -= increment;
                }
                array[j] = temp;
            }
            increment /= 2;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}