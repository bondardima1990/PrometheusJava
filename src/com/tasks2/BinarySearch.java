package com.tasks2;

public class BinarySearch {

    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;

        System.out.println(binarySearch(data, numberToFind, 0, data.length - 1));
        System.out.println(binarySearch(data, numberToFind));
    }

    private static int binarySearch(int[] array, int numberToFind, int left, int right) {

        if (left > right)
            return -1;

        int middle = left + (right - left) / 2;

        if (array[middle] == numberToFind)
            return middle;
        else if (array[middle] > numberToFind)
            return binarySearch(array, numberToFind, left, middle - 1);
        else
            return binarySearch(array, numberToFind, middle + 1, right);
    }

    private static int binarySearch(int[] array, int numberToFind) {

        int i = -1;

        if (array != null) {

            int left = 0;
            int right = array.length;
            int mid;

            while (left < right){
                mid = (left + right) / 2;
                if (array[mid] == numberToFind){
                    i = mid;
                    break;
                } else {
                    if (numberToFind < array[mid])
                        right = mid;
                    else
                        left = mid + 1;
                }
            }
        }
        return i;
    }
}