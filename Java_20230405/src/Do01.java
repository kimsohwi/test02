import java.util.Scanner;

public class Do01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 초를 입력하세요 : ");
		int num = sc.nextInt();
		
		int second = num%60;
		int hour = num/3600;
		int minute = (num%3600)/60;

		System.out.println(hour+"시"+minute+"분"+second+"초");
	}