package grover.malvika.java;

import java.io.*;
import java.util.*;

public class Result {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[sc.nextInt()]++;
        }
        long ans=0;

        for(int p: arr){
            ans = ans + p/2;
        }

//        for (int i =0; i<=arr.length;i++){
//            ans = ans + i/2;
//        }


        System.out.println(ans);
    }
}