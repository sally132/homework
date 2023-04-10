
public class _230411_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지 홀수의 합 구하기. /홀수를 구하기도 하기
		//내 답
		/*int hab=0;
		for(int a=1; a<101; a++) {
			if(a%2==1) {
				hab = hab+a;
				System.out.print(a+"\t");
				
			
			}
			
		}
		System.out.println("홀수의 합"+hab);
		*/
		//교수님
		int sum = 0;
		for (int i=1; i<100; i++) {//i=1
			if(i%2==1) {//1%2=1//2%2=0//3%2=1
				sum = sum + i;//sum=0+1 //sum=1+3
				System.out.print(i+"\t");
				
				if(i%10==9) {
					System.out.println();
					
				}
			}			
			/*if(i%10==0) {//i==10, i==20, i==30
				System.out.println();
			}*/
			
			
			
			
		}
	}

}
