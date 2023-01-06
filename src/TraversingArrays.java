/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class TraversingArrays {
    public static void main(String[] args) throws Exception {
        int nums[]={1,2,5,7,8,4,6};
        System.out.println(Arrays.toString(evensArray(nums)));
        int nums2[]={1,1,1,1};
        System.out.println(Arrays.toString(evensArray(nums2)));
        
    }
    
    public static int[] evensArray(int[] nums){
        int numOfEvens=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0)
                numOfEvens++;
        }
        
        int[] evens=new int[numOfEvens];
        int j=0;   //j will mark where we are in the evens array
        
        for (int i = 0; i < nums.length; i++) {   //i will mark where we are in the nums array
            if(nums[i]%2==0){
                evens[j++]=nums[i];
            }
        }        
        return evens;
    }

}
