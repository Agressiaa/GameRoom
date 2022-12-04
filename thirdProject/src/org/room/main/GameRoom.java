package org.room.main;

import org.room.toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class GameRoom {
    private List<Toy> toys;
    private double available;


    public GameRoom(double available) {
        toys = new ArrayList<>();
        this.available = available;
    }

    public double getAvailable() {
        return available;
    }

    public void setAvailable(double available) {
        this.available = available;
    }

    public boolean addToy(Toy toy ) {
            if (available >= toy.getCost()) {
                toys.add(toy);
                available -= toy.getCost();
                return true;
            } else {
                System.out.println("not all toys were bought, you need " + Math.abs(toy.getCost() - available) + "$ to buy " + toy.getName());
                return false;
            }
    }

    public void deleteToy(Toy toy) {
        if (!toys.isEmpty()) {
            toys.remove(toy);
        }
    }

    public void sortByCost() {
        toys.sort(new ToyComparator());
    }

    public void show() {
        this.toys.forEach(toys -> System.out.println(toys.toString()));
    }

    public void findToyForKid() {
        System.out.println("Toys for kids < 6 years old:");
        for (Toy toy : toys) {
            if (toy.getAgeGroup() < 6) {
                System.out.println(toy.toString());
            }
        }
    }
}
