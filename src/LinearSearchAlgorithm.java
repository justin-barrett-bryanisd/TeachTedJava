
/**
 *
 * @author NAME
 */

import java.util.*;
import java.lang.*;

public class LinearSearchAlgorithm {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Among Us");
        list.add("That's one word");
        list.add("Uhhh cars");
        list.add("SkillsUSA: Champions at Work");
        list.add("SkillsUSA: Our Time is Now");
        System.out.println(findWordCount(list, 2));  //3
        System.out.println(findWordCountLater(1, list, 2));  //1
    }

    //returns the index of the String in lines that has wordCount words
    //if that wordCount is not available, return -1
    public static int findWordCount(ArrayList<String> lines, int wordCount){
        for (int i = 0; i < lines.size(); i++) {
            String temp=lines.get(i).replace(" ", "");
            int words=lines.get(i).length()-temp.length()+1;
            if(words == wordCount)
                return i;
        }
        return -1;
    }public static int findWordCountLater(int j,ArrayList<String> lines, int wordCount){
        for (int i = j; i < lines.size(); i++) {
            String temp=lines.get(i).replace(" ", "");
            int words=lines.get(i).length()-temp.length()+1;
            if(words == wordCount)
                return i;
        }
        return -1;
    }
    
    
    
    
    
    
    
    public static int findWordCountA(ArrayList<String> lines, int wordCount) {
        for (int i = 0; i < lines.size(); i++) {
//            String temp=lines.get(i).replace(" ","");
//            int words=lines.get(i).length()-temp.length()+1;
            Scanner scan = new Scanner(lines.get(i));
            int words = 0;
            while (scan.hasNext()) {
                scan.next();
                words++;
            }
            if (words == wordCount) {
                return i;
            }
        }

        return -1;
    }

    public static int findWordCountLaterA(int j, ArrayList<String> lines, int wordCount) {
        for (int i = j; i < lines.size(); i++) {
//            String temp=lines.get(i).replace(" ","");
//            int words=lines.get(i).length()-temp.length()+1;
            Scanner scan = new Scanner(lines.get(i));
            int words = 0;
            while (scan.hasNext()) {
                scan.next();
                words++;
            }
            if (words == wordCount) {
                return i;
            }
        }

        return -1;
    }

}
