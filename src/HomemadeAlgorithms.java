
/**
 *
 * @author NAME
 */
import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class HomemadeAlgorithms {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        for (int i = 3; i < 20; i++) {
            list.add("" + i);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        //put it back without Collections
        for (int i = 0; i < list.size() - 1; i++) {
            list.add(0, list.remove(i + 1));
            //System.out.println("+"+list);
        }

        System.out.println(list);
        for (int j = 0; j < 100; j++) {
            Collections.sort(list);
            for (int i = 0; i < list.size() * 2; i++) {
                int num = (int) (Math.random() * list.size());
                int num2 = (int) (Math.random() * list.size());
                list.add(num, list.remove(num2));
            }
            System.out.println(list);
        }
        //How can I shuffle? Use Math.random()

    }
}
