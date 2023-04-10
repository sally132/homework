//pacakage~
import java.util.Scanner;

//항상 입력 받을 때 이걸 해야 함.
public class _230411_D {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc1 = new Scanner(System.in);
		
		Scanner three = new Scanner(System.in);
		int a=three.nextInt();//three를 인티저로 바꾸어야.
		for(int i=1; i<10; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
			
		}
		Scanner five = new Scanner(System.in);
		int b=five.nextInt();
		for(int c=1; c<10; c++) {
			System.out.println(b+"*"+b+"="+(b*c));
			
		}
	}

}
