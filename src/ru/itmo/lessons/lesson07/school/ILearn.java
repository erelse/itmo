package ru.itmo.lessons.lesson07.school;

public interface ILearn {
    // могут содержать константы
    // могут содержать ststic методы с реализацией
    // могут содержать методы с реализацией, если они отмечены как default
    default public void defaultLearning(){
        System.out.println("Обучение...");

    }
    // могут содержать методы без реализации (абстрактные) должны быть реализованы
    // в расширяющем не abstract классе
    public void learn(int level);

    // нельзя создать экземпляр интерфейса
    // интерфейс может наследоваться от другог интерфейса
    // разрешено множественное наследование интерфейсов
    // interface A extends B, C, X {}
}
