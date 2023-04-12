package ru.itmo.lessons.lesson08;

public class Transport {
    private int level;
    private String number;

    public Transport(String number, int level) {

        if (number == null) throw new IllegalArgumentException("number = null");
        if (level < 0) throw new IllegalArgumentException("level < 0");
        this.number = number;
        this.level = level;
    }

    public void upLevel() {
        level -= (int) (Math.random()*10);

    }

    public int getLevel() {
        return level;
    }

    public String getNumber() {
        return number;
    }

    public void repair() {
        level += (int) (Math.random() * 200+10); // увеличивается после ремонта
    }
}
