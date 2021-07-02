package lesson04;

import java.util.Objects;

public class Pets {
    private int owner;
    private String petName;
    private int petAge;
    private String petsType;

    public Pets() {
    }

    public Pets(String petName, int petAge, String petsType) {
        this.petName = petName;
        this.petAge = petAge;
        this.petsType = petsType;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getPetsType() {
        return petsType;
    }

    public void setPetsType(String petsType) {
        this.petsType = petsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return owner == pets.owner && petAge == pets.petAge && Objects.equals(petName, pets.petName) && Objects.equals(petsType, pets.petsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, petName, petAge, petsType);
    }

    @Override
    public String toString() {
        return "Pets{" +
                "owner=" + owner +
                ", petName='" + petName + '\'' +
                ", petAge=" + petAge +
                ", petsType='" + petsType + '\'' +
                '}';
    }
}