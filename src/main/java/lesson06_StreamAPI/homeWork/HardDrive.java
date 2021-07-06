package lesson06_StreamAPI.homeWork;

import java.util.Objects;

public class HardDrive {

    private String model;
    private HardType type;
    private MadeIn madeIn;
    private int memory;

    public HardDrive(String model, HardType type, MadeIn madeIn, int memory) {
        this.model = model;
        this.type = type;
        this.madeIn = madeIn;
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HardType getType() {
        return type;
    }

    public void setType(HardType type) {
        this.type = type;
    }

    public MadeIn getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(MadeIn madeIn) {
        this.madeIn = madeIn;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDrive hardDrive = (HardDrive) o;
        return memory == hardDrive.memory && Objects.equals(model, hardDrive.model) && type == hardDrive.type && madeIn == hardDrive.madeIn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, madeIn, memory);
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", madeIn=" + madeIn +
                ", memory=" + memory +
                '}';
    }
}
