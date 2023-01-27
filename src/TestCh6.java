/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class TestCh6 {
    public static void main(String[] args) throws Exception {
        int[] num=new int[4];
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < 10; i++) {
            System.out.println(num);
        }
        for (int i : num) {
            System.out.println(num[i]);
        }
    }

}
