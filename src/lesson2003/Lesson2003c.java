package lesson2003;
//Задача на использование любого цикла (выберите сами)
//
//1. Программа загадывает число в диапазоне [1;9]
//2. Пользователь вводит число с клавиатуры
//3. Программа в зависимости от введенного числа выводит в консоль следующее:
//    1) "загаданное число больше"
//    2) "загаданное число меньше"
//    3) "Вы угадали" (программа завершает работу)
//4. Если введен 0, выввести "выход из программы" (программа завершает работу)


import java.util.Scanner;

public class Lesson2003c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNumber = 1 + (int) (Math.random() * (9 - 1 + 1)); //Программа загадывает число в диапазоне [1;9]
        //System.out.println(randomNumber);
        System.out.println("введите число от 1 до 9");
        int number = sc.nextInt();

        while (number != randomNumber && number != 0) {
            if (randomNumber > number) {
                System.out.println("загаданное число больше");
            } else {
                System.out.println("загаданное число меньше");
            }
            System.out.println("введите число от 1 до 9");
            number = sc.nextInt();

        }
        if (number == 0) {
            System.out.println("Введен 0, выход из программы");
        } else {
            System.out.println("Вы угадали. Число " + randomNumber);
        }
    }
}
