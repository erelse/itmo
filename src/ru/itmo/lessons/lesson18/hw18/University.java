package ru.itmo.lessons.lesson18.hw18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class University {
    private List<Course> courses = new ArrayList<>();

    public boolean addCourse(Course course) {
        return courses.add(Objects.requireNonNull(course));
    }
    public boolean addCourses(List<Course> courses) {
        return this.courses.addAll(Objects.requireNonNull(courses));
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void upPrice(double newPrice, double currentPrice) {
        // метод увеличивает стоимость курсов (courses) на newPrice,
        // если текущая стоимость меньше currentPrice
        // использовать метод foreach коллекций
        courses.forEach(course -> {
            if (course.getPrice() < currentPrice)
                course.setPrice(course.getPrice() + newPrice);
        });

    }


    public void sortByDurationAndPrice(Comparator<Course> comparator) {
        // метод сортирует коллекцию courses по стоимости,
        // если курсы одинаковы по стоимости, сортирует по продолжительности

        // ???? запуталась


    }

    public void upDuration(double currentPrice) {
        // метод увеличивает продолжительность курсов (courses) на 1,
        // если их стоимость больше currentPrice
        // использовать метод foreach коллекций
        courses.forEach(course -> {
            if (course.getPrice() > currentPrice)
                course.setDuration(course.getDuration() + 1);
        });
    }
}