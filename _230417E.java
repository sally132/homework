package d;

public class _230417E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10개 배열
		
		//1, 10, 100, 1000, 10000, 100000...
		//10개 배열에 위의 값을 할당해보자.
		//10개 배열의 값을 출력해보자.
		int data=1;
		
		int [] array = new int[10];
		
		for(int b=0; b<=9; b++) {
			array[b] = data;
			data = data*10; 
			System.out.println(array[b]);			
		}
		
	}

}
