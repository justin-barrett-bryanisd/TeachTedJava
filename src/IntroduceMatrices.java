/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class IntroduceMatrices {
    public static void main(String[] args) throws Exception {
        char[][] board=new char[10][10];
        board[3][6]='a';
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]+" ");
            }
            System.out.println("");
        }
        board[0]="A grand catastrophy".toCharArray();
        board[1]="Among us".toCharArray();
        board[2]="Brayden go".toCharArray();
        board[3]="Ethan Go".toCharArray();
        board[4]="Bri, give me one".toCharArray();
        board[5]="Donoven Go".toCharArray();
        board[0]="Uh, there was a mistake".toCharArray();
        board[6]="Heaven".toCharArray();
        board[7]="Kevin, my dog's name is kevin".toCharArray();
        board[8]="Country Roads".toCharArray();
        board[9]="East Virginia is better".toCharArray();
        System.out.println("--------------------------------------------");
        
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]+" ");
            }
            System.out.println("");
        }
    }

}
