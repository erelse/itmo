package ru.itmo.lessons.lesson08;

public class Bus extends Transport{
    private final String color;
    private boolean wifi;

    public Bus(String number, int level, String color, boolean wifi) {
        super(number, level);
        if (color==null) throw new IllegalArgumentException("color==null");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isWifi() {
        return wifi;
    }

    @Override
    public void repair() {
        super.repair();
        if (!wifi) wifi = true;
        System.out.println("Установлен wifi");
    }
}