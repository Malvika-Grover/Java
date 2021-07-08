package grover.malvika.java.HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();                     // aba
        long num = in.nextLong();                   // 10
        long numberOfReps = num/str.length();       // 10/3 = 3
        long remainder = num%str.length();          // 10%3 = 1
        long total = 0;
        for(int a = 0; a < str.length(); a++){
            if(str.charAt(a) == 'a'){
                total++;
            }
        }
        total = total * numberOfReps;
        for(int a = 0; a < remainder; a++){
            if(str.charAt(a) == 'a'){
                total++;
            }
        }
        System.out.println(total);
    }
}