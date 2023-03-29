package ru.itmo.lessons.lesson6.homework1;

public class Group {
    private Mountain[] mountain;
    private Climber[] climbers;
    private int numberGr;
    private boolean enter;

    public Group(boolean b, Mountain mountain[], int i) {
    }




    public void setNumberGr(int numberGr) {
        if (numberGr < 1) {
            throw new IllegalArgumentException("В группе дрлжно быть более 0 человек");
        }
        this.numberGr = numberGr;
    }

    public void setEnter(boolean enter) {
        this.enter = enter;
    }

    public void setClimbers(int numberGr) {
        if (numberGr < 1) {
            throw new IllegalArgumentException("В группе дрлжно быть более 0 человек");
        }
        this.numberGr = numberGr;

    }

    public void setMountain(Mountain[] mountain) {
        if (mountain == null) {
            throw new IllegalArgumentException("дефолтное значение mountain: null");
        }
        this.mountain = mountain;


    }



    public int getNumberGr() {
        return numberGr;

    }
    public void addClimber (Climber climbers) {

        ?????

        if (enter == true) {

        }
    }
}
