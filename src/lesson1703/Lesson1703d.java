package lesson1703;

//Задача на IF
//
//Дана целочисленная переменная count - количество верных ответов.
//В зависимости от значения этой переменной вывести в консоль оценку:
//100 - 90 правильных ответов - отлично
//89 - 60 правильных ответов - хорошо
//59 - 40 правильных ответов - удовлетворительно
//39 - 0 правильных ответов - попробуйте в следующий раз
public class Lesson1703d {
    public static void main(String[] args) {
        int count = 99;
        if (count >= 90 && count <= 100) {
            System.out.println("отлично");
        } else if (count >= 60 && count <= 89) {
            System.out.println("хорошо");
        } else if (count >= 40 && count <= 59) {
            System.out.println("удовлетворительно");
        } else if (count >= 0 && count <= 39) {
            System.out.println("попробуйте в следующий раз");
        } else {
            System.out.println("ошибка в подсчете баллов");
        }
    }
}
