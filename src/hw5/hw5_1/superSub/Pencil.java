package hw5.hw5_1.superSub;

/**
 * ClassName： Pencil
 * package：hw5.hw5_1.superSub
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/7 @{TIME}
 * @Version 1.0
 */
public class Pencil extends Pen{

    public Pencil(String brand, double price) {
        super(brand, price);
    }

    public Pencil() {
    }

    @Override
    public void write() {
        System.out.println("削鉛筆再寫");
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
