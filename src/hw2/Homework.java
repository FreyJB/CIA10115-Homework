package hw2;

public class Homework {
	public static void main(String[] args) {
//	1.請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)

//		int sum = 0;
//		for (int num = 0; num <= 1000; num++) {
//			if (num % 2 == 0) {
//				sum += num;
//			}
//		}
//		System.out.print(sum);
//	}
//}
//	2.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
//		int sum = 1;
//		for (int count = 1; count <= 10; count++) {
//			sum *= count;
//		}
//		System.out.println(sum);
//	}
//}
//	3.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
//		int sum = 1;
//		int count = 1;
//		
//		while (count < 10) {
//			count++;
//			sum *= count;
//		}
//		System.out.println(sum);
//	}
//}

//	4.請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
//		int sum = 0;
//		for (int num = 1; sum < 100; num = num + 2) {
//			sum = sum + num;
//			System.out.print(sum + " ");
//		}
//	}
//}

//	5.阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//	  輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
//
		int ans = 1;
		for (ans = 1; ans < 40; ans++) {
			for (int a = 4; a < 40; a = a + 10)
				if (ans == a)
					continue;

			int count = 0;
			for (ans = 1; ans < 40; ans++) {
				if (ans % 10 == 4)
					continue;
				count++;
				System.out.print(ans + " ");
			}

			System.out.println("\n" + count);
		}
	}
}
//	6.請設計一隻Java程式，輸出結果為以下：
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1

//		for (int a = 10; a >= 1; a--) {
//			for (int b = 1; b <= a; b++) {
//				System.out.print(b + " ");
//			}
//			System.out.println();
//		}
//	}
//}

//	7.請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
//
//		int a = (int) 'A';
//		System.out.println(a);
//		for (int i = 1; i <= 6; i++) {
//			for (int b = 1; b <= i; b++) {
//				System.out.print((char) a);
//			}
//			a++;
//			System.out.println();
//		}
//	}
//}