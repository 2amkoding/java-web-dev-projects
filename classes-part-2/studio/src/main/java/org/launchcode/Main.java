package org.launchcode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MenuItem item1 = new MenuItem("samosa", 2.98, "spicy and tasty", "Breakfast");
        MenuItem item2 = new MenuItem("butter panner", 12.99, "ceese gravy", "Main");
        MenuItem item3 = new MenuItem("biriyani", 14.99, "souct ruce w veggie", "Main");
        MenuItem item4 = new MenuItem("GulabJamun", 7.99, "sweet", "Dessert");
        MenuItem item5 = new MenuItem("Rasmalai", 5.98, "sweet", "Dessert");
        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> item = new ArrayList<>();
        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.add(item4);
        item.add(item5);

        Menu menu = new Menu(today, item);
        System.out.println(item);

        for(MenuItem i :item ) {
            System.out.println(i);
            System.out.println();
        }
    }
}

