package ru.itmo.lessons.lesson08.transport;

public class Fix {
    private Transport[] transports;
    private int transportIndex;
    private String[] colors = {"blue", "green", "red", "yellow", "black", "white"};

    public Fix() {
        transports = new Transport[9];
    }

    public void addTransport(Transport transport){
        if (transportIndex == transports.length) {
            System.out.println("В мастерской нет места для транспортного средства " + transport.getNumber());
            return;
        }
        transports[transportIndex] = transport;
        transportIndex++;
        System.out.print("Транспортное средство " + transport.getNumber() + " добавлено на осмотр. ");
        System.out.println("У "+transport.getNumber()+" установлен уровень износа = "+ transport.getLevel());
    }

    public void startRepair(){
        for (int i = 0; i < transports.length; i++) {



            if (transports[i].getLevel() > 0){
                System.out.println("транспортное средство "+transports[i].getNumber()+" не нуждается в ремонте. Покидает сервис.");
                continue;
            }
            if (transports[i] == null) continue;


            transports[i].repair();

            System.out.print("Транспортное средство " + transports[i].getNumber() + " отремонтировано. Новый уровень износа "+ transports[i].getLevel());

            if (transports[i] instanceof PaintCar) {
                int colorIndex = (int) (Math.random() *  colors.length);

                ((PaintCar) transports[i]).paintCar(colors[colorIndex]);


                System.out.print(" Автомобиль перекрашен. ");
            }

            System.out.println(" Покидает сервис.");
            transports[i] = null;
            transportIndex--;
        }
    }

}
