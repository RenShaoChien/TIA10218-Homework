package hw5.hw5_1.superSub;

/**
 * ClassName： Pen
 * package：hw5.hw5_1.superSub
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/7 @{TIME}
 * @Version 1.0
 */
public abstract class Pen {
    private String brand;
    private double price;

    public Pen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Pen() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void write();

}
