package ch2;

public class Hello01 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("x;" + x);    //ctrl+alt+아래방향키
		System.out.println("y;" + y);    //ctrl+alt+아래방향키
        System.out.println("--------------");
        
        int tmp = x;
        x=y;
        y=tmp;
		
        System.out.println("x;" + x);    //
        System.out.println("y;" + y);    
        System.out.println("tmp:" + tmp);   
        
	}}