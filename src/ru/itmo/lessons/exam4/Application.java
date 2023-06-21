package ru.itmo.lessons.exam4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ru.erelse.object.Group;
import ru.erelse.object.Mountain;
import ru.erelse.object.Mountaineer;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ormLessons"); // должна создаваться в блоке try с ресурсом или у объекта вызван метод close

        EntityManager manager = factory.createEntityManager(); // создание менеджера управляющего ormLesson классами

        Mountaineer mountaineer1 = new Mountaineer("Sergei", "Saint-Petersburg");
        Mountaineer mountaineer2= new Mountaineer("Ekaterina", "Moscow");
        Mountaineer mountaineer3 = new Mountaineer("Ramil", "Kazan");
        Mountaineer mountaineer4= new Mountaineer("Anna", "Narva");
        Mountaineer mountaineer5 = new Mountaineer("Mary", "Tallinn");
        Mountaineer mountaineer6= new Mountaineer("Konstantin", "Riga");
        Mountaineer mountaineer7 = new Mountaineer("Pavel", "Minsk");
        Mountaineer mountaineer8 = new Mountaineer("Liza", "Saint-Petersburg");

        ArrayList<Mountaineer> mountaineers = new ArrayList<>();

        mountaineers.add(mountaineer1);
        mountaineers.add(mountaineer2);
        mountaineers.add(mountaineer3);
        mountaineers.add(mountaineer4);
        mountaineers.add(mountaineer5);
        mountaineers.add(mountaineer6);
        mountaineers.add(mountaineer7);
        mountaineers.add(mountaineer8);


        Mountain mountain1 = new Mountain("Синай", "Египет", 2285);
        Group group1 = new Group(mountaineers, mountain1, 5, LocalDateTime.of(2023, 01, 9, 11, 0), LocalDateTime.of(2023, 01, 19, 11, 0));

        manager.getTransaction().begin();
        manager.persist(mountaineer1);
        manager.persist(mountain1);
        manager.persist(group1);

        manager.persist(mountaineer3);
        manager.persist(mountain1);
        manager.persist(group1);

        manager.persist(mountaineer5);
        manager.persist(mountain1);
        manager.persist(group1);

        manager.getTransaction().commit();

        Mountain mountain2 = new Mountain("Мусала", "Болгария", 6848);
        Group group2 = new Group(mountaineers,
                mountain2, 3,
                LocalDateTime.of(2023, 3, 9, 11, 0),
                LocalDateTime.of(2023, 03, 29, 11, 0));

        manager.getTransaction().begin();
        manager.persist(mountaineer4);
        manager.persist(mountain2);
        manager.persist(group2);

        manager.persist(mountaineer5);
        manager.persist(mountain2);
        manager.persist(group2);

        manager.getTransaction().commit();
        Mountain mountain3 = new Mountain("Дыхтау", "Россия", 2348);

        Group group3 = new Group(mountaineers,
                mountain3, 5,
                LocalDateTime.of(2023, 07, 9, 11, 0),
                LocalDateTime.of(2023, 07, 29, 11, 0));
        manager.getTransaction().begin();
        manager.persist(mountaineer2);
        manager.persist(mountain3);
        manager.persist(group3);

        manager.persist(mountaineer3);
        manager.persist(mountain3);
        manager.persist(group3);

        manager.getTransaction().commit();
    }
}
