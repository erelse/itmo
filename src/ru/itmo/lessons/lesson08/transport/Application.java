package ru.itmo.lessons.lesson08.transport;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Car car01 = new Car("blue", "C1", 100);
        Car car02 = new Car("red", "C2", 50);
        Car car03 = new Car("green", "C3", 20);
        Car car04 = new Car("yellow", "C4", 0);

        Bus bus01 = new Bus("blue", "B1", 0, true);
        Bus bus02 = new Bus("blue", "B2", 0, true);
        Bus bus03 = new Bus("yellow", "B3", 0, false);


        Train train01 = new Train("T1", 0, 1);
        Train train02 = new Train("T2", 0, 2);
        Train train03 = new Train("T3", 0, 3);

    }
}
