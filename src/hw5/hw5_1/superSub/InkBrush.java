package hw5.hw5_1.superSub;

/**
 * ClassName： InkBrush
 * package：hw5.hw5_1.superSub
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/7 @{TIME}
 * @Version 1.0
 */
public class InkBrush extends Pen{

    public InkBrush(){

    }

    public InkBrush(String brand , double price){
        super(brand , price);
    }
    @Override
    public void write() {
        System.out.println("沾墨汁再寫");
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}
