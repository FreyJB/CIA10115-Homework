package hw2;

public class TestNineNine {

	public static void main(String[] args) {
//	• 一：使用for迴圈 + while迴圈
//
//		int i ,j;
//		for (i = 1; i <= 9; i++) {
//			j = 0;
//			while (j < 9) {
//				j++;
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			}
//			s
//		}
//	}
//}
//		• 二：使用for迴圈 + do while迴圈
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			j = 0;
//			do {
//				j++;
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			} while (j < 9);
//			System.out.println();
//		}
//	}
//}

//		• 三：使用while迴圈 + do while迴圈
		int i = 0, j = 0;
		while (i < 9) {
			j = 0;
			i++;
			do {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			} while (j < 9);
			System.out.println();
		}
	}
}