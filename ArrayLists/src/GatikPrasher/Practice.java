package GatikPrasher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Items(String name , String type){}

public class Practice {

    public static void main(String[] args) {
        Items items = new Items("Laptop", "Electronics");
        System.out.println(items);

        ArrayList<String> gadgets = new ArrayList<>();
        gadgets.add(0,"Laptop");
        gadgets.add(1,"Tablet");
        gadgets.add(2,"Mobile");
        gadgets.add(3,"Charger");
        gadgets.remove(3);
        gadgets.retainAll(gadgets);
        System.out.println(gadgets);

        gadgets.add("Headphones");

        Items Electronics = new Items("Stylus", "Gadget");
        System.out.println(Electronics);

       gadgets.sort(Comparator.naturalOrder());
        System.out.println(gadgets);

        gadgets.sort(Comparator.reverseOrder());
        System.out.println(gadgets);




    }


    
}


