package hw3;

import java.util.Scanner;

/**
 * ClassName： Traingle
 * package：hw3
 * Description：
 * 回家作業一：
 *  一支程式，使用者輸入三個數字後，輸出結果會成為正三角形、等腰三角形、正三角形、其他三角形或不是三角形
 * @Author 任少騫
 * @Create 2024/4/29 @{TIME}
 * @Version 1.0
 */
public class Traingle {
    private int a;
    private int b;
    private int c;

    public Traingle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入邊長a：");
        this.a = sc.nextInt();
        System.out.print("\n請輸入邊長b：");
        this.b = sc.nextInt();
        System.out.print("\n請輸入邊長c：");
        this.c = sc.nextInt();
        sc.close();
    }

    /**
     * 此方法為判斷三角形類別
     */
    public void getTraingleType(){
        if(a == b && a == c){
            System.out.println("\n這是一個正三角形。");
        }else if(a == b || a == c || b == c){
            System.out.println("這是一個等腰三角形。");
        }else if(a * a == b * b + c * c ||
                b * b == a * a + c * c||
                c * c == a * a + b * b){
            System.out.println("這是一個直角三角形。");
        }else if (a == 0 || b == 0 || c == 0){
            System.out.println("你喵的懂不懂什麼是三角形！");
        }
    }
}
