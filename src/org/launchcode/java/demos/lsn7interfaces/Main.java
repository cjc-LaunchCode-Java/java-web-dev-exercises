package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        System.out.println(flavors);
        System.out.println(cones);

        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());
        System.out.println(cones);
        System.out.println(flavors);
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


        System.out.println(menu.toStringCones());
        toppings.sort(new ToppingComparator());

        System.out.println(menu.toStringCones());




    }
}
