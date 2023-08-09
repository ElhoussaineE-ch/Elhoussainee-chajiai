package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private String prenom;
    private int age;
    private Genre genre;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String prenom, int age, Genre genre) {
        this.name = name;
        this.prenom = prenom;
        this.age = age;
        this.genre = genre;
    }
    public Person newSas(){
        return new Person( "saso");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(prenom, person.prenom) && genre == person.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prenom, age, genre);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", genre=" + genre +
                '}';
    }
}
