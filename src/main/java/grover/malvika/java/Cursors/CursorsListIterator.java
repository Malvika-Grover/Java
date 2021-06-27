package grover.malvika.java.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorsListIterator {
    public static void main(String[] args) {
        //Generic syntax
        ArrayList<String> data = new ArrayList<>();

        //Adding data to ArrayList
        data.add("Malvika");
        data.add("Grover");
        data.add("Shubham");
        data.add("Narendra");
        data.add("Sunita");

        System.out.println(data);

        //Created a new object of listeIterator using method "listIterator()"
        ListIterator li = data.listIterator();
        while (li.hasNext()){

            //To iterate over List
            String item = (String) li.next();

            //add() method
            if (item.equalsIgnoreCase("Shubham")){
                li.add("Grover");
            }

            //set() method
            if (item.equalsIgnoreCase("Narendra")){
                li.set("Narendra Kumar");
            }

            //remove() method
            if (item.equalsIgnoreCase("Grover")){
                li.remove();
            }

        }
        System.out.println(data);

    }
}
