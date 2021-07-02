package lesson04;

import java.util.Objects;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private UserGender gender;
    private Pets pets;

    public User() {
    }

    public User(int id, String firstName, String lastName, int age, UserGender gender, Pets pets) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.pets = pets;
    }

    public User(int id, String firstName, String lastName, int age, UserGender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserGender getGender() {
        return gender;
    }

    public void setGender(UserGender gender) {
        this.gender = gender;
    }

    public Pets getPets() {
        return pets;
    }

    public void setPets(Pets pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && gender == user.gender && Objects.equals(pets, user.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, gender, pets);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", pets=" + pets +
                '}';
    }

    public void setPets(String petsName, int petsAge, String petsType) {
    }
}
