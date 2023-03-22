package lesson2003;

//Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр

import java.util.Scanner;
public class Lesson2003b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите целое положительное число");
        int number = sc.nextInt();
        int sum = 0; // нач знач суммы
        while (number > 0) {
           sum = sum + (number % 10); //доб к сумме посл цифру числа
           number = number / 10; // отсекаем посл цифру
        }
        System.out.println("сумма цифр числа равна " + sum);


    }
}
