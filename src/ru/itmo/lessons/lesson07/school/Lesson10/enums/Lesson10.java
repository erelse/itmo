/*
package ru.itmo.lessons.lesson07.school.Lesson10.enums;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {
        Country country01 = Country.UK;
        Country country02 = Country.UK;
        System.out.println(country01 == country02); // true
        System.out.println(country01 == Country.UK); // true
        System.out.println(country01 == Country.USA);// false

        Article article01 = new Article("Путешествие по Британии");
        System.out.println(article01.getCountry()); // null
        article01.setCountry(Country.UK);
        System.out.println(article01.getCountry()==country01); //true
        article01.setCountry(Country.FRANCE);

        // методы enum
        // получене массива констат
        Country[] countries = Country.values();
        System.out.println(Arrays.toString(countries));
        // [UK, USA, FRANCE]
        // Arrays.sort(countries) нельзя сортировать

        // индекс элемента перечисления в массиве
        System.out.println(Country.FRANCE. ordinal()); // 2
        System.out.println(article01.getCountry(). ordinal()); // 2

        for (Country country : countries) {
            // методы name и toString возвращают одинаковое
            // строковое представление объекта (элемента перечисления)
            // НО: метод name нельзя переопределить, а метод toString можно переопределить
            // будет возвращать то, что мы в нем напишем
            System.out.println(country.name());
            System.out.println(country.toString());

        }
        // методы equals, hashCode, clone в enum переопределять нельзя


        System.out.println(Priority.HIGH.getCode());

        Priority priority = Priority.MEDIUM;
        System.out.println(priority.getCode());

        Priority[] priorities = Priority.values();
        for (Priority priority1Elem : priorities) { // iter
            System.out.println(priority1Elem.getCode());
        }
    }
}
*/
