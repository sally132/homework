package aaa;

import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String no = "123456-7894561";;
		char seoul = no.charAt(7);//8번째. 이거가 원래임
		char seoul2 = no.charAt(8);//9번째 값을 읽어서 seoul변수에 담자.
				//담은 값이 '0'이면 "서울에서 태어남"이라고 출력하고, 아니면 그 외 지역이라 출력하자.
		String temp = no.substring(7, 8);
		int sido = Integer.parseInt(temp);//문자열 "89"가 숫자 89로 변환됨
	
		Scanner sc = new Scanner (System.in);
		sc.next();
		if(0>=sido && 8<=sido) {
			System.out.println("서울에서 태어남");
		
		}
		
	
	}

}
