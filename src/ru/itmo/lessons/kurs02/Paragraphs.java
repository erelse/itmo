package ru.itmo.lessons.kurs02;

import java.util.Scanner;


public class Paragraphs {
    private static final String PREFIX = "********************\n";
    private static final String MENU = "3 - Меню\n";
    private static Game[] paragraphs = {
            new Game(0, 1, 2,
                    PREFIX + "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было " +
                            "исключением. Лисёнок пришёл на их обычное место встречи, но \n" +
                            "Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. \" " +
                            "Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\n" +
                            "- подумал Лисёнок. Как поступить Лисенку?\n" + "1 - Вернуться домой\n" + "2 - Отправиться на поиски\n" + MENU),

            new Game(1, 14, 14, PREFIX + "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место " +
                    "встречи раньше и увидел там рой злобных пчел. \n" +
                    "Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга!\n "
                    + "Игра завершилась успехом"),

            new Game(2, 3, 4,
                    PREFIX + "Все лесные жители были заняты своими делами и не " +
                            "обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... \n" +
                            "Лисёнок не знал, что ему делать. Помогите ему.\n" +
                            "1 - Попытаться разузнать о Бельчонке у лесных жителей\n" +
                            "2 - Искать Бельчонка в одиночку\n" +
                            MENU),

            new Game(3, 5, 6,
                    PREFIX + "Пока Лисёнок принимал решение, лесные жители " +
                            "разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк\n" +
                            " может сильно разозлиться из-за расспросов. Кого выбрать?\n" +
                            "1 - Расспросить Сову\n" +
                            "2 - Расспросить Волка\n" +
                            MENU),

            new Game(4, 13, 13, PREFIX + "Лисёнок слишком долго плутал по лесу в поисках друга " +
                    "и сам не заметил," +
                    " как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей\n"),

            new Game(5, 7, 4,
                    PREFIX + "Сова долго не хотела говорить, но в итоге сказала, " +
                            "что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, \n" +
                            "что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.\n" +
                            "1 - Поверить Сове и отправиться вглубь леса\n" +
                            "2 - Сове не стоит верить. Искать Бельчонка в одиночку\n" +
                            MENU),

            new Game(6, 1, 4,
                    PREFIX + "Волк оказался вполне дружелюбным, но помочь не смог. " +
                            "Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?\n" +
                            "1 - Волк прав. Вернуться домой\n" +
                            "2 - Искать Бельчонка в одиночку\n" +
                            MENU),

            new Game(7, 4, 8,
                    PREFIX + "В глубине леса Лисёнок встретил Медвежонка. " +
                            "Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.\n"
                            + "1 - Нет, потрачено слишком много времени, нужно идти дальше. Искать Бельчонка в одиночку\n" +
                            "2 - Нужно воспользоваться шансом и раздобыть мёд\n" +
                            MENU),

            new Game(8, 9, 10,

                    PREFIX + "Лисёнок быстро нашёл мёд, " +
                            "но вокруг летал рой злобных пчел. Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.\n" +
                            "1 - Подождать, вдруг пчёлы улетят\n" +
                            "2 - Нужно попытаться выкрасть мёд немедленно\n" +
                            MENU),

            new Game(9, 11, 12,
                    PREFIX + "Лисёнок подождал немного, и пчёлы разлетелись. " +
                            "Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?\n" +
                            "1 - Поесть немного и передохнуть\n" +
                            "2 - Скорее отнести мёд Медвежонку\n" +
                            MENU),

            new Game(10, 13, 13, PREFIX + "Это была не лучшая идея. " + "Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. Игра завершилась неудачей\n"),
            new Game(11, 13, 13, PREFIX + "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. " + "Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей"),
            new Game(12, 4, 1,
                    PREFIX + "Довольный Медвежонок рассказал Лисёнку, " +
                            "что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса." +
                            " Он заверял Лисёнка, \nчто Белки не попадают в неприятности, и что Совам нельзя верить, " +
                            "он также уговаривал Лисёнка вернуться домой.\n" +
                            "1 - Медвежонок ничего не знает, нужно продолжить поиски. Искать Бельчонка в одиночку\n" +
                            "2 - Может быть он прав и Лисёнок просто паникует. Вернуться домой\n" +
                            MENU),

            new Game(13, 13, 13, "\nВы проиграли."),
            new Game(14, 14, 14, "\nВы выиграли.")
    };

    public static Game getStartPoint() {
        return paragraphs[0];
    }

    public static void game(Game paragraph) {
        System.out.println(paragraph.getText());

        if (paragraph.getFirst() == paragraph.getSecond()) {
            System.out.println(Paragraphs.paragraphs[paragraph.getFirst()].getText());
            return;
        }
        System.out.print("Введите вариант: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        if (numb == 1) Paragraphs.game(Paragraphs.paragraphs[paragraph.getFirst()]);
        else if (numb == 2) Paragraphs.game(Paragraphs.paragraphs[paragraph.getSecond()]);
        else if (numb == 3) Menu.SecondCommand(paragraph).execute();
        else {
            System.out.println("Введите 1, 2 или 3");
            Paragraphs.game(paragraph);
        }
    }

    public static void start() {
        Menu.firstCommand().execute();
    }
}