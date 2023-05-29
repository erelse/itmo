package ru.itmo.lessons.kurs02;

import java.io.*;

public class Load extends Menu implements Serializable {

    private String fileName;

    public Load(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void execute() {

        System.out.println("=== Загружаем игру из файла: " + this.fileName);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Game game = (Game) ois.readObject();

            new Start(game).execute();

        } catch (Exception ex) {

            System.err.println("Ошибка загрузки файла!\n" + ex.getMessage());
        }
    }
}