package org.room.toys;

import org.room.enums.Size;
import org.room.enums.TypeOfSupply;

public class RadioControlledModels extends Toy {

    private int distanceOfControl;
    private TypeOfSupply typeOfSupply;

    public RadioControlledModels(String name, double cost, String colour, String form, Size size, int ageGroup, int distanceOfControl, TypeOfSupply typeOfSupply) {
        super(name, cost, colour, form, size, ageGroup);
        this.distanceOfControl = distanceOfControl;
        this.typeOfSupply = typeOfSupply;
    }

    public int getDistanceOfControl() {
        return distanceOfControl;
    }

    public void setDistanceOfControl(int distanceOfControl) {
        this.distanceOfControl = distanceOfControl;
    }

    public TypeOfSupply getTypeOfSupply() {
        return typeOfSupply;
    }

    public void setTypeOfSupply(TypeOfSupply typeOfSupply) {
        this.typeOfSupply = typeOfSupply;
    }

    @Override
    public String toString() {
        return "Toy{" + "name=" + getName() +
                ", cost=" + getCost() +
                ", colour=" + getColour() +
                ", form=" + getForm() +
                ", size=" + getSize() +
                ", ageGroup=" + getAgeGroup() + "+, distance of control=" + getDistanceOfControl() + " metres, type of supply=" + getTypeOfSupply() +
                '}';
    }
}
