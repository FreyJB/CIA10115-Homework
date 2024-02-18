package hw4;

import java.util.Scanner;

public class HomeworkDate {
//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c = 0;

		while (true) {
			System.out.println("請輸入西元年份:");
			a = sc.nextInt();
			if (a >= 0) {
				break;
			} else {
				System.out.println("請輸入正確的西元年份.");
			}
		}

		while (true) {
			System.out.println("請輸入月份:");
			b = sc.nextInt();
			if (b >= 1 && b <= 12) {
				break;
			} else {
				System.out.println("請輸入正確的月份.");
			}
		}
		while (true) {
			System.out.println("請輸入日期:");
			c = sc.nextInt();
			if (b == 2) {
				boolean Year = ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0));
				if (Year && c >= 1 && c <= 29) {
					break;
				} else if (!Year && c >= 1 && c <= 28) {
					break;
				} else {
					System.out.println("請輸入正確日期.");
				}
			} else if (b == 4 || b == 6 || b == 9 || b == 11) {
				if (c >= 1 && c <= 30) {
					break;
				}
			} else if (c >= 1 && c <= 31) {
				break;
			} else {
				System.out.println("請輸入正確的日期.");
			}
		}

		int sum = 0;
		int[] days = { 1, -2, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1 };
		int mondays = (b - 1) * 30;
		int d = 0;

		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
			mondays += 1;
		}
		for (int i = 0; i < days.length; i++) {
			d += days[i];
		}
		System.out.println("輸入的日期為該年第" + (d + mondays) + "天");
	}
}
