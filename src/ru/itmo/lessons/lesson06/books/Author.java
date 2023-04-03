package ru.itmo.lessons.lesson06.books;

public class Author {
    // св-ва, хар-ки, поля, атрибуты
    // значения свойств по умолчанию
    // для ссылочных типов - null
    // для цклых чисел - 0
    // для чисел с плав точкой - 0.0
    // для типа boolean - false
    // модификатор доступа ТипДанных имяСвойства
    public String name;
    public String surname;

    // методы
    // модификатор доступа
    // ТипДанных возвр знач
    // имя метода отражает что делает метод
    // () с параметрами
    // {} тело метода, инстр, кот
    public String getFullName() {
        String fullName = name + " " + surname;
        return fullName; // return name + " " + surname
        // return исп чтобы вернуть рез раб метода
        // return прерыв раб метода


    }
    public void printFullName(){
        // return; прерыв раб метода
        System.out.println("name +  + surname");
    }








}

