package lesson06_StreamAPI.lecture;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private int id;
    private String name;
    private String nationality;
    private LocalDate birthDay;
    private int luckyNum;

    public Person(int id, String name, String nationality, LocalDate birthDay) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getLuckyNum() {
        return luckyNum;
    }

    public void setLuckyNum(int luckyNum) {
        this.luckyNum = luckyNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && luckyNum == person.luckyNum && Objects.equals(name, person.name) && Objects.equals(nationality, person.nationality) && Objects.equals(birthDay, person.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nationality, birthDay, luckyNum);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthDay=" + birthDay +
                ", luckyDau=" + luckyNum +
                '}';
    }
}