package ru.itmo.lessons.lesson08;

public class Application {
    public static void main(String[] args) {
        Train train01 = new Train("T1", 0, 3, "blue");
        Train train02 = new Train("T2", 40, 2, "blue");
        Train train03 = new Train("T3", 0, 10, "blue");

        Bus bus01 = new Bus("B1",0 , "blue", true);
        Bus bus02 = new Bus("B2",25 , "green", false);
        Bus bus03 = new Bus("B3", 0,"red", false );

        Car car01 = new Car("C1",0, "white");
        Car car02 = new Car("C2",50 , "black");
        Car car03 = new Car("C3",0 , "red");

        Fix service = new Fix();
        service.addTransport(train01);
        service.addTransport(train02);
        service.addTransport(train03);
        service.addTransport(bus01);
        service.addTransport(bus02);
        service.addTransport(bus03);
        service.addTransport(car01);
        service.addTransport(car02);
        service.addTransport(car03);

        service.startRepair();
    }
}
