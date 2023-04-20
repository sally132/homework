package f;

public class _230420D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][] arr = new int[5][5];//힙, 잘 관리되는 펜션, int초기값 0으로 
			int v = 0;
			for(int i = 0; i<5; i++) 
			{
				v=0;
				for(int j= i; j<5; j++)
				{
					v= v+1;///1, 2, 6.
					arr[i][j] = v++;
				}
			}
			print(arr);

			for(int i=0; i<5; i++)
			{
				for(int j= 0; j<5; j++)
				{
					System.out.println(arr[i][j]+"\t");
				}
				System.out.println();
			}
			return arr;
	}

}
