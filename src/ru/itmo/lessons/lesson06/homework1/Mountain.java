/*
package ru.itmo.lessons.lesson6.homework1;

public class Mountain {
    private String name;
    private String country;
    private int height;

    public Mountain(String name, String country, int height) {
        setName(name);
        setHeight(height);
        setCountry(country);
    }

    public void setName(String name) {
        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("name не менее 4 символов");
        }
        this.name = name;
    }

    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("country не менее 4 символов");
        }
        this.country = country;
    }

    public void setHeight(int height) {
        if (height < 100) {
            throw new IllegalArgumentException("height < 100 meters");
        }
        this.height = height;
    }

    public String getMountain() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return country + " " + name + " " + height;
    }

}

*/
