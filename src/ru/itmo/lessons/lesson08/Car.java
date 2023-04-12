package ru.itmo.lessons.lesson08;

public class Car extends Transport implements PaintCar {
    private String color;
    private int level;

    public Car(String number, int level, String color) {
        super(number, level);
        if (color == null) throw new IllegalArgumentException("цвет = null");

        this.color = color;
    }

    @Override
    public void paintCar(String newColor) {
        if (newColor == null) throw new IllegalArgumentException("цвет = null");
        this.color = newColor;
    }
}
