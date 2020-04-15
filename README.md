package jp.winschool.java.chapter6;

public class Sample6_04 {

	public static void main(String[] args) {
		/*
		 * 九九の表をつくる
		 */
		 
		int a=1;
		int b=1;
		
		for(a=1; a<10; a++ ){
			for( b=1; b<10; b++) {
				System.out.print(a+"×"+b+"="+a*b+"\t");
			}
			System.out.print("\n");
		}
		

	}

}

