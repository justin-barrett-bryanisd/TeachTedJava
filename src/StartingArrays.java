/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class StartingArrays {
    public static void main(String[] args) throws Exception {
        int[] nums=new int[4];
        nums[1]=14;
        nums[0]=3;
        nums[nums[0]]=nums[1]/3;
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
