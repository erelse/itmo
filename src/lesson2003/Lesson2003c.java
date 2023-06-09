package lesson2003;
/*Задача на использование любого цикла (выберите сами)

1. Программа загадывает число в диапазоне [1;9]
2. Пользователь вводит число с клавиатуры
3. Программа в зависимости от введенного числа выводит в консоль следующее:
   1) "загаданное число больше"
    2) "загаданное число меньше"
    3) "Вы угадали" (программа завершает работу)
4. Если введен 0, выввести "выход из программы" (программа завершает работу)*/


import java.util.Scanner;

public class Lesson2003c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = 1 + (int) (Math.random() * (9 - 1 + 1)); // число, загад. машиной от 0 до 9

        while (true) {
            System.out.println("введите число от 1 до 9");
            int number = sc.nextInt(); // число пользователя
            if (number == 0) {
                break;
            }
            if (randomNumber > number) {
                System.out.println("загаданное число больше");
            } else if (randomNumber < number) {
                System.out.println("загаданное число меньше");
            } else {
                System.out.println("Вы угадали. Число " + randomNumber);
            }
            System.out.println("введите число от 1 до 9");
            number = sc.nextInt();
        }
         System.out.println("Программа завершает работу"); // при вводе нуля


    }

}
