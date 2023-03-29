package ru.itmo.lessons.lesson6.homework1;

public class Application {
    public static void main(String[] args) {


        Climber[] climbers = new Climber[3];
        climbers [0] = new Climber("Li Si", "Hubei");
        climbers [1] = new Climber("Alexander", "Saint-Petersburg");
        climbers [2] = new Climber("Martin", "Berlin");

        Mountain[] mountains =new  Mountain [3] ;
        mountains [0] = new Mountain("Чогори", "Кашмир", 8614);
        mountains [1] = new Mountain("Эверест", "Непал", 8848);
        mountains [2] = new Mountain("Канченджанга", "Непал", 8586);

        Group[] groups = new Group[3];
        groups [0] = new Group(true, Mountain mountains[0], 3);
        groups [1] = new Group(true, Mountain mountains[1], 2);
        groups [2] = new Group(true, Mountain mountains[2], 2);


        /*for(int i = 0; i < 3; i++) {
        //добавить альпиниста в нулевую группу ;
        }
        for(int i = 0; i < 2; i++) {
            //добавить в первую группу ;
        }

        }
        for(int i = 1; i < 3; i++) {
        //добавить в первую группу ;*/
        }


}
