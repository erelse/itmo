package lesson2003;
// Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд
public class Lesson2003a {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num = num + 2;
            System.out.println((i+1) + ".  " + num);
        }
    }
}
