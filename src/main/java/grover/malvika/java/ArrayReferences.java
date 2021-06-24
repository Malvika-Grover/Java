package grover.malvika.java;

public class ArrayReferences {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {11,22};
        a = b;
        b = a;

        for (int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for (int i =0; i<b.length; i++){
            System.out.println(b[i]);
        }

    }


}
