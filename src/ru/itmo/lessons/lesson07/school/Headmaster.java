package ru.itmo.lessons.lesson07.school;

public class Headmaster {
    public void invite(Person person) {
        System.out.println("директор вызвал " + person.getName());



}@Override
public void learn (int level) {
    System.out.println("Директор..." + "Уровень знаний " + level);
}
}




/*public class Director extends Person {

    public Director(String name, int age) {
        super(name, age);
    }

    public void startEducation(){
        System.out.println("run education!");
    }
    public void endEducation(){
        System.out.println("finish education!");
    }
}*/

