package task1;

import java.util.Objects;

public class Magazine implements Printable {

    private String magazineName;

    public Magazine() {
    }

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(magazineName, magazine.magazineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magazineName);
    }

    @Override
    public String toString() {
        return "task1.Magazine{" +
                "magazineName='" + magazineName + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("task1.Magazine name is: " + getMagazineName());
    }
}
