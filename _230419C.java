package e;

public class _230419C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] matrix = new int[3][];
			int i=0, j=0, k=0; 
			
			matrix[0] = new int [4];
			matrix[0][0]=1;
			matrix[0][1]=2;
			matrix[0][2]=3;
			matrix[0][3]=4;
			
			matrix[1]=new int[2];
			matrix[1][0]=5;
			matrix[1][1]= 6;
			
			matrix[2] = new int[3];
			matrix[2][0] =7;
			matrix[2][1] = 8;
			matrix[2][2] = 9;
			
			for(i=0; i<3; i++)
			{
				for(j=0; j<matrix[i].length; j++)
				{//0, 1, 2 matrix[0, 1, 2].length=> 4, 2, 3
					System.out.print(matrix[i][j]+"\t");
					
					
				}
				System.out.println();
				
			}
	}

}
