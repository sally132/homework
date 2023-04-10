
public class _230411_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//바깥 쪽에는 단, 안쪽에는 곱하는 수. (ex. a*b 일때 b)
		//2단-9단까지 구구단 출력
		
		int dan;
		int su;
		for(dan = 2; dan<=9; dan++) {//2.
			System.out.println(dan+"단");
			for(su = 1; su<=9; su++) {
				System.out.println(dan+"*"+su+"="+(dan*su));//2*1=2//
				
			}
			
			System.out.println();
		}
		
	}

}
