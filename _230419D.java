package e;

public class _230419D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1이 25개 나오게.
		int [] [] number = new int[5][5];//0,1,2,3,4,
		/*int a, b;
		for(a=0; a<number.length; a++) 
		{
			for(b=0; b<number[a].length; b++)
			{
				number[a][b] = 1;
				System.out.print(number[a][b]+"\t");
			}
			System.out.println();
			
		}
		System.out.println();
		*/
		
		//1 2... 25
				int [][] five = new int[5][5];
				int c, d;
				int sum = 0;
				
				for(c=0; c<5; c++) 
				{
					for(d=0; d<5; d++) 
					{
						sum = sum + 1;//12

						five[c][d] = sum;//[0][0]에 1.
						System.out.print(five[c][d]+"\t");
					}
					System.out.println();
				}
				System.out.println();
	
				
				int [][] three = new int[5][5];
				int e, f, sum2;
				sum2 = 1;
				for(e=0; e<5; e++) 
				{
					for(f=0; f<5; f++)
					{
						three[e][f] = sum2;
						sum2 = sum2+3;
						
						System.out.print(three[e][f]+"\t");
						
					}
					System.out.println();;
					
				}
				System.out.println();
	
				
				int [][] two = new int[5][5];
				int g, h, sum3;
				sum3=1;
				for(g=0; g<5; g++)
				{
					for(h=0; h<5; h++)
					{
						two[g][h] = sum3;
						sum3=sum3+2;
						System.out.print(two[g][h]+"\t");
						
					}
					System.out.println();
					
				}
				System.out.println();
				
				int[][] onetwo = new int[5][5];
				int a1, a2, b2, c2;
				a1=1;
	
				for(b2=0; b2<5; b2++)
				{
					for(c2=0; c2<5; c2++)
					{
							
						a1 = a1+1;
							onetwo[b2][c2] =a1;
							
															
							System.out.print(onetwo[b2][c2]+"\t");
						
						
					}
					System.out.println();
				}
				
				
				
				
				
				
				
						
						
						
						
						
						
						
						
						
						
						
				
				
				
				
				
				
	
	
	}

	
		

	
	
}
