package org.room.main;

import org.room.toys.*;

import static org.room.enums.Size.*;
import static org.room.enums.TypeOfSupply.*;

public class Runner {
    public static void main(String[] args) {

        GameRoom gameRoom = new GameRoom(800);
        System.out.println("Budget: " + gameRoom.getAvailable() + "$");
        Toy ball = new Toy("ball", 55, "black and white", "round", MEDIUM, 2);
        Toy bear = new Plush("bear Teddy", 45, "red", "round", MEDIUM, 5, "cotton" );
        Toy toy2 = new Developing("anti-stress", 80, "blue", "round", SMALL, 12, 7);
        Toy toy3 = new Developing("yo-yo",80, "blue", "round", SMALL, 12, 7);
        Developing constructorLego = new Constructor("constructor Lego",400, "yellow and blue", "shapeless", MEDIUM, 6, 8, 1000);
        Toy car = new RadioControlledModels("car", 200, "black", "like hot-dog", MEDIUM, 9, 25, BATTERIES);
        Toy train = new RadioControlledModels("train", 300, "black and grey", "the same as worm", BIG, 8, 50, ACCUMULATOR);
        Toy cube = new Developing("rubik's cube", 20, "rainbow", "cube", SMALL, 7, 8);
        Toy doll = new Toy("princess Barbie", 10, "yellow", "woman's", MEDIUM, 2);
        gameRoom.addToy(ball);
        gameRoom.addToy(bear);
        gameRoom.addToy(toy2);
        gameRoom.addToy(toy3);
        gameRoom.addToy(constructorLego);
        gameRoom.addToy(car);
        gameRoom.addToy(train);
        gameRoom.addToy(cube);
        gameRoom.addToy(doll);
        gameRoom.sortByCost();
        gameRoom.show();

        gameRoom.findToyForKid();

    }
}
