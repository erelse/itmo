package ru.itmo.lessons.kurs02;

public class Play extends Menu {
    private Game game;

    public void StartGame(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        Paragraphs.game(game);
    }

}
