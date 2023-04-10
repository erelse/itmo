package ru.itmo.lessons.lesson07.school.Lesson10.enums;

// enum может создаваться со свойствами, конструкторами и методами

// Priority extends Enum, поэтому наследование перечислений запрещено
public enum Priority /* можно имплементировать интерфейс */ {
    HIGH(10), MEDIUM(5), LOW(1); // экземпляры типа Priority. если есть конструктор - в скобках указ значение

    // свойство code появилось у  всех объектов
    private  int code; // 0

    // конструктор
    Priority(int code){ // модификатор доступа конструктора всегда private тк в других классах нельзя создавать ...
    // любые инструкции
        this.code = code;

    }

    // меьлды доступны всем элементам (кземплярам) перечисления

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
