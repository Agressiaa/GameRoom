package org.room.toys;

import org.room.enums.Size;

public class Toy {
    private String name;
    private double cost;
    private String colour;
    private String form;
    private Size size;
    private int ageGroup;

    public Toy(String name, double cost, String colour, String form, Size size, int ageGroup) {
        this.name = name;
        this.cost = cost;
        this.colour = colour;
        this.form = form;
        this.size = size;
        this.ageGroup = ageGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    @Override
    public String toString() {
        return "Toy{" + "name=" + getName() +
                ", cost=" + cost +
                "$, colour=" + colour +
                ", form=" + form +
                ", size=" + size +
                ", ageGroup=" + ageGroup + "+" +
                '}';
    }
}
