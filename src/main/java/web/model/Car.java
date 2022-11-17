package web.model;

public class Car {

    private int serial;

    private String model;

    private int price;

    public Car(int serial, String model, int price) {
        this.serial = serial;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serial=" + serial +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
