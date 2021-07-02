package lesson04;

public class Pets extends User {
    private int owner;
    private String petName;
    private int petAge;
    private String petsType;

    public Pets() {
    }

    public Pets(int owner, String petName, int petAge, String petsType) {
        this.owner = owner;
        this.petName = petName;
        this.petAge = petAge;
        this.petsType = petsType;
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

}