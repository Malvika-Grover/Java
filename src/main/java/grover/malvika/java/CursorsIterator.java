package grover.malvika.java;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorsIterator {

    public static void main(String[] args) {

        //Initializing Array list(generic syntax)
        ArrayList<Integer> data = new ArrayList<>();

        //Adding elements in ArrayList
        data.add(10);
        data.add(33);
        data.add(30);

        //Iterator Object
        Iterator itr = data.iterator();

        //Loop until there is element next to the pointer element
        while (itr.hasNext()){
            Integer i = (Integer) itr.next();

            //Condition to check
            if (i%3 == 0){
                System.out.println(i);
            }
            else {
                itr.remove();
            }
        }
    }
}
