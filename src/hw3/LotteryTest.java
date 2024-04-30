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
    }
}
