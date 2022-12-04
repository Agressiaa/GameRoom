package org.room.main;

import org.room.toys.Toy;

import java.util.Comparator;

public class ToyComparator implements Comparator<Toy> {

    public int compare(Toy arg0, Toy arg1) {
        return (int) (100 * (arg0.getCost() - arg1.getCost()));
    }
}
