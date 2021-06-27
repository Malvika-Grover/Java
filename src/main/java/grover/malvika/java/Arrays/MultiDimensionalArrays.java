package grover.malvika.java.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

//---- 1-D Array using For-Each Loop

        //int []a = new int[3];
        int a[] = {1,2,3};
        for (int e: a){
            System.out.println(e);
        }

//---- 1-D Array using For Loop

        for (int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }

//---- 2-D Array using For-Each Loop

//        int[][] b = new int[2][3];
        int[][] b = {{9,8,7},{6,5}};
        for (int[] arr: b){
            for (int e : arr){
                System.out.println(e);
            }
        }

//---- 1-D Array using For Loop

        for (int i =0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.println(b[i][j]);
            }
        }

    }
}
