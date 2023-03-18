package lesson1703;

//Задача на IF
//Дан номер месяца, например int month = 5. В зависимости от данного значения вывести в консоль время года.
public class Lesson1703c {
    public static void main(String[] args) {
        int month = 8;
        if (month >= 3 && month <= 5) {
            System.out.println("spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("autumn");
        } else {
            System.out.println("winter");
        }
    }
}
