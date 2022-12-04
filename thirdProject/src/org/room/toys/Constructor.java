package org.room.toys;

import org.room.enums.Size;

public class Constructor extends Developing {
    private int amountOfDetails;

    public Constructor(String name, double cost, String colour, String form, Size size, int ageGroup, int hardness, int amountOfDetails) {
        super(name, cost, colour, form, size, ageGroup, hardness);
        this.amountOfDetails = amountOfDetails;
    }

    public int getAmountOfDetails() {
        return amountOfDetails;
    }

    public void setAmountOfDetails(int amountOfDetails) {
        this.amountOfDetails = amountOfDetails;
    }

    @Override
    public String toString() {
        return "Toy{" +"name=" + getName() +
                ", cost=" + getCost() +
                "$, colour=" + getColour() +
                ", form=" + getForm() +
                ", size=" + getSize() + ", age group=" + getAgeGroup() + "+, hardness=" + getHardness() + "/10" + ", amount of details=" + getAmountOfDetails() +
                '}';
    }
}
