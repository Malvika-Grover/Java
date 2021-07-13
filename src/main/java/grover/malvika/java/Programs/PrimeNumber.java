package grover.malvika.java.Programs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        int m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("Not a Prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % 1 == 0) {
                    System.out.println("Not a Prime number");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("Prime number");
            }
        }
    }
}
