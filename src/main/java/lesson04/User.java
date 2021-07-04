package lesson04;

import java.util.*;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private List<Pet> pet;

    public User() {
    }

    public User(int id, String firstName, String lastName, List<Pet> pet) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
    }

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(pet, user.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, pet);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                '}';
    }

    public User addPetToClubMember(User user, Pet pet) {
        user.getPet().add(pet);
        System.out.println(user);
        return user;
    }

    public void addManyPetsToUser(User user, List<Pet> pets) {
        user.getPet().addAll(pets);
    }

    public void removePet(User user, String petName) {
        Iterator<Pet> iterator = user.getPet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(petName)) {
                iterator.remove();
                return;
            }
            System.out.println("Pet with name: " + petName + " doesn't exist" );
        }
    }

    public User getMember(Scanner in) {
        System.out.println("Enter memberId");
        int memberId = in.nextInt();
        System.out.println("Enter FirstName");
        String firstName = in.next();
        System.out.println("Enter LastName");
        String lastName = in.next();
        User NewMember = getUser(memberId, firstName, lastName);
        return NewMember;
    }

    public User getUser(int memberId, String firstName, String lastName) {
        User NewMember = new User(memberId, firstName, lastName);
        return NewMember;
    }

    public User getUser(int memberId, String firstName, String lastName, List<Pet> pets) {
        User NewMember = new User(memberId, firstName, lastName, pets);
        return NewMember;
    }

    public User getMember(Scanner in, List<Pet> pets) {
        System.out.println("Enter memberId");
        int memberId = in.nextInt();
        System.out.println("Enter FirstName");
        String firstName = in.next();
        System.out.println("Enter LastName");
        String lastName = in.next();
        User NewMember = getUser(memberId, firstName, lastName, pets);
        return NewMember;
    }

    public Pet getPet(Scanner in) {
        System.out.println("Enter Pet age");
        int petAge = in.nextInt();
        System.out.println("Enter Pet name");
        String petName = in.next();
        System.out.println("Enter Pet type");
        String petType = in.next();
        Pet newPetMember = new Pet(petAge, petName, petType);
        return newPetMember;
    }
}
