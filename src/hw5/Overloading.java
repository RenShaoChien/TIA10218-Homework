package hw5;

import java.util.Arrays;

/**
 * ClassName： Overloading
 * package：hw5
 * Description：
 * 利用Overloding，設計兩個方法int maxElement(int[][] x)與double maxElement(double[][] x)
 * 可以找出二維陣列的最大值並回傳
 * @Author 任少騫
 * @Create 2024/5/7 @{TIME}
 * @Version 1.0
 */
public class Overloading {
    int[][] arrsi;
    double[][] arrsd;

    public Overloading(){
        arrsi = new int[][]{{1, 6, 3},{9, 5, 2}};
        arrsd = new double[][]{{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};
    }

    public void sort(int[][] arrsi) {
        for (int i = 0; i < arrsi.length; i++) {
            for (int j = 0; j < arrsi[i].length; j++) {
                Arrays.sort(arrsi[i]);
            }
        }
    }
    public void sort(int[] arri) {
        for (int i = 0; i < arri.length; i++) {
                Arrays.sort(arri);
        }
    }
    public void sort(double[][] arrsd){
        for (int i = 0; i < arrsd.length; i++) {
            for (int j = 0; j < arrsd[i].length; j++) {
                Arrays.sort(arrsd[i]);
            }
        }
    }

    public void sort(double[] arrd) {
        for (int i = 0; i < arrd.length; i++) {
            Arrays.sort(arrd);
        }
    }
    public int maxElement(int[][] arrsi){
        sort(arrsi);
        int[] max = new int[arrsi.length];
        for (int i = 0; i < arrsi.length; i++) {
            max[i] = arrsi[i][arrsi[i].length - 1];
        }
        sort(max);
        return max[max.length - 1];
    }

    public double maxElement(double[][] arrsd){
        sort(arrsd);
        double[] max = new double[arrsd.length];
        for (int i = 0; i < arrsd.length; i++) {
            max[i] = arrsd[i][arrsd[i].length - 1];
        }
        sort(max);
        return max[max.length - 1];
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.maxElement(overloading.arrsi));
        System.out.println(overloading.maxElement(overloading.arrsd));
    }
}
