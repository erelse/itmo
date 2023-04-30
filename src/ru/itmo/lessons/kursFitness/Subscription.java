package ru.itmo.lessons.kursFitness;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Subscription {

    //задаем свойства, к этим свойствам относится: тип абонемента и его владелец, а так же дата регистрации абонемента и срок истечения
    private TypesOfSubscription type;
    private HolderOfSubscription holder;
    private LocalDate startOfSubscription;
    private LocalDate endOfSubscription;
    private int numberOfSubscription = (int) (Math.random() * 1000);

    //задаем сеттер для держателя абонемента для проверки
    public void setHolder(HolderOfSubscription holder) {
        this.holder = holder;
    }

    //задаем конструктор
    public Subscription(TypesOfSubscription type, HolderOfSubscription holder) {
        startOfSubscription = LocalDate.now();
        this.type = type;
        setHolder(holder);
        if (type == TypesOfSubscription.FORONEDAY) {
            endOfSubscription = LocalDate.now().plusDays(1);
        } else endOfSubscription = LocalDate.now().plusDays(31);
    }

    //геттер, для даты срока истечения абонемента
    public LocalDate getEndOfSubscription() {
        return endOfSubscription;
    }

    //геттер, возвращающий тип абонемента
    public TypesOfSubscription getType() {
        return type;
    }

    //геттер, возвращающий владельца абонемента
    public HolderOfSubscription getHolder() {
        return holder;
    }

    //геттер, возвращающий номер абонемента
    public int getNumberOfSubscription() {
        return numberOfSubscription;
    }
}
