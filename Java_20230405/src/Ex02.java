
public class Ex02 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 2;
		int tmp = 3;
	
    //  num=num+1; , num+=1;
	//	num++; , ++num;
		
		num = ++num;
		tmp = num++;
		sum = ++tmp;
		
		num = --num;
		sum = num--;
		
		System.out.println(num);
		System.out.println(sum);
		System.out.println(tmp);
		System.out.println("sum : "+tmp);
	}

}
