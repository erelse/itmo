package ru.itmo.lessons.kurs02;

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
            return new Start(new Paragraphs().getParagraphs()[0]);
        } else if (numb == 3) {
            return new Exit();
        }
        System.out.println("Некорректный ввод, введите 1, 2 или 3");
        return Menu.firstCommand();
    }

    static Menu secondCommand(Game game) {
        System.out.println("Меню: \n1. Сохранить игру \n2. Загрузить игру \n3. Выйти");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        sc.nextLine();
        if (numb == 1) {
            return  new Save(game);
        } else if (numb == 2) {
            return new Start(game);
        } else if (numb == 3) {
            return new Exit();
        }
        System.out.println("Некорректный ввод, введите 1, 2 или 3");
        return Menu.secondCommand(game);
    }

    public abstract void execute();
}
