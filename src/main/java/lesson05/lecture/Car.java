package lesson05.lecture;

import java.util.Objects;

public class Car {
    private String brand;
    private int price;
    private CarType carType;

    public Car() {
    }

    public Car(String brand, int price, CarType carType) {
        this.brand = brand;
        this.price = price;
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(brand, car.brand) && carType == car.carType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, carType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", carType=" + carType +
                '}';
    }
}
