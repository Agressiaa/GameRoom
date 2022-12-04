package org.room.toys;

import org.room.enums.Size;

public class Developing extends Toy {
    private int hardness;

    public Developing(String name, double cost, String colour, String form, Size size, int ageGroup, int hardness) {
        super(name, cost, colour, form, size, ageGroup);
        this.hardness = hardness;
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Toy{" + "name=" + getName() +
                ", cost=" + getCost() +
                "$, colour=" + getColour()  +
                ", form=" + getForm()  +
                ", size=" + getSize() + ", age group=" + getAgeGroup() + "+, hardness=" + hardness + "/10" +
                '}';
    }

}
