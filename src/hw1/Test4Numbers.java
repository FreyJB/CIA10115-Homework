package hw1;

public class Test4Numbers {
	// 輸出0~100 裡的4的倍數
	public static void main(String[] args) {
		for (int count = 0; count <= 100; count += 4) {
			System.out.println(count);
		}

		for (int num = 0; num <= 100; num++) {
			if (num % 4 == 0)
				System.out.print(num + " ");
		}
	}
}
