package ru.itmo.lessons.lesson08.transport;

public class Fix {
    private String[] color;
    private Transport[] transports;

    String[] colors = {"red", "blue", "green", "yellow"};
    int index = 0;

    public void AddTransport(Transport transport) {

        transports = new Transport[10];

        if (index < 10) {
            transports[index] = transport;
            index++;
        } else {
            System.out.println("в мастерской нет свободных мест");
        }
        return;
    }
}
