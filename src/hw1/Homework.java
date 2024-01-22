package hw1;

public class Homework {
	public static void main(String[] args){
//	請設計一隻Java程式，計算12，6這兩個數值的和與積
	  int ans1 = (8+6);
	  int ans2 = (8*6);
		System.out.println("ans1:" +  "和:" + ans1 + " 積:" + ans2);
		
//	請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	  int ans3 = (200/12);
	  int ans3_1 = (200%12);
	  System.out.println("ans2:" + ans3 + "打" + ans3_1 + "顆");
	  
//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	  int q = 256559;
	  int day = q/(3600*24);
	  int hour = q%(3600*24)/3600;
	  int min = q%(3600*24)%3600/60;
	  int sec = q%(3600*24)%3600%60;
	  System.out.println("ans3:" + day + "天" + hour + "小時" + min + "分" + sec + "秒");
	  
//	  請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	  double pi = 3.1415;
	  double area = (5*5)*pi;
	  double length = 5*2*pi;
	  System.out.printf("ans4:" + "圓面積" + "%.3f ",area);
	  System.out.printf("圓周長" + "%.3f%n",length);
  
//	  某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//	  金加利息共有多少錢 (用複利計算，公式請自行google)
	  int deposit = 1500000;
	  double interest = Math.pow((1+0.02),9);  
	  double newDeposit = 1500000*interest;
	  System.out.println("ans5:" + (int)newDeposit);
	  
//	  請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
	  
	  int fst = 5 + 5;	
	  //整數的運算相加
	  char a = '5';
	  int b = a;
	  int snd = 5 + a;
	  // unicode'5' 整數為53 相加後為58 
	  String num = "5";
	  String  thrd = (5 + num) ;
//	  字串相加
	  System.out.println("ans6:" + "fst:" + fst + "  snd:" + snd + "  thrd:" + thrd);
	  System.out.println("整數'5'= " + b);
	  
	  
	  
	  
	  

	  
		
	
}
}
