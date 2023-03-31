package ru.itmo.lessons.lesson6.cat_mouse;

public class Cat {
    private String name;
    private final int speed;
    private final int weight;
    public int height;
    public Cat (int speed, int weight) {
        if (speed > 10) {
            throw new IllegalArgumentException("");
        }
    }
    public void setName(String name) {
        if (name == null){
            throw new IllegalArgumentException("invalid");
        }
        this.name = name;



    }
}
