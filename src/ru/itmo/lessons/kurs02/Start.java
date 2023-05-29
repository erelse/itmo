package ru.itmo.lessons.kurs02;

public class Start extends Menu {
    private Game game;

    public Start(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        Paragraphs.game(game);
    }
}