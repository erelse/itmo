package ru.itmo.lessons.exam4.object;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "table_mountaineer")
public class Mountaineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMountaineer;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;


    @ManyToMany
    private ArrayList<Group> groups;

    public Mountaineer() {
    }

    public Mountaineer(String name, String address) {
        this.name = name;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Mountaineer{" +
                "idMountaineer=" + idMountaineer +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
