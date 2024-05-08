package hw5;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * ClassName： RandAvg
 * package：hw5
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/5/7 @{TIME}
 * @Version 1.0
 */
public class RandAvg {
    private int[] rand;

    public RandAvg(){
        rand = new int[10];
       // Arrays.fill(rand , (int)(Math.random() * 101));

    }

    public  void setRand(){
        for (int i = 0; i < this.rand.length; i++) {
            rand[i] = (int)(Math.random() * 101);
        }
    }

    public static double calculateAverage(int[] array) {
        OptionalDouble average = Arrays.stream(array).average();
        return average.isPresent() ? average.getAsDouble() : 0.0;
    }

    public int[] getRand() {
        return rand;
    }

    @Override
    public String toString() {
        return "RandAvg{" +
                "rand=" + Arrays.toString(rand) +
                '}';
    }

    public static void main(String[] args) {
        RandAvg avg = new RandAvg();
        avg.setRand();
        System.out.println(avg.toString());
        System.out.println(calculateAverage(avg.rand));
    }
}
