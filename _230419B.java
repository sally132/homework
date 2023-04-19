package e;

public class _230419B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i, j;
		int[][] arr = new int[2][3];
		for(i=0; i<2; i++)
		{
			for (j=0; j<3; j++)
			{
				arr[i][j] = i*3+j+1;
			}
			
		}
		for(i=0; i<2; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			}
			
		}
	}*/
	
	//교수님 거 
	int v= 1;
	int[][] arr = null;
	arr= new int[2][];
	
	//배열에 값 할당 
	for(int i =0; i<arr.length; i++)//1
	{
		arr[i] = new int [3];//arr[0]=new int [3]
		for(int j =0; j<arr[i].length; i++)
		{//arr[0].length=>3
			//arr[0].length=>3 1<3
			arr[i][j] = v++;
		}
	}
	//값 출력
	for(int i = 0; i<2; i++)//2
		{
			for(int j=0; j <arr.length; j++)//3
			{
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
}
