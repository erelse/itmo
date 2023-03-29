package lesson2403;
/*Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять
новое слово в массив можно только, если в нем его еще нет). В итоге в массиве будут только уникальные слова.
Выход из программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен. Перед завершением
программы, вывести получившийся массив в консоль
 */

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2403f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = sc.nextInt(); // размерность массива
        String[] words = new String[n];
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово, выход из программы по слову exit");
            String temp = sc1.nextLine(); // ввод слов в переменную temp

            if ("exit".equals(temp)) break; // выход из for и сотв из программы

            int flag = 0;
            for (int j = 0; j <= i; j++) { // проверка на совпадение слов
                if (temp.equals(words[j])) {
                    flag = 1; // меняем значение флага при выходе по break
                    i--;
                    break; // выход из вложенного цикла for
                }
            }// конец внутреннего цикла
            if (flag == 0) {
                words[i] = temp; // если не найдено одинаковых слов, то записываем его
            }
        }//конц внешнего цикла
        for (int i = 0; i < n; i++) System.out.println("words [" + i + "] = " + words[i]);
    }
}
