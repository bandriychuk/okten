package lesson06_StreamAPI.homeWork;

import java.util.Objects;

public class Computer {

    private String model;
    private int year;
    private HardDrive hardDrive;
    private double price;
    private Processor processor;

    public Computer(String model, int year, HardDrive hardDrive, int price, Processor processor) {
        this.model = model;
        this.year = year;
        this.hardDrive = hardDrive;
        this.price = price;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardType(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return year == computer.year && Double.compare(computer.price, price) == 0 && Objects.equals(model, computer.model) && Objects.equals(hardDrive, computer.hardDrive) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, hardDrive, price, processor);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", hardDrive=" + hardDrive +
                ", price=" + price +
                ", processor=" + processor +
                '}';
    }
}
