package ru.itmo.lessons.lesson08.transport;

public final class Car extends Transport implements IUse {
    public String color;

    public Car(String color, String number, int level) {
        super(number, level);
        setColor(color);
    }

    public void setColor(String color) { // метод устан знач поля в вызывающем класс
        if (color == null) {
            throw new IllegalArgumentException("Exception: color = null");
        }
        this.color = color;
    }


    @Override
    public void use(int level) {
        System.out.println("транспортное средство в процессе эксплуатации");
        this.level = (int) (Math.random() * level);
    }
}