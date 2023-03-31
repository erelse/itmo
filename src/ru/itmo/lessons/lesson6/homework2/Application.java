package ru.itmo.lessons.lesson6.homework2;
import java.util.Arrays;
public class Application {
    public static void main(String[] args) {
        NutVal[] nutVal = {
                new NutVal ("carrots", 200, 200, 200, 200),
                new NutVal("apples", 150, 150, 150, 150),
                new NutVal("chicken", 300, 400, 500, 600),
                new NutVal("lamb", 700, 700, 700, 700),
        };

        MyBasket myBasket = new MyBasket(500, 500,
                500, 500, 2);
        for (NutVal i: nutVal) {
            myBasket.addProduct(i);
        }

        System.out.println(myBasket);
    }
}
