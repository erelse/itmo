package ru.itmo.lessons.kurs02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save extends Menu {

    private Game game;

    public Save(Game game){
        this.game=game;
    }

    @Override
    public void execute() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(new File("save")))) {
            outputStream.writeObject(game);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new Start(game).execute();
    }
}
