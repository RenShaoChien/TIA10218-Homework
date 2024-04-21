package hw2;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.css.CSSFontFaceRule;

/**
 * ClassName： HomeWork2
 * package：hw2
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/4/19 @{TIME}
 * @Version 1.0
 */
public class HomeWork2 {
    public static void main(String[] args) {
        //設計一支Java程式，計算1 ~ 1000的偶數和(2+4+6+8+....+1000)
        int sum = 0;
//        for (int i = 2; i <= 1000; i += 2) {
//            sum += i;
//        }
//        System.out.println(sum);//250500
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println("=================================================");
        //計算1 ~10的連乘積(1 * 2 * 3 * ...* 10)用for迴圈
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println(product);
        System.out.println("=================================================");
        //計算 1 ~ 10 的連乘積用while迴圈
        int product1 = 1;
        int i = 1;
        while( i <= 10){
            product1 *= i;
            i++;
        }
        System.out.println(product1);
        System.out.println("=================================================");
        //輸出結果為以下： 1 4 9 16 25 36 49 64 81 100
        //1*1 2*2 3*3...
        for (int j = 1; j <= 10; j++) {
            int k = j;
            k *= j;
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("=================================================");
        //阿文很熱衷大樂透(1~49)，但不喜歡有4的數字，不論是個位數或是十位數。請設計一支程式，
        //輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
        int count = 0;
        System.out.print("阿文可選擇的數字有：");
        
        for (int j = 1; j < 50 ; j++) {
            if (j % 10 == 4 || j / 10 == 4){
                //continue;
            }
            System.out.print(j + "\t");
            count++;
        }
        System.out.println();
        System.out.println("總共有" + count + "個");

        System.out.println("=================================================");
        //輸出結果如下：
//        1 2 3 4 5 6 7 8 9 10
//        1 2 3 4 5 6 7 8 9
//        1 2 3 4 5 6 7 8
//        1 2 3 4 5 6 7
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
        int temp = 1;
        for (int j = 1; j <= 10 ; j++) {
            for (int k = 1; k <= 11-j; k++) {
                System.out.print(temp + " ");
                temp++;
            }
            temp = 1;
            System.out.println();
        }
        System.out.println("=================================================");
        //輸出結果如下：
        /*
        * A
        * BB
        * CCC
        * DDDD
        * EEEEE
        * FFFFFF
        * */
        for (int j = 1; j <= 6; j++) {
            for (int k = 1; k <= j; k++) {
                switch (j){
                    case 6:
                        System.out.print('F');
                        continue;
                    case 5:
                        System.out.print('E');
                        continue;
                    case 4:
                        System.out.print('D');
                        continue;
                    case 3:
                        System.out.print('C');
                        continue;
                    case 2:
                        System.out.print('B');
                        continue;
                    case 1:
                        System.out.print('A');
                        continue;
                }
            }
            System.out.println();
        }

    }
}
