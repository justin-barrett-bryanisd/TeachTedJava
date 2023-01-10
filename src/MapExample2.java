/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class MapExample2 {
    public static void main(String[] args) throws Exception {
         new File("map.txt").createNewFile();
        Scanner scan=new Scanner(new File("map.txt"));
        int lines=0;
        while(scan.hasNext()){
            lines++;
            scan.nextLine();
        }
        System.out.println(lines);
        String[] map=new String[lines];
        scan.close();
        scan=new Scanner(new File("map.txt"));
        for (int i = 0; i < map.length; i++) {
            map[i]=scan.nextLine();
        }
        int aRow=-1, aCol=-1, bRow=-1, bCol=-1;
        for (int i = 0; i < map.length; i++) {
            if(map[i].contains("a")){
                aRow=i;
                aCol=map[i].indexOf("a");
            }
            if(map[i].contains("b")){
                bRow=i;
                bCol=map[i].indexOf("b");
            }
        }
        double distance=Math.hypot(aRow-bRow,aCol-bCol);
        System.out.println("Distance: "+(new DecimalFormat("0.00").format(distance)));
    }

}
