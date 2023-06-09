package lesson2403;

import java.util.regex.*;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

/*
Вывести в консоль количество слов "JAVA", встречающихся в тексте из предыдущего задания

_JAVA стоит первым в рейтинге популярности использования языков; JAVA один из наиболее мощных
   высокоуровневых языков программирования; JAVA поддерживает большое количество встроенных библиотех, которые позволяют
   быстро писать проекты любого класса сложности; курс «JUNIOR JAVA DEVELOPER» предназначен для подготовки
   программистов-профессионалов, специализирующихся на разработке программного обеспечения различного класса и уровня
   сложности_.
 */
public class Lesson2403c {
    public static void main(String[] args) {
        String text = "_JAVA стоит первым в рейтинге популярности использования языков; JAVA один из наиболее мощных\n" +
                "   высокоуровневых языков программирования; JAVA поддерживает большое количество встроенных библиотех, которые позволяют\n" +
                "   быстро писать проекты любого класса сложности; курс «JUNIOR JAVA DEVELOPER» предназначен для подготовки\n" +
                "   программистов-профессионалов, специализирующихся на разработке программного обеспечения различного класса и уровня\n" +
                "   сложности_.";
        int count = 0;
        while (text.contains("JAVA")) {
            text = text.replaceFirst("JAVA", "PYTHON");
            count++;
        }
        System.out.println(count);
    }
}

