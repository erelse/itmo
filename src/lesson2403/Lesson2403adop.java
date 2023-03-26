package lesson2403;

/*Считывать с консоли строки до тех пор, пока пользователь не введёт "exit". Каждую полученную строку приводить к виду:
        первая заглавная, остальные маленькие и выводить в консоль. Пробелов в начале и
        конце строки быть не должно.*/

import java.util.Scanner;
public class Lesson2403adop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        while (word != null && (word.equalsIgnoreCase("exit") )) {
            word = word.strip();
            System.out.println(word.substring(0,1).toUpperCase() + word.substring(1,word.length()).toLowerCase());
            System.out.println("Введите текст");
            word = sc.nextLine();
        }
    }
}
