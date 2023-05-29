package ru.itmo.lessons.kurs02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save extends Menu {

    private Game game;
    private String fileName;

    public Save(Game game, String fileName) {
        this.game = game;
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        System.out.println("Saving to " + this.fileName);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(

                new FileOutputStream(this.fileName))) {
            outputStream.writeObject(game);
            System.out.println("Game was saved successfully");
        } catch (IOException e) {

            throw new RuntimeException("Error saving game!", e);
        }
    }
}