package com.ArrayOpeerations;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArraysOperations {
    public static void main(String[] args) {

        //| #  | Operation       | Description |
        //|----|-----------------|-------------|
        //| 1  | **Traversal**    | Visit each element to display or process it. |
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //| 2  | **Insertion**    | Add an element at a specific index or position. |
        int[] arr2 = new int[6];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        int n = 3; // current size

        int pos = 1, x = 15;
// Shift elements to the right
        for (int i = n; i > pos; i--) {
            arr2[i] = arr2[i - 1];
        }
        arr2[pos] = x;
        n++;

        System.out.println(Arrays.toString(Arrays.copyOf(arr2, n)));

        //| 3  | **Deletion**     | Remove an element from a given index. |
        int[] arr3 = {10, 20, 30, 40, 50};
        int n3 = arr3.length;
        int indexToDelete = 2;

        for (int i = indexToDelete; i < n3 - 1; i++) {
            arr3[i] = arr3[i + 1];
        }

        n3--; // Decrease size
        System.out.println(Arrays.toString(Arrays.copyOf(arr, n3)));

        //| 4  | **Searching**    | Find an element (e.g., Linear Search, Binary Search). |
        int[] arr4 = {10, 20, 30, 40};
        int key = 30;

        int index = -1;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);

        //| 5  | **Updating**     | Modify the value at a given index. |
        int[] arr5 = {10, 20, 30, 40};
        arr5[2] = 99; // Update index 2
        System.out.println(Arrays.toString(arr5));

        //| 6  | **Sorting**      | Arrange elements (e.g., Bubble, Merge, Quick). |
        int[] arr6 = {40, 10, 20, 30};
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));

        //| 7  | **Merging**      | Combine two arrays into one. |
        int[] a = {10, 20};
        int[] b = {30, 40};
        int[] merged = new int[a.length + b.length];

        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);

        System.out.println(Arrays.toString(merged));

        //| 8  | **Reversing**    | Reverse the elements of the array. |
        int[] arr8 = {10, 20, 30, 40};

        int start = 0, end = arr8.length - 1;
        while (start < end) {
            int temp = arr8[start];
            arr8[start] = arr8[end];
            arr8[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr8));

        //| 9  | **Splitting**    | Split an array into two or more arrays. |
        int[] arr9 = {10, 20, 30, 40, 50, 60};

        int mid = arr9.length / 2;
        int[] left = Arrays.copyOfRange(arr9, 0, mid);
        int[] right = Arrays.copyOfRange(arr9, mid, arr.length);

        System.out.println("Left: " + Arrays.toString(left));
        System.out.println("Right: " + Arrays.toString(right));

        //| 10 | **Rotating**     | Rotate elements left or right by k steps. |
        int[] arr10 = {10, 20, 30, 40};

        int first = arr10[0];
        for (int i = 0; i < arr10.length - 1; i++) {
            arr10[i] = arr10[i + 1];
        }
        arr10[arr10.length - 1] = first;

        System.out.println(Arrays.toString(arr10));

        //| 11 | **Copying**      | Create a duplicate of the array. |
        int[] original = {10, 20, 30};
        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println(Arrays.toString(copy));

        //| 12 | **Resizing**     | Create a new array with a different size (manually in static arrays). |
        int[] oldArray = {1, 2, 3};
        int[] newArray = new int[oldArray.length * 2];

        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        System.out.println(Arrays.toString(newArray)); // Extra space with zeros
        //| 13  | Removing Duplicates    | Eliminate repeated elements |
        int[] arr13 = {10, 20, 20, 30, 30, 30, 40};
        int n13 = arr13.length;
        int[] result = new int[n13];
        int j = 0;

        for (int i = 0; i < n13 - 1; i++) {
            if (arr13[i] != arr13[i + 1]) {
                result[j++] = arr13[i];
            }
        }
        result[j++] = arr13[n13 - 1];

        System.out.println(Arrays.toString(Arrays.copyOf(result, j)));

        int[] arr133 = {30, 10, 20, 10, 30, 40};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr133) {
            set.add(num);
        }
        System.out.println(set);


        //| 14  | Sliding Window         | Efficient processing of subarrays |
        int[] arr14 = {1, 2, 3, 4, 5, 6};
        int k = 3;

        for (int i = 0; i <= arr14.length - k; i++) {
            int sum = 0;
            for (int m = i; m < i + k; m++) {
                sum += arr14[m];
            }
            System.out.println("Sum of window starting at " + i + ": " + sum);
        }

        //| 15  | Finding Max/Min        | Get the maximum and minimum elements |
        int[] arr15 = {10, 40, 5, 70, 20};

        int max = arr15[0];
        int min = arr15[0];

        for (int i = 1; i < arr15.length; i++) {
            if (arr15[i] > max) max = arr15[i];
            if (arr15[i] < min) min = arr15[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);



    }
}
