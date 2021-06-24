package grover.malvika.java;

public class AnonymousArrays {

    public static void main(String[] args) {
        Sum(new int[] {1,9,8});

    }
    private static void Sum(int[] x){
        int total = 0;
            for (int e: x){
            total = total+e;
        }
    /*
        for (int i =0; i<x.length; i++){
            total = total+x[i];
        }

    */

        System.out.println(total);
    }
}
