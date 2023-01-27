/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import java.lang.reflect.Array;
import javax.swing.*;

public class CSPUnit5Review2 {
    public static void main(String[] args) throws Exception {
        int positions = 4, guys = 10, girls = 3;
        int threeGirlsHired = 0;
        
        for(int j=0; j<600000; j++){
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
