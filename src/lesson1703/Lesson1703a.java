package lesson1703;

//Задача на тернарный оператор
//Даны два целых числа. Выведите в консоль наибольшее из них. Если числа равны, выведите в консоль любое.
public class Lesson1703a {
    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 5;
        int res = number1 > number2 ? number1 : number2;
        System.out.println(res);
    }
}
