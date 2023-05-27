
package ru.itmo.lessons.kurs02;

import java.io.*;

public class Load extends Menu implements Serializable {

    private Game game;

    public Load(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("savedGame"))) {
            Game gameObject = (Game) ois.readObject();

           // System.out.printf(gameObject.getText());
         /*   System.out.printf(game.getFirst());
            System.out.printf(game.getSecond());*/

          // game = new Game(gameObject.getFirst(), gameObject.getFirst(),
                    gameObject.getText());



        } catch (Exception ex) {


            System.out.println(ex.getMessage());
        }
        new Start (game).execute();
    }

}





   /* }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("savedGame"))) {
            ObjectOfTheGame gameObject= ((ObjectOfTheGame) objectInputStream.readObject());


outputStream.writeObject(gameObject);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        new Start(gameObject).execute();
*/

/* System.out.println(gameObject.getText());*//*

    }
}

   */
/* ObjectInputStream objectInputStream = new ObjectInputStream(
            new FileInputStream("person.out"));
    Person igorRestored = (Person) objectInputStream.readObject();
    Person renatRestored = (Person) objectInputStream.readObject();
        objectInputStream.close();
*/
