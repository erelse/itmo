package lesson2403;
/*Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять
новое слово в массив можно только, если в нем его еще нет). В итоге в массиве будут только уникальные слова.
Выход из программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен. Перед завершением
программы, вывести получившийся массив в консоль
 */

import java.util.Scanner;

public class Lesson2403fdop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = sc.nextInt(); // размерность массива

        String[] words = new String[n];
        Scanner sc1 = new Scanner(System.in);

        int i = 0;
        while (i < n) {

            System.out.println("Введите слово, выход по слову exit");
            String temp = sc1.nextLine(); // ввод  слов в переменную temp
            if ("exit".equals(temp)) break; // выход из while

            int flag = 0; // флаг не должен изменить значение, если слова не совпали и выход из цикла будет по j <= i
            for (int j = 0; j <= i; j++) { // проверка на совпадение слов
                if (temp.equals(words[j])) {
                    flag = 1; // меняем значение флага. перед выходом по break, если найдено в запрлняемом массиве вводимое слово
                    break; // выход из вложенного цикла for
                }
            }//конец for
            if (flag == 0) { // если не найдено одинаковых слов, то записываем его
                words[i] = temp;
                i++;
            }//конец if
        }// конец while
        for (i = 0; i < n; i++)  System.out.println("words [" + i + "] = " + words[i]);
    }
}
