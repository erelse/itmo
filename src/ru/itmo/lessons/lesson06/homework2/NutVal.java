package ru.itmo.lessons.lesson06.homework2;

public class NutVal {
    private String name;
    private int pr;
    private  int fats;
    private  int carbs;
    private int cal;

    public  NutVal(String name){
        setName(name);
    }

    public  NutVal(String name, int pr){
        this(name);
        setPr(pr);
    }

    public  NutVal(String name, int pr, int fats){
        this(name, pr);
        setFats(fats);
    }

    public  NutVal(String name, int pr, int fats, int carbs){
        this(name, pr, fats);
        setCarbs(carbs);
    }

    public  NutVal(String name, int pr, int fats, int carbs, int cal){
        this(name, pr, fats, carbs);
        setCal(cal);

    }
    public void setName(String name) {
        if(name == null) {
            throw new IllegalArgumentException("неопознанный продукт");
        }
        this.name = name;
    }

    public void setPr(int pr) {
        if(pr < 0) {
            throw new IllegalArgumentException("белков меньше 0");
        }
        this.pr = pr;
    }

    public void setFats(int fats) {
        if(fats < 0) {
            throw new IllegalArgumentException("жиров меньше 0");
        }
        this.fats = fats;
    }

    public void setCarbs(int carbs) {
        if(carbs < 0) {
            throw new IllegalArgumentException("углеводов меньше 0");
        }
        this.carbs = carbs;
    }

    public void setCal(int cal) {
        if(cal < 0) {
            throw new IllegalArgumentException("калорий меньше 0");
        }
        this.cal = cal;
    }

    public String getName() {
        return name;
    }

    public int getPr() {
        return pr;
    }

    public int getFats() {
        return fats;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getCal() {
        return cal;
    }

    public String toString() {
        return  name + " "+pr + " / " + fats + " / "+ carbs + " / "+ cal;
    }
}
