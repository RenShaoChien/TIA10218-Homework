package hw2;

/**
 * ClassName： NineNineTest
 * package：hw2
 * Description：
 * 題目：用各種迴圈完成九九乘法表
 * @Author 任少騫
 * @Create 2024/4/22 @{TIME}
 * @Version 1.0
 */
public class NineNineTest {
    public static void main(String[] args) {

        //for迴圈
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "  ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
        //while迴圈
        int i = 1;

        while(i <= 9){
            int j = 1;
            while(j <= i){
                System.out.print(i + "*" + j + "=" + i * j + " ");
                j++;
            }
            i++;
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
        //do- while 迴圈
        int j = 1;
        do {
            int k = 1;
            do {
                System.out.print(j + "*" + k + "=" + j * k + " ");
                k++;
            }while (k <= j);
            System.out.println();
            j++;
        }while (j <= 9);

    }
}
