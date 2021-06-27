package grover.malvika.java.Programs;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 1112;
        int reversed = 0;

        while (number!=0) {
            int digit = number % 10;                    //2     -> 1    -> 1     -> 1
            reversed = reversed * 10 + digit;           //2     -> 21   -> 211   -> 2111
            number = number/10;                         //111   -> 11   -> 1     -> 0
        }
        System.out.println(reversed);
    }
}













