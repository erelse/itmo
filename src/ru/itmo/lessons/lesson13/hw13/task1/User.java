package ru.itmo.lessons.lesson13.hw13.task1;
public class User<I> {
    private I id;
    private String value01;

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

    public String getValue01() {
        return value01;
    }

    public void setValue01(String value01) {
        this.value01 = value01;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", value01='" + value01 + '\'' +
                '}';
    }
}