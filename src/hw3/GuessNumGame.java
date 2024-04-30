package hw3;

import java.util.Scanner;

/**
 * ClassName： GuessNumGame
 * package：hw3
 * Description：
 * 題目：0~100猜數遊戲
 * @Author 任少騫
 * @Create 2024/4/29 @{TIME}
 * @Version 1.0
 */
public class GuessNumGame {
    Scanner sc = new Scanner(System.in);
    int random;

    public GuessNumGame(){
        random = (int) (Math.random() * 101);
        System.out.println("這是一個猜數字的遊戲");
        System.out.println("範圍是 0 ~ 100");
        System.out.println("輸入任意鍵開始遊戲");
        String z = sc.nextLine();
        infinuteLoop();
        sc.close();
    }

    public void infinuteLoop(){
        int i = 1;

        for (;;){
            System.out.println("第" + i++ + "次作答，請輸入：_");
            int target = sc.nextInt();
            if (target == random){
                System.out.println("答對了！答案就是" + random + "總共猜了" + i + "次");
                if(i < 5){
                    System.out.println("太神了！");
                    break;
                }else if (i < 10){
                    System.out.println("還行吧！");
                    break;
                }else{
                    System.out.println("回家在練練吧！");
                }
                break;
            }else if(target > random){
                System.out.println("太大囉！");
            }else{
                System.out.println("太小囉！");
            }
        }
        sc.close();
    }

}
