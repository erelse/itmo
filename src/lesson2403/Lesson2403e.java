package lesson2403;

import java.util.Scanner;

/*Создайте массив из чётных чисел [2;20] (использовать Math.random()) и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
 */
public class Lesson2403e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt(); // размерность массива
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = 2 * ((int) (Math.random() * 10) + 1);
            System.out.println("number[" + i + "] = " + number[i]);
        }
        System.out.println();
       for (int i = (n-1); i >= 0; i--) {
                    System.out.println("number[" + i + "] = " + number[i]);
        }


    }
}
