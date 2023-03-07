
/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class ArrayAlgorithms {

    public static void main(String[] args) throws Exception {
        double[] arr = {1.2, 3.4, 5.6, 7.8};
        
        for (double num : arr) {
            num++;
            System.out.println(num+"x");
        }
        System.out.println(Arrays.toString(arr));
//        int loc = 2;
//        insertItem(0.1, loc, arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(loc);
//        deleteItem(2, arr);
//        System.out.println(Arrays.toString(arr));
//        swap(0,3,arr);
//        System.out.println(Arrays.toString(arr));
        BetterButton button;
    }

    public static void insertItem(double item, int loc, double[] array) {
        double temp = array[loc];
        array[loc] = item;
        while (loc < array.length - 1) {
            System.out.println("++" + Arrays.toString(array));
            item = temp;
            loc++;
            temp = array[loc];
            array[loc] = item;
        }

    }

    public static void deleteItem(int loc, double[] array) {
        while (loc < array.length - 1) {
            array[loc] = array[loc + 1];
            loc++;
        }
        array[loc]=0;
    }

    public static void swap(int loc1, int loc2, double[] arr) {
        double temp=arr[loc1];
        arr[loc1]=arr[loc2];
        arr[loc2]=temp;

    }
}
