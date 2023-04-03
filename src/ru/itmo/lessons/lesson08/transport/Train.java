package ru.itmo.lessons.lesson08.transport;

public final class Train extends Transport implements IUse {
    private int countWagon;
    private final String color = "red";

    public Train(String number, int level, int countWagon) {
        super(number, level);
        setCountWagon(countWagon);
    }


    public void setCountWagon(int countWagon) {
        if (countWagon < 1) {
            throw new IllegalArgumentException("Exception: countWagon < 1");
        }
        this.countWagon = countWagon;
    }

    public String getColor() {
        return color;
    }

    public int getCountWagon() {
        return countWagon;
    }

    @Override
    public void use(int level) {
        System.out.println("транспортное средство в процессе эксплуатации");
        this.level = (int) (Math.random() * level);
    }
}
