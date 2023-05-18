package ru.itmo.lessons.kurs02;

/*
import java.io.Serializable;
*/

public class Game /*implements Serializable*/{
    private int first;
    private int second;
    private String text;


    public Game(int first, int second, String text) {
        this.first = first;
        this.second = second;
        this.text = text;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public String getText() {
        return text;
    }
}