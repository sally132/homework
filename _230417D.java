package d;
import java.util.Scanner;
public class _230417D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int[] array = new int[5];
			//
			//int의 배열은 레퍼런스 타입이다.
			//array[0], array[1], array[2], array[3], array[4]
			//int a, b, c, d, e;
			array[0] = sc.nextInt();
			array[1] = sc.nextInt();
			array[2] = sc.nextInt();
			array[3] = sc.nextInt();
			
			int[] b = new int[5];//b[0] b[1] b[2] b[3] b[4]와 같다.
			b[0] = sc.nextInt();
			b[1] = sc.nextInt();
			b[2] = sc.nextInt();
			b[3] = sc.nextInt();
			b[4] = sc.nextInt();
			
			for(int i=0; i<5; i++) 
			{
				
				b[i] = sc.nextInt();
				System.out.println(b[i]);
				
			}
			
			//첨자는 [첨자] 인듯
			int a = 0;
			a = sc.nextInt();
			System.out.println(a);
			
			char[] ch = new char[3];//character를 3개짜리
			//ch.. 참조변수. 101동 101호
			//'A', 'B', 'C'
			//ch[0], ch[1], ch[2]
			
			ch[0] = 'A';
			ch[1] = 'B';
			ch[2] = 'C';
			char data = 'A';
			
			//ch[3]은 없음.
			
			for(int i =0; i<3; i++)
			{
				ch[i] = data++;
				ch[i] = data;//넣어주고 증가함
				data++;
				System.out.println(ch[i]);
				
			}
			
			
			
			
	}

}
