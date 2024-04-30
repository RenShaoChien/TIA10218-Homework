package hw3;

import java.util.Scanner;

/**
 * ClassName： Lottery
 * package：hw3
 * Description：
 * 題目：大樂透( 1 ~ 49)，讓阿文輸入他不想要的數字 1 ~ 9 ，
 * 並顯示他可以選擇的號碼與總數。
 * @Author 任少騫
 * @Create 2024/4/29 @{TIME}
 * @Version 1.0
 */
public class Lottery {
	int[] lottery = {1,2,3,4,5,6,7,8,9,10,
				            11,12,13,14,15,16,17,18,19,20,
				            21,22,23,24,25,26,27,28,29,30,
				            31,32,33,34,35,36,37,38,39,40,
				            41,42,43,44,45,46,47,48,49};
	int hate;
	int count = 0;
	private int[] temp = new int[49];
	private int[] arr = new int[count];
	
	public Lottery() {
		Scanner sc = new Scanner(System.in);
		System.out.print("阿文哩厚，請輸入你討厭的數字( 0 ~ 9 )：");
		for(;;) {
			hate = sc.nextInt();
			if(hate != 0 && hate != 1 && hate != 2 && hate != 3 && hate != 4 &&
				hate != 5 && hate != 6 && hate != 7 && hate != 8 && hate != 9) {
				System.out.println("輸入的數字有誤，請重新輸入！")	;				
			}else {
				break;
			}
		}
		sc.close();
	}
	
	/**
	 * 此方法為去除帶有hate的樂透號碼，並輸出可以選的號碼數量(count)和遍歷號碼
	 * 並new一個新的矩陣length為count
	 */
	public void removesNumber() {
		if (hate != 0) {
            for (int i = 1; i < 50; i++) {
                if (i / 10 != hate && i % 10 != hate) {
                    temp[count++] = i;
                }
            }
        }else {
            for (int i = 1; i < 50; i++) {
                if (i != 10 && i != 20 && i != 30 && i != 40) {
                    temp[count++] = i;
                }
            }
        }
        System.out.println("你總共有 ：" + count + " 個號碼可以選擇。以下是你可以選擇的號碼：");

        arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n..................................................");

	}
	
	
	public void autoNumberSelection() {
		for (int i = 0; i < count - 6; i++) {
            int target = (int) (Math.random() * (arr.length));
            int[] newArr = new int[arr.length - 1];
            for (int j = 0; j < target; j++) {
                newArr[j] = arr[j];
            }
            for (int j = target; j < arr.length - 1; j++) {
                newArr[j] = arr[j + 1];
            }
            arr = newArr;            
        }        
		System.out.print("此為電腦選號：");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

	}
}
