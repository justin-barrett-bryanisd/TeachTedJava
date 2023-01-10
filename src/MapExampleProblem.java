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

public class MapExampleProblem {
    public static void main(String[] args) throws Exception {
        new File("map.txt").createNewFile();
        Scanner scan=new Scanner(new File("map.txt"));
        int lines=0;
        while(scan.hasNext()){
            scan.nextLine();
            lines++;
        }
        System.out.println(lines);
        String[] map=new String[lines];
        scan.close();
        scan=new Scanner(new File("map.txt"));
        int line=0;
        while(scan.hasNext()){
            map[line++]=scan.nextLine();
        }
        System.out.println(Arrays.toString(map));
        int aRow=-1, aCol=-1, bRow=-1, bCol=-1;
        for (int i = 0; i < map.length; i++) {
            if(map[i].contains("a")){
                aRow=i;
                aCol=map[i].indexOf("a");
                System.out.println("Found a "+aRow+" "+aCol);
            }
            if(map[i].contains("b")){
                bRow=i;
                bCol=map[i].indexOf("b");
                System.out.println("Found b "+bRow+" "+bCol);
            }
        }
        double distance=Math.hypot(aRow-bRow, aCol-bCol);
        System.out.println(new DecimalFormat("0.00").format(distance));
    }

}
