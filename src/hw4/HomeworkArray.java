package hw4;

import java.util.Arrays;

public class HomeworkArray {
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
	public static void main(String[] args) {
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		
		int sum = Arrays.stream(arr).sum();
		int arg = sum / arr.length;
		System.out.println("arg is " + arg);
		for (int a = 0; a < arr.length; a++) {
				if (arr[a] > arg) {
					System.out.print(arr[a] + " ");
			}
		}
	}
}
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
//	public static void main(String[] args) {
//		String[] arr = {"H","e","l","l","o"," ","W","o","r","l","d"};
//		for (int i = arr.length -1 ; i >=  0 ; i--)
//		 System.out.print(arr[i]);
//	}
//}

//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
//	public static void main(String[] args) {
//		int count = 0;
//		String[] arr = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		for (int i = 0; i < arr.length; i++) {
//			for (int a = 0; a < arr[i].length(); a++) {
//				switch (arr[i].charAt(a)) {
//				case 'a':
//					count += 1;
//					break;
//				case 'e':
//					count += 1;
//					break;
//				case 'i':
//					count += 1;
//					break;
//				case 'o':
//					count += 1;
//					break;
//				case 'u':
//					count += 1;
//					break;
//				}
//			}
//		}
//		System.out.println("總共有:" + count + "個");
//	}
//}
