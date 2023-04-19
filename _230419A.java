package e;

public class _230419A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] student =  null;
		student = new int[2][3];//6개//int a=0, b, c, d, e, f;
		
		//student = new int[2][];//2행의 하나당 몇개씩 들어갈지 모를 때
		//student[0]= new int[3];//둘리
		//student[1] = new int[3];//위의 한 줄이 이 세 줄을 의미//또치
		
		//student.length=>2(주의) (행);
		//student[0].length=>3(열);
		//student[1].length=> 3;
		//int[] a = new int[3];
		//a.length =>3
		
		student[0][0] = 90;//둘리의 국어 점수
		student[0][1] = 90;//둘리의 영어점수
		student[0][2] = 90; //둘리의 수학점수
		
		for(int j = 0; j<2; j++)//j=0 0<2  //j=1 1<2;
		{
			for(int i = 0; i<3; i++) //i=0 0<3//i=1 1<3
			{						//i=2 2<3// i=3 3<3
				student[j][i]=90; //s[0][0]=90;//s[0][1]=90;
								//s[0][2]=90;
								//s[1][0]=90; //s[1][1]=90; s[1][2]=90;
			}//열
			
		}//행
	
		
		
		

		for(int i=0; i<3; i++)
		{
			student[1][i]=100;
		}		
		
		
		student[1][0] = 100;//또치의 국어 점수
		student[1][1] = 100;//또치의 영어점수
		student[1][2] = 100; //또치의 수학점수

		int[][] a = null;
		a = new int[3][5];
		
		int[][] b = new int[3][5];
		
		
		for(int i=0; i<3; i++) {//i=0, 0<3
			for(int j=0; j<5; j++) {
				a[i][j] = 100;//j=0, 0<5; a[0][0];//j=1, 1<5, a[0][1]// 
			}
		}
		
		
		
	}

	//3*5배열 (int) 만들어서 100점을 모두 할당해봅시다
	//변수선언 =메모리 할당
	//2중 for문을 돌면서 100을 할당한다.
	
	
	
}
