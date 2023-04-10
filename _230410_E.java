
public class _230410_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0, j = 0;
		
		for(i=0; i<2; i++) {//i=0, i=1 1<2 i=2 2<2
			for(j=0; j<3; j++) {//j=0, 0<3//j=1 1<3//j=2, 2<3
						//j=3 3<3
					System.out.print(i+"/"+j);//0/0 //0/1 //0/2
										//1/3 1/1  1/2 _
			}							//_
			System.out.println();
		}
	}

}
