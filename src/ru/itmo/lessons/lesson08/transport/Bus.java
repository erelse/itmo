package ru.itmo.lessons.lesson08.transport;

public final class Bus extends Transport implements IUse {
    private boolean wifi;
    private String color;


    public Bus(String color, String number, int level, boolean wifi) {
        super(number, level);
        setWifi(wifi);
        setColor(color);
    }

    public void setWifi(boolean wifi) {
        if (wifi != true || wifi != false) {
            throw new IllegalArgumentException("Exception: wifi должен быть true или false");
        }
        if (wifi == false) {
            wifi = true;
        }
        this.wifi = wifi;
    }

    public void setColor(String color) { // метод устан знач поля в вызывающем класс
        if (color == null) {
            throw new IllegalArgumentException("Exception: color = null");
        }
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean getWifi() {
        return wifi;
    }

    @Override
    public void use(int level) {
        System.out.println("транспортное средство в процессе эксплуатации");
        this.level = (int) (Math.random() * level);
    }

}
