package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        Double difference = o1.getCost() - o2.getCost();
        int intReturned = 0;
        if(difference>0){
            intReturned = 1;
        } else if (difference < 0){
            intReturned = -1;
        }
        return intReturned;
    }
}
