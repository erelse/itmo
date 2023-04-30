package ru.itmo.lessons.kursFitness;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HolderOfSubscription {

    //задаем приватные переменные свойств держателя абонемента:
    private String name;
    private String surname;
    private int yearOfBirth;

    public HolderOfSubscription(String name, String surname, int yearOfBirth) {
        if (name.length() < 1) throw new IllegalArgumentException("Имя владельца должно быть более 1 символа");
        if (surname.length() < 1) throw new IllegalArgumentException("Фамилия владельца должно быть более 1 символа");
        if (yearOfBirth < 1923)
            throw new IllegalArgumentException("Обратитесь к администратору для уточнения данных");
        if (yearOfBirth > 2010)
            throw new IllegalArgumentException("Фитнес клуб доступен для лиц старше 14 лет");


        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNameAndSurname() {
        String nameAndSurname = (name + " " + surname);
        return nameAndSurname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year_of_birth=" + yearOfBirth +
                '}';
    }
}
