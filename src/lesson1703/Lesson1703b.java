package lesson1703;

import org.w3c.dom.ls.LSOutput;

//Задача на тернарный оператор
//Дано целое число. Если оно чётное, выведите в консоль 0, если нет, то выведите в консоль -1.
public class Lesson1703b {
    public static void main(String[] args) {
        int number = 16;
        int result = number % 2 == 0 ? 0 : -1;
        System.out.println(result);


    }

}
