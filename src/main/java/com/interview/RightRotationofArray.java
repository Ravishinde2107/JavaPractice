package com.interview;

public class RightRotationofArray {

    // To right rotate arr[] of size N by D
    void rightRotate1(int arr[], int d, int n)
    {

        // If arr is rotated n times then
        // you get the same array
        while (d > n) {
            d = d - n;
        }

        // Creating a temporary array of size d
        int temp[] = new int[n - d];

        // Now copying first N-D element in array temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i];

        // Moving the rest element to index zero to D
        for (int i = n - d; i < n; i++) {
            arr[i - n + d] = arr[i];
        }

        // Copying the temp array element
        // in original array
        for (int i = 0; i < n - d; i++) {
            arr[i + d] = temp[i];
        }
    }

    // To print an array
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)

            // Printing elements of an array
            System.out.print(arr[i] + " ");
    }

    // Method 3
    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class inside main() method
        RightRotationofArray rotate = new RightRotationofArray();

        // Custom input array
        int arr[] = { 1, 2, 3, 4, 5 };

        // Calling method1 to rotate array
        rotate.rightRotate1(arr, 2, arr.length);

        rotate.printArray(arr, arr.length);
    }

    // To right rotate array of size n by d
    void rightRotate2(int arr[], int d, int n)
    {
        // Iterating till we want
        for (int i = n; i > d; i--)

            // Recursively calling
            rightRotatebyOne(arr, n);
    }

    // To rotate array by 1
    void rightRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

}
