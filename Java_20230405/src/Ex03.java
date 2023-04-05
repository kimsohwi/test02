import java.util.zip.CheckedInputStream;

public class Ex03 {

	public static void main(String[] args) {
		 boolean power = true; // true, false
		 
		 if(power) // ()안 내용이 참이면 10줄 실행, ()안 내용이 거짓이면 12줄 실행
			 System.out.println("power는 true");
		 else
			 System.out.println("power는 false");
		 
		System.out.println('\'');
		System.out.println("abc\t123\b456");
		System.out.println('\n');
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
		
		int re = 10;
		double es = 1000;
		float rt = 500;
		char ch = 'I';
		String name = ("Java");
		
		System.out.println(name+ch);
		System.out.println(re-es);
		System.out.println(re*es);
		System.out.println(re+rt);
		
		
		
		
	}

}
