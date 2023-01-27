/**
 *
 * @author NAME
 */

import java.awt.Color;
import java.awt.Rectangle;
import java.util.*;
import java.lang.*;

public class IntroduceArrayLists {
    public static void main(String[] args) throws Exception {
        ArrayList<String> wordList=new ArrayList<String>();
        wordList.add("Carl");
        wordList.clear();
        wordList.add("Dawn");
        wordList.add("Itan");
        wordList.add("Mum's Homemade Cooking");
        System.out.println(wordList);
        System.out.println(wordList.contains("Dawn"));
        ArrayList<Rectangle> boxes=new ArrayList<Rectangle>();
        boxes.add(new Rectangle(0,0,25,25));
        Rectangle other = new Rectangle(125, 0, 125,25);
        boxes.add(other);
//        
        System.out.println(boxes);
        boxes.add(new Rectangle(0,0,25,25));
        other.setLocation(1000,1000);
        System.out.println(boxes);
        //other=new Rectangle(23,23);
        //System.out.println(boxes);
        boxes.get(1).setLocation(-4, -5);
        System.out.println(other);
//        other=new Rectangle(23,23);
                
    }
    
    

}
