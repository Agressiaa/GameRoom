package org.room.toys;

import org.room.enums.Size;

public class Plush extends Toy {

    private String filler;

    public Plush(String name, double cost, String colour, String form, Size size, int ageGroup, String filler) {
        super(name, cost, colour, form, size, ageGroup);
        this.filler = filler;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public String toString() {
        return "Toy{" +"name=" + getName() +
                ", cost=" + getCost() +
                "$, colour=" + getColour() +
                ", form=" + getForm() +
                ", size=" + getSize() + ", age group="+  getAgeGroup() + "+, filler=" + filler +
                '}';
    }
}
