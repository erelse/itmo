package ru.itmo.lessons.lesson19.hw19.task01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.temporal.ChronoUnit;

public class Task01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // TODO: Используя методы Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        Map<Student.Gender, ArrayList<Student>> genderMap = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.toCollection(ArrayList::new)));
        System.out.println(genderMap);

        //  2. Найти средний возраст учеников
        double averageAge = students.stream().collect(Collectors.averagingInt(student -> (int) ChronoUnit.YEARS.between(student.getBirth(), LocalDate.now())));
        System.out.println("Средний возраст: " + averageAge);


        //  3. Найти самого младшего ученика
        Student youngStudent = students.stream().min((student1, student2) -> (int) ChronoUnit.DAYS.between(student1.getBirth(), student2.getBirth())).orElse(null);
        System.out.println(youngStudent);


        //  4. Найти самого старшего ученика
        System.out.println(students.stream().max((student1, student2) -> (int) ChronoUnit.DAYS.between(student1.getBirth(), student2.getBirth())).orElse(null));

        //  5. Собрать учеников в группы по году рождения
        Map<Integer, List<Student>> yearMap = students.stream()
                .collect(Collectors.groupingBy(student -> student.getBirth().getYear()));
        System.out.println(yearMap);

        //  6. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (ArrayList)
        List<Student> studentList = students.stream()
                .sorted((student1, student2) -> student1.getGender().compareTo(student2.getGender()))
                .sorted((student1, student2) -> (int) ChronoUnit.DAYS.between(student2.getBirth(), student1.getBirth()))
                .sorted((student1, student2) -> student2.getName().compareTo(student1.getName()))
                .toList();
        //  7. Вывести в консоль всех учеников в возрасте от N до M лет
        int n = 10;
        int m = 15;
        students.forEach(student -> {
                    if (student.getBirth().getYear() <= m && student.getBirth().getYear() >= n)
                        System.out.println(student);
                }
        );

        //  8. Собрать в список всех учеников с именем=someName
        String someName = "Руслан";
        List<Student> someStudent = students.stream().filter(student -> someName.equalsIgnoreCase(student.getName())).toList();
        System.out.println(someStudent);

        //  9. Собрать Map<Student.Gender, Integer>, где Student.Gender - пол, Integer - суммарный возраст учеников данного пола
        //     см. метод Collectors.summingInt
        Map<Student.Gender, Integer> genderAge = students.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.summingInt(student -> LocalDate.now().getYear() - student.getBirth().getYear())
                ));
        System.out.println(genderAge);
    }
}

