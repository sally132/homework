package f;
import java.util.Scanner;
public class _230420A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			sc.next();
			
			int [][] arr= null;
			arr= new int[5][];
			
			
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = new int[5];
				for(int j=0; j<arr[i].length; j++)
				{
					arr[i][j] = v++;
					
				}
				arrPrint(arr);//함수 호출
			}
			
			
			static void arrPrint(int[][] arr)//함수정의
			{
				for(int i=0; i<5; i++)
				{
					for(int j=0; j<5; j++)
					{
						System.out.println(arr[i][j]+"\t")
						
					}
					System.out.println();
				}
				
			}
			//왜... 빨간줄이...
	}//돌려주는 게 없는 void type. 이 코드도 함수임.

}
