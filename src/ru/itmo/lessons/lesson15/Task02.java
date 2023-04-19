package ru.itmo.lessons.lesson15;

import java.util.*;

public class Task02 {


    public static void topTenWord (String text) {

        if (text == null ) {
            System.out.println("Некорректные параметры метода");
            return;
        }
        while (text.contains("  ")) {
            text = text.replaceAll("  ", " ");
        }
        String[] words = text.toLowerCase().split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            hashMap.put(word,  hashMap.getOrDefault(word, 0) +1);
        }

        ArrayList<Map.Entry<String,Integer>> arrayList = new ArrayList<>(hashMap.entrySet());
        arrayList.sort(new CountComparator());


        for (int i = 0; i < 10; i++) {
            System.out.println(arrayList.get(i).getKey());
        }
    }

    public static int wordCount(String text, String string) {
        if (text == null || string == null) {
            System.out.println("Некорректные параметры метода");
            return -1;
        }
        int count = 0;
        while (text.contains("  ")) {
            text = text.replaceAll("  ", " ");
        }
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase(string)) count ++;
        }

        System.out.println(Arrays.toString(words));
        return count;
    }



    public static Map<Integer, Set<String>> generateWordGroup (String text) {
        Map<Integer, Set<String>> hashMap = new HashMap<>();
        if (text == null ) {
            System.out.println("Некорректные параметры метода");
            return hashMap;
        }
        while (text.contains("  ")) {
            text = text.replaceAll("  ", " ");
        }
        String[] words = text.split(" ");

        for (String word : words) {
            Set<String> l = hashMap.getOrDefault(word.length(), new HashSet<>());
            l.add(word);
            hashMap.put(word.length(), l);
        }
        return hashMap;
    }


    public static List<String> createListLogin(Map<String, String> firstTaskMap, String city) {
        if (firstTaskMap == null || city == null) throw new IllegalArgumentException();
        List<String> arrayListLogin = new ArrayList<>();
        for (Map.Entry<String, String> pair : firstTaskMap.entrySet()) {
            if (pair.getValue().equalsIgnoreCase(city)) {
                arrayListLogin.add(pair.getKey());
            }
        }
        return arrayListLogin;

    }


    public static Map<String, Integer> sameWordCount(List<String> words) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            /*if (hashMap.containsKey(word)) hashMap.replace(word, hashMap.get(word) + 1);
            else hashMap.put(word, 1);*/
            int count = hashMap.getOrDefault(word, 0);
            hashMap.put(word, count + 1);
        }
        return hashMap;
    }

    public static void main(String[] args) {
        // FIXME:: В решениях не использовать lambda выражения и stream API

        // TODO (2.1) написать статический метод, который принимает на вход map (например, firstTaskMap) и город (например, city),
        //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";
        System.out.println(createListLogin(firstTaskMap, city));


        // TODO (2.2) дан список слов (например, words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов в списке
        //  в map вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");
        System.out.println(sameWordCount(words));

        // TODO (2.3) Задания по тексту (например, text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
        //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        String string = "still";
        System.out.println(string + ": " + wordCount(text, string));

        System.out.println(generateWordGroup(text));
      topTenWord(text);


    }



}
class CountComparator implements Comparator<Map.Entry<String,Integer>> {
    @Override
    public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {

        return Integer.compare(o2.getValue(), o1.getValue());
    }
}