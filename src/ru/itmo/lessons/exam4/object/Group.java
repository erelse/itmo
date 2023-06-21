package ru.itmo.lessons.exam4.object;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
@Table(name = "table_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGroup;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "groups_mountaineers")
    private ArrayList<Mountaineer> mountaineer;
    @Column(nullable = false)
    private boolean  recruitedGroup = true;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mountain_id", nullable = false)
    private Mountain mountain;

    private int maxGroup;
    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;


    public Group() {
    }

    public Group(ArrayList<Mountaineer> mountaineer, Mountain mountain, int maxGroup, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        if (mountain.equals(null)) throw new IllegalArgumentException("Значение горы не может быть пустым");
        if (maxGroup < 1) throw new IllegalArgumentException("Количество участников не может быть меньше 1");
        this.mountaineer = mountaineer;
        this.mountain = mountain;
        this. recruitedGroup = true;
        this.maxGroup = maxGroup;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;

    }

    public ArrayList<Mountaineer> getMountaineer() {
        return mountaineer;
    }

    public Mountain getMountain() {
        return mountain;
    }

    public Boolean getRecruitedGroup() {
        return  recruitedGroup;
    }

    public int getMaxGroup() {
        return maxGroup;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void addMountaineer(Mountaineer mountaineer) {
        //if (flag.equals(false)) throw new IllegalArgumentException("Группа заполнена");
        if (mountaineer.equals(null)) throw new IllegalArgumentException("Значение не может быть пустым");
        this.mountaineer.add(mountaineer);
        if (this.mountaineer.size() == maxGroup)  recruitedGroup = false;
    }

    @Override
    public String toString() {
        return "Group{" +
                "idGroup=" + idGroup +
                ", mountaineer=" + mountaineer +
                ", mountain=" + mountain +
                ",  recruitedGroup =" +  recruitedGroup +
                ", maxGroup=" + maxGroup +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                '}';
    }
}
