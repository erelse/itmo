package lesson1503;
/*
Найти сумму цифр 2х значного числа

        Например,
        1. для числа 45 сумма цифр равна 9
        2. для числа 11 сумма цифр равна 2
*/
public class Lesson1503c {
    public static void main(String[] args) {
        int number = 75; //исходное двузначное число
        int sum = number%10 + number/10; //сумма цифр двузначного числа
        System.out.println("сумма цифр двузначного числа "+number+ " равна "+sum);

    }
}
