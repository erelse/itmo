package ru.itmo.lessons.exam4.object;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "table_mountain")
public class Mountain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMountain;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private int height;


    @OneToMany(mappedBy = "mountain", fetch = FetchType.EAGER)
    private ArrayList<Group> group;

    public Mountain() {
    }

    public Mountain(String name, String country, int height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "idMountain=" + idMountain +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
