package lesson03.task2;

import java.util.Objects;

public class Guitar implements Instruments{

    private int countOfStrings;

    public Guitar() {
    }

    public Guitar(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    public int getCountOfStrings() {
        return countOfStrings;
    }

    public void setCountOfStrings(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return countOfStrings == guitar.countOfStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countOfStrings);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "countOfStrings=" + countOfStrings +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Play the Guitar with: " + this.countOfStrings + " Strings");
    }
}
