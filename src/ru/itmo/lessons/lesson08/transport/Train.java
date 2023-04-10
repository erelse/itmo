package ru.itmo.lessons.lesson08.transport;

public class Train extends Transport{

    private final String color = "red"; // все поезда одинакового цвета,

    private int countWagon;


    public Train( String number, int level, int countWagon, String color) {
        super(number, level);
        if (countWagon < 2) throw new IllegalArgumentException("вагонов < 2");
        this.countWagon = countWagon;
    }

    public String getColor() {
        return color;
    }

    public int getCarCount() {
        return countWagon;
    }
    public String setCountWagon () {
        this.countWagon=countWagon;
        return null;
    }



}
