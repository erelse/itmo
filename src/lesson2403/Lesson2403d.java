package lesson2403;
/*
Заполните массив на N элементов (размер массива вводит пользователь) случайным целыми числами и выведете максимальное,
минимальное и среднее арифметическое значение элементов массива
 */
import java.util.Scanner;
public class Lesson2403d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt(); // размерность массива
        int[] number = new int[n];
            for (int i = 0; i < n; i++) {
            number[i] = (int)(Math.random()*100);
            System.out.println(number[i]);
        }
            int min = number[0];
            int max = number[0];
            double sum = number[0];
            for (int i = 1; i < n; i++) {
                if (number[i] > max) max = number[i];
                if (number[i] < min) min = number[i];
                sum += number[i];
            }
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максимальное значение = " + max);
        System.out.println("Среднее арифметическое значение = " + (sum/n));






    }
}
