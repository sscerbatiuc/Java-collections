/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningcollections.sorting.arrays;

/**
 *
 * @author sscerbatiuc
 */
public class SortArrays {

    public static void main(String[] args) {
        int[] arr = {10, 12, 15, 1, 16, 18, 19, 31, 52, 6};

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                System.out.println(arr[i] + "<" + arr[i - 1]);
                System.out.println(arr[i] + "=" + arr[i] + "+" + arr[i - 1]);
                arr[i] = arr[i] + arr[i - 1];
                System.out.println(arr[i - 1] + "=" + arr[i] + "-" + arr[i - 1]);
                arr[i - 1] = arr[i] - arr[i - 1];

                System.out.println(arr[i] + "=" + arr[i] + "-" +  arr[i - 1]);
                arr[i] = arr[i] - arr[i - 1];

                i = 0;

            }

        }

        System.out.println("sorted Array :");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + " ");
        }
    }
}