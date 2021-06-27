package grover.malvika.java.Cursors;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsEnumeration {

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Enter the elements : ");

        for (int i=0; i<=8 ; i++){
            Scanner sc = new Scanner(System.in);
            Integer data = sc.nextInt();
            v.addElement(data);
        }
        System.out.println("Vector"+v);

        //Creating an enumeration object equivalent to vector and traverse the vector element one by one
        Enumeration e = v.elements();

        while (e.hasMoreElements()){
            //nextElement will fetch the element just next to where the cursor is pointing
            Integer element = (Integer) e.nextElement();

            if (element % 3 == 0){
                System.out.println(element);
            }
        }

    }
}
