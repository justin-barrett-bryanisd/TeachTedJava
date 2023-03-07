/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class ShowAsael {
    public static void main(String[] args) throws Exception {
        String input="abcdefghijklmonpuvwxyzqrstiouooaaaa".toLowerCase();
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        
        for (char i = 'a'; i <='z'; i++) {
            map.put(i, 0);
        }
        
        for (int i = 0; i < input.length(); i++) {
            if(map.containsKey(input.charAt(i))){
                int num=map.get(input.charAt(i))+1;
                map.put(input.charAt(i), num);
            }
        }
        if(map.values().contains(0)){
            System.out.println("Not a panagram");
            for (Character character : map.keySet()) {
                if(map.get(character)==0)
                    System.out.println(character+" ");
            }
        }
        
            for (Character character : map.keySet()) {
                if(map.get(character)>1)
                    System.out.println(character+" ");
            }
        int num=144;
        boolean[] arr=new boolean[num+5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=true;
        }
        arr[0]=false;
        arr[1]=false;
        for (int i = 2; i < (num+5)/2; i++) {
            for (int j = 0; j < num+5; j+=i) {
                arr[j]=false;
            }
        }
        System.out.println(arr[num]);
        
        GregorianCalendar gc=new GregorianCalendar();
        gc.set(GregorianCalendar.HOUR, 2);
        gc.set(GregorianCalendar.MINUTE, 30);
        gc.add(GregorianCalendar.HOUR, 13);
        gc.add(GregorianCalendar.MINUTE, 15);
        
         
        
        System.out.println(gc.get(GregorianCalendar.HOUR)+":"+gc.get(GregorianCalendar.MINUTE)+(gc.get(GregorianCalendar.AM_PM)==0?"AM":"PM"));
    }

}
