package hw5;

/**
 * ClassName： MyRectangle
 * package：hw5
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/7 @{TIME}
 * @Version 1.0
 */
public class MyRectangle {
    private double width;
    private double depth;

    public MyRectangle() {
    }

    public MyRectangle(double width, double depth) {
        this();
        this.width = width;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getArea() {
        return width * depth;
    }
}

class MyRectangeleMain{
    public static void main(String[] args) {
        MyRectangle mr = new MyRectangle(10 , 20);
        System.out.println(mr.getArea());
    }
}

