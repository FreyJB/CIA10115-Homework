package hw3;

import java.util.Scanner;

public class homework {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
//	(提示:Scanner,三角形成立條件,判斷式if else)
//	(進階功能:加入直角三角形的判斷)
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入:");
//		int a = sc.nextInt();
//		System.out.println("請輸入:");
//		int b = sc.nextInt();
//		System.out.println("請輸入:");
//		int c = sc.nextInt();
//		int a1 = a * a;
//		int b1 = b * b;
//		int c1 = c * c;
//		
//		if (a + b <= c || a + c <= b || b + c <= a) {
//			System.out.println("不是三角形");
//		} else if (a == b && a == c && c == b) {
//			System.out.println("正三角形");
//		} else if (a == b || a == c || b == c) {
//			System.out.println("等腰三角形");
//		} else if (a1 + b1 == c1 || a1 + c1 == b1 || b1 + c1 == a1) {
//			System.out.println("直角三角形");
//		} else {
//			System.out.println("其他三角形");
//		}
//	}
//}
//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
//	(提示:Scanner,亂數方法,無窮迴圈)
//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int i;
//		int a;
//		a = (int) (Math.random() * 9) + 1;
//		System.out.println("請輸入數字0~9");
//		while (true) {
//			i = sc.nextInt();
//			if (i == a) {
//				System.out.println("正確訊息");
//				break;
//			} else {
//				System.out.println("錯誤訊息");
//			}
//		
//	------------------------------------------
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a;
//		int i;
//		a = (int) (Math.random() * 100) + 1;
//		System.out.println("請輸入數字0~100");
//
//		while (true) {
//			i = sc.nextInt();
//			if (i == a) {
//				System.out.println("正確答案");
//				break;
//			} else if (i > a)
//				System.out.println("大於正確答案");
//			else if (i < a)
//				System.out.println("小於正確答案");
//		}
//	}
//}
//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字1~9:");
		int ans = sc.nextInt();
		while (ans <= 0 || ans >= 10) {
			System.out.println("請輸入數字1~9:");
			ans = sc.nextInt();	
		}
		int count = 0;
		int[] arr = new int[6];
		for (int a = 0; a < 50; a++)
			if (a == ans) {
				continue;
			} else if (a % 10 == ans) {
				continue;
			} else {
				count++;
				System.out.print(a + " ");
			}
		System.out.println("\n" + count);
		
	for (int i = 0; i < arr.length; i++) {
		arr[i] = (int) (Math.random() * 49) + 1;
		if (arr[i] % 10 == ans || arr[i] / 10 == ans) {    //如果跟不想要的數相同 則-1做抵銷 把六個數帶入陣列
			i--;
		}
	}
	System.out.println("印出不要號碼外的隨機6個號碼:");
	for (int i = 0; i < arr.length; i++) {	 	 		  
		System.out.print(arr[i] + " ");
		}
	}
}