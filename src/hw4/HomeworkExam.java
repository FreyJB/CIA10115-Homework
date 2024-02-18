package hw4;

public class HomeworkExam {
//	班上有8位同學,他們進行了6次考試結果如下:
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)

	public static void main(String[] args) {
		int[][] score = { 
				{ 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 }, 
				{ 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] count = new int[8];
		int student = 0;

		for (int s = 0; s < score.length; s++) {
			int highest = 0;

			for (int h = 0; h < score[s].length; h++) {
				if (highest < score[s][h]) {
					highest = score[s][h];
					student = h;
				}
			}
			count[student]++;	
		}
		for (int s = 0; s < count.length; s++) {
			System.out.println((s + 1) + "號:" + count[s]);
		}
	}
}
