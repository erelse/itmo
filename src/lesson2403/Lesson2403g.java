package lesson2403;
/*Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        Предложение для поска длинного слова: `"в предложении все слова разной длины"`
         (самостоятельно найти метод преобразования  строки в массив строк).split()
*/

public class Lesson2403g {
    public static void main(String[] args) {
        String text = "в предложении все слова разной длины";


        String[] textmass = text.split(" ");
        int count = text.split(" ").length;
        System.out.println(count);
        int max = textmass[0].length();
        int index = 1;
        for (int i = 1; i < count; i++) {
            if (textmass[i].length() > max) {
                max = textmass[i].length();
                index = i;
            }
        }
        System.out.println("Самое длинное слово в тексте: " + textmass[index]);
    }
}






