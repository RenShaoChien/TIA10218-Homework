package hw4;

import java.util.Scanner;

/**
 * ClassName： HomeWorkString package：hw4 Description：
 *
 * @Author 任少騫
 * @Create 2024/5/1 @{TIME}
 * @Version 1.0
 */
public class HomeWorkString {
	Scanner sc = new Scanner(System.in);
	String str;
	char[] c;

	public HomeWorkString() {
		System.out.print("請輸入想要反轉的內容：");
		str = new String(sc.nextLine());
		creatCharArr();
		orderReversal(c);
		printArray(c);
		sc.close();
	}

	/**
	 * 此方法為字串轉換成char[]，使用String類裡的toCharArray()
	 * 
	 * @return char[]，元素為字符串
	 */
	public char[] creatCharArr() {
//        c = new char[str.length()];
		c = str.toCharArray();
		return c;
	}

	/**
	 * 此方法為char陣列的順序反轉
	 * 
	 * @param c 要反轉的陣列
	 * @return 反轉後的陣列
	 */
	public char[] orderReversal(char[] c) {
		for (int i = 0, j = c.length - 1; i < j; i++, j--) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
		}
		this.c = c;
		return this.c;
	}

	public void printArray(char[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

	public static void main(String[] args) {
		HomeWorkString str = new HomeWorkString();
	}

}
