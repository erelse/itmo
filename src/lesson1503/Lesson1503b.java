package lesson1503;
/*
 Даны две переменные типа double:
 время (в часах) и расстояние (в километрах).
 Найти и вывести в консоль скорость, выраженную в метрах в секунду.
  */
public class Lesson1503b {
    public static void main(String[] args) {
        double time = 7; //время в часах
        double distance = 36; //расстояние в км
        double timesec =  time*3600; //время в секундах
        double distancemet = distance*1000; //расстояние в метрах
        double speed = distancemet/timesec; //скорость в м/с
        System.out.println("Скорость = "+speed+" м/с");
    }
}
