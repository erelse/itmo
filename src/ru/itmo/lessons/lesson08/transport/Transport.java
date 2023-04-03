package ru.itmo.lessons.lesson08.transport;

abstract public class Transport {
    protected String number;
    protected int level;

    public Transport(String number, int level) {

        if (number == null) {
            throw new IllegalArgumentException("Exception: number = null");
        }
        this.number = number;

        setLevel(level);
    }

    public void setLevel(int level) { // метод устан знач поля в вызывающем класс
        if (level < 0) {
            throw new IllegalArgumentException("Exception: level < 0");
        }
        this.level = level;
    }

    public String getNumber() {
        return number;
    }

    public int getLevel() {
        return level;
    }
}
