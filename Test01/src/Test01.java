import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		int age = 1000000000; // 정수형 선언함...age변수에는 ~-21억부터 +21억 저장 할 수 있다
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		System.out.println("나이 :" + age);
		System.out.println("프로그램 종료!!");
	}

}
