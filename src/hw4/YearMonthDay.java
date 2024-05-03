package hw4;

import java.util.Scanner;

/**
 * ClassName： YearMonthDay package：hw4 Description：
 *
 * @Author 任少騫
 * @Create 2024/5/1 @{TIME}
 * @Version 1.0
 */
public class YearMonthDay {
	public static void main(String[] args) {
		YearMonthDayUtil ymd = new YearMonthDayUtil();
		ymd.judgeTheNumberOfDays();
	}
}

class YearMonthDayUtil {
	Scanner sc = new Scanner(System.in);
	int year;
	int month;
	int day;

	public YearMonthDayUtil() {
		for (;;) {
			System.out.print("請輸入欲查詢天數的西元年：");
			year = sc.nextInt();
			if (year < 0) {
				System.out.println("輸入年份有誤！");
			} else {
				break;
			}
		}
		for (;;) {
			System.out.print("請輸入欲查詢天數的月份：");
			month = sc.nextInt();
			if (month > 0 && month <= 12) {
				break;
			} else {
				System.out.println("輸入月份有誤！");
			}
		}
		for (;;) {
			System.out.print("請輸入欲查詢天數的日：");
			day = sc.nextInt();
			if (month != 1 && month != 2 && month != 3 && month != 5 && month != 7 && month != 8 && month != 10
					&& month != 12) {
				if (day >= 1 && day <= 30) {
					break;
				} else {
					System.out.println("輸入日有誤！");
				}
			} else if (month != 2 && month != 4 && month != 6 && month != 9 && month != 11) {
				if (day >= 1 && day <= 31) {
					break;
				} else {
					System.out.println("輸入日有誤！");
				}
			} else if (month == 2) {
				if (year % 4 == 0) {
					if (day >= 1 && day <= 29) {
						break;
					} else {
						System.out.println("輸入日有誤！");
					}
				} else {
					if (day >= 1 && day <= 28) {
						break;
					} else {
						System.out.println("輸入日有誤！");
					}
				}
			}
		}

	}

	public void judgeTheNumberOfDays() {
		int days = 0;
		switch (month) {
		case 12:
			days += 30;
		case 11:
			days += 31;
		case 10:
			days += 30;
		case 9:
			days += 31;
		case 8:
			days += 31;
		case 7:
			days += 30;
		case 6:
			days += 31;
		case 5:
			days += 30;
		case 4:
			days += 31;
		case 3:
			if (year % 4 == 0) {
				days += 29;
			} else {
				days += 28;
			}
		case 2:
			days += 31;
		case 1:
			days += day;
		}
		System.out.println("輸入的日期為該年第" + days + "天");
	}
}
