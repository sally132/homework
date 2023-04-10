
public class _230411_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//바깥 쪽에는 단, 안쪽에는 곱하는 수. (ex. a*b 일때 b)
		//2단-9단까지 구구단 출력
		
		/*int dan;
		int su;
		for(dan = 2; dan<=9; dan++) {//2.
			System.out.println(dan+"단");
			for(su = 1; su<=9; su++) {
				System.out.println(dan+"*"+su+"="+(dan*su));//2*1=2//
				
			}
			
			System.out.println();
		}*/
		
		//교수님
		int i = 0, j = 0 ;
		for(i=1; i<10; i++) {
			for (j=2; j<10; j++) {
				System.out.print(j+"X"+i+"="+i*j+"\t");
				//2*1/2*2/2*3
			}
			System.out.println();
			//2*1/3*1/4*1/5*1
			//1*2/3*1/4*1
		}
		
	}

}
