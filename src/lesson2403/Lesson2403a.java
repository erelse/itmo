package lesson2403;


import java.util.Scanner;

/*Считывать с консоли строки до тех пор, пока пользователь не введёт "exit". Каждую полученную строку приводить к виду:
        первая заглавная, остальные маленькие и выводить в консоль. Пробелов в начале и
        конце строки быть не должно.*/

public class Lesson2403a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите текст");
            String word = sc.nextLine();
            if ("exit".equalsIgnoreCase(word)) break;
            else {
                word = word.strip();//убираем пустое пространство перед и после текста
                System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1, word.length()).toLowerCase());
                //переводит одну первую букву в верхний регистр(0,1)+остальные буквы в нижний
            }


        }
    }
}
