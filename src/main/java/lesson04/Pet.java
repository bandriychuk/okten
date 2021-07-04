package lesson04;

import java.util.Objects;
import java.util.Scanner;

public class Pet {

    private int age;
    private String name;
    private String petType;

    public Pet() {
    }

    public Pet(int age, String name, String petType) {
        this.age = age;
        this.name = name;
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name) && Objects.equals(petType, pet.petType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", petType='" + petType + '\'' +
                '}';
    }
}
