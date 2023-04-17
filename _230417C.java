package C;
import java.util.Scanner;

public class _230417C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=0;
			float[] f = new float[3];
			float[] f2 = f;//위치를 지정
			f[0] = 3.14f;
			f[1] = 2.34f;
			f[2] = 5.0f;
			System.out.println(f[2]);//9.08
			System.out.println(f2[2]);//9.08
			
			Scanner sc = new Scanner(System.in);//new를 썼으니 힙영역에.
			int[] data = new int[5];
			
			
			for(int i=0; i<=4; i++) {
				int bi = sc.nextInt();//정수값
			
				data[i]= bi;
				System.out.println(data[i]);
			}
			
		
			
			
	}

}
