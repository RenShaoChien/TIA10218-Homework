package hw3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarEntry;

/**
 * ClassName： LotteryTest
 * package：hw3
 * Description：
 *
 * @Author 任少騫
 * @Create 2024/4/29 @{TIME}
 * @Version 1.0
 */
public class LotteryTest {
    public static void main(String[] args) {
    	
    	Lottery lottery = new Lottery();
    	lottery.removesNumber();
    	lottery.autoNumberSelection();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("阿文請輸入你討厭哪個數字？");
//        int hate = sc.nextInt();
//
//        int[] lottery = {1,2,3,4,5,6,7,8,9,10,
//                        11,12,13,14,15,16,17,18,19,20,
//                        21,22,23,24,25,26,27,28,29,30,
//                        31,32,33,34,35,36,37,38,39,40,
//                        41,42,43,44,45,46,47,48,49};
//
//        int count = 0;
//
//        int[] temp = new int[49];
//        if (hate != 0) {
//            for (int i = 1; i < 50; i++) {
//                if (i / 10 != hate && i % 10 != hate) {
//                    temp[count++] = i;
//                }
//            }
//        }else {
//            for (int i = 1; i < 50; i++) {
//                if (i != 10 && i != 20 && i != 30 && i != 40) {
//                    temp[count++] = i;
//                }
//            }
//        }
//        System.out.println(count);
//
//        int[] arr = new int[count];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = temp[i];
//        }
//
////        for (int i = 0; i < temp.length; i++) {
////            System.out.print(temp[i] + "  ");
////        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("\n..................................................");
//
//
//        
//        for (int i = 0; i < count - 6; i++) {
//            int target = (int) (Math.random() * (arr.length));
//            int[] newArr = new int[arr.length - 1];
//            for (int j = 0; j < target; j++) {
//                newArr[j] = arr[j];
//            }
//            for (int j = target; j < arr.length - 1; j++) {
//                newArr[j] = arr[j + 1];
//            }
//            arr = newArr;            
//        }        
//
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + " ");
//        }
//

        
    }
}
