
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
            Game game = (Game) ois.readObject();

            game.getText();

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        new Start(game).execute();
    }

}
