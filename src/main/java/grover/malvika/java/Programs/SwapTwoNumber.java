package grover.malvika.java.Programs;

public class SwapTwoNumber {

    public static void swap(int a, int b){
        System.out.println("Numbers before swap "+a+" "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swap "+a+" "+b);
    }


    public static void main(String[] args) {

        swap(2,3);

    }


}
