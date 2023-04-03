package ru.itmo.lessons.lesson08.transport;

public interface IUse {
    default public void defaultUsing() {
        System.out.println("Использование транспортного средства");
    }

    public void use(int level); //абстрактный метод
}
