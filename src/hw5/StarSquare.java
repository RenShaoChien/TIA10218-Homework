package hw5;

import java.util.Scanner;

/**
 * ClassName： StarSquare package：hw5 Description：
 *
 * @Author 任少騫
 * @Create 2024/5/6 @{TIME}
 * @Version 1.0
 */
public class StarSquare {
    Scanner sc = new Scanner(System.in);
    private int height;
    private int width;

    public StarSquare(){
        System.out.println("請輸入高：");
        height = sc.nextInt();
        while(!judgmentInputH()){
            System.out.println("輸入高有誤，請重新書輸入");
            height = sc.nextInt();
        }
        System.out.println("請輸入長：");
        width = sc.nextInt();
        while(!judgmentInputW()){
            System.out.println("輸入長有誤，請重新書輸入");
            width = sc.nextInt();
        }
        sc.close();
    }

    public boolean judgmentInputH(){
        return height > 0;
    }

    public boolean judgmentInputW(){
        return width > 0;
    }

    public void printStarSquare(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarSquare sS = new StarSquare();
        sS.printStarSquare();
    }
}
