
public class Ex01 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score = 10;
		
		d= score;
     // d= (double) score;
		
		System.out.println(d);
		d = 85.4;
		
		score = (int)d;
		System.out.println(score);
		
		int sum = 4895;
		long longsum = 11110000000l;
		
		longsum = sum;
		
		longsum = 123;
		sum = 574;
		
		System.out.println(sum+longsum);
		System.out.println(sum-longsum);
		System.out.println(longsum-sum);
		
		System.out.println(6/5.0);   // =(double)
		
		System.out.println(385%12);
		System.out.println(385<12);
		System.out.println(385>12);
		System.out.println(10>>100+10);
	}

}
