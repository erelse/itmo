package ru.itmo.lessons.lesson18.hw18;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {

        University university = new University();
        university.addCourses(Course.getInstances(15));

        // Выводим все элементы коллекции целиком
        Consumer<Course> soutCourse = course -> System.out.println(course);
        university.getCourses().forEach(soutCourse);
        //university.getCourses().forEach(course -> System.out.println(course.getName()) );
        System.out.println("___________________________________________________________");


        // Predicate для удаления курсов (тип Course) с названием Python
        // Predicate<Course> deletePython = course -> "Python".equals(course.getName());
        university.getCourses().removeIf(course -> "Python".equals(course.getName()));
        university.getCourses().forEach(course -> System.out.println(course.getName())); //проверка удаления
        System.out.println("___________________________________________________________");

        // Predicate для удаления курсов (тип Course) с прод.< 3х мес.и стоим.< 20000.
        university.getCourses().removeIf(course -> course.getDuration() < 3 && course.getPrice() < 20000);
        university.getCourses().forEach(course -> System.out.println(course.getName()));
        System.out.println("__________________________________________________________");


        // добавляем к положительному числу строки "p."
        Function<Integer, String> numberP = number -> {
            if (number > 0) return number + " p.";
            throw new IllegalArgumentException();
        };
    }
}

