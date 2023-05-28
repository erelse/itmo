package ru.itmo.lessons.kurs02;

import ru.itmo.lessons.kurs02.Game;
import ru.itmo.lessons.kurs02.Save;

import java.util.Scanner;

public abstract class Menu {
    public static  Menu firstCommand() {
        System.out.println("********************\n Меню: \n1. Начать игру \n2. Загрузить игру \n3. Выйти \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        int numb = sc.nextInt();




       if (numb == 1) {
            return new Start(new Paragraphs().getParagraphs()[0]);
        } else if (numb == 2) {
            return /*new ru.itmo.lessons.kurs02.Load(game);*/new Start(new Paragraphs().getParagraphs()[0]);
            // чтобы загружался хотя бы нулевой параграф нужна загрузка игры из Load(game). Не получается!
        } else if (numb == 3) {
            return new Exit();
        }
        System.out.println("Некорректный ввод, введите 1, 2 или 3");
        return Menu.firstCommand();
    }

    static ru.itmo.lessons.kurs02.Menu SecondCommand(Game game) {
        System.out.println("Меню: \n1. Сохранить игру \n2. Загрузить игру \n3. Выйти");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        sc.nextLine();
        if (numb == 1) {
            return  new Save(game);
        } else if (numb == 2) {
            return new ru.itmo.lessons.kurs02.Start(game);
        } else if (numb == 3) {
            return new ru.itmo.lessons.kurs02.Exit();
        }
        System.out.println("Некорректный ввод, введите 1, 2 или 3");
        return ru.itmo.lessons.kurs02.Menu.SecondCommand(game);
    }

    public abstract void execute();
}