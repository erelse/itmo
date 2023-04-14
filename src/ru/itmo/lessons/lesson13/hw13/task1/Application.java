package ru.itmo.lessons.lesson13.hw13.task1;

/*
1. Объявить класс `PairContainer` со свойствами `key` и `value`. `key` и `value` - generic свойства без ограничений, но
   могут быть разных типов.
2. Создать экземпляр `PairContainer`, где key - любые числа, value - строка
3. Создать экземпляр `PairContainer`, где key - строка, value - тип User, у которого id - любые числа
4. Создать экземпляр `PairContainer`, где key - строка, value - тип PairContainer, у которого key - любые числа,
   value - тип User, у которого id - строка*/
public class Application {
    public static void main(String[] args) {
        // Создаем экземпляр `PairContainer`, где key - любые числа, value - строка
        PairContainer<Number, String> pairContainer01 = new PairContainer<>();

        pairContainer01.setKey(2512);
        pairContainer01.setValue("erelseVal");
        System.out.print("key01: " + pairContainer01.getKey());
        System.out.println("; value01: " + pairContainer01.getValue());

        //Создаем экземпляр `PairContainer`, где key - строка, value - тип User, у которого id - любые числа
        PairContainer<String, User<Number>> pairContainer02 = new PairContainer<>();
        User<Number> user = new User<>(); //создаем экземпляр User, где id - любые числа
        user.setId(12345678);
        pairContainer02.setKey("2512S");
        pairContainer02.setValue(user);
        System.out.print("key02: " + pairContainer02.getKey());
        System.out.println("; value02: " + pairContainer02.getValue());

       PairContainer<String, PairContainer<Number, User<String>>> pairContainer03 = new PairContainer<>();

        User<String> userStr = new User<>();

        userStr.setId("1234567Str");
        pairContainer03.setKey("2512Str");
        PairContainer<Number, User<String>> pairContainer04 = new PairContainer<>();
        pairContainer03.setValue(pairContainer04);
        pairContainer04.setKey(2512);
        pairContainer04.setValue(userStr);
        System.out.print("key03: " + pairContainer03.getKey());
        System.out.println("; value03: " + pairContainer03.getValue());

    }
}



