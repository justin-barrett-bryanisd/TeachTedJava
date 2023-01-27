
/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class CSPUnit5Review {

    public static void main(String[] args) throws Exception {
//        int[] nums={1,2,3,7};
//        nums[2]=nums[1];
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("---------");
//        System.out.println(nums[0]);
//        System.out.println(nums[nums.length-1]);
//        ArrayList<String> line=new ArrayList<String>();
//        line.add("Carl");
//        line.add("Jose");
//        line.add("Amanda");
//        
//        //line.remove(1);
//        line.add(1, "Jimmy");
//        
//        System.out.println(line);
//        for (int i = 0; i <10; i--) {
//            System.out.println(i);
//        }
//        String[] names={"Rob","Sue","Beel","Joo"};
//        int[] grades={    84,    70, 68   ,   91};
//        ArrayList<String> abHonorRoll=new ArrayList<String>();
//        ArrayList<String> threeLetterNames=new ArrayList<String>();
//        for (int i = 0; i < names.length; i++) {
//            if(grades[i]>=80){
//                abHonorRoll.add(names[i]);
//            }
//            if(names[i].length()<4){
//                threeLetterNames.add(names[i]);
//            }
//        }
//        System.out.println("Honor Roll: "+abHonorRoll);
//        System.out.println("Three Letter Names: "+threeLetterNames);

//        int[] grades={   84,    70, 68,     91};
//        int min=grades[0];
//        int max=grades[0];
//        for (int i = 1; i < grades.length; i++) {
//            if(grades[i]>max)   max=grades[i];
//            if(grades[i]<min)   min=grades[i];
//        }
//        System.out.println(max+"   "+min);
        int positions = 4, guys = 10, girls = 3;
        int threeGirlsHired = 0;

        for (int j = 0; j < 100000; j++) {

            ArrayList<String> applicant = new ArrayList<String>();
            for (int i = 0; i < guys; i++) {
                applicant.add("guy");
            }
            for (int i = 0; i < girls; i++) {
                applicant.add("girl");
            }
            Collections.shuffle(applicant);
            //System.out.println(applicant);
            int girlCount = 0;
            for (int i = 0; i < 4; i++) {
                if (applicant.get(i).equals("girl")) {
                    girlCount++;
                }
            }
            //System.out.println(girlCount);
            if (girlCount == 3) {
                threeGirlsHired++;
            }
        }
        System.out.println(threeGirlsHired);

    }

}
