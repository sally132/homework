package f;

public class _230420C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(1, 2);
		System.out.println(result);
		
		//함수 호출
		result = minus(5, 4);
		result = minus(3, 1);
		minus(2,1);

		result = multiply(3,4);//곱하기 함수 호출//3과 4는 매개변수.
		float result_float = divide(3.14f, 2);
		System.out.println(result_float);
		//꼭 불러줘야 함.
	}
	static void iotPrint(Object obj)
	{
		System.out.println(obj);
	}
	static int multiply(int a, int b)//a와 b는 파라미터
	{
		int c = a*b;
		iotPrint(c);//int
		return c;
	}
	static int sum(int a, int b)//함수 정의 
	{
		int c = 0;
		c = a+b;
		int d = minus(a,b);//sum함수에서도 다른 함수를 부를 수 있다.
		iotPrint(d);//int
		return c;
	}
	static int minus(int a, int b)//함수 정의
	{
		int c= a-b;
		iotPrint(c);
		return c;
	}
	
	
	static float divide(float a, int b)//함수 정의
	{
		float c = a/b;
		iotPrint(c);//float
		return c;
		
	}
	//multiply()함수 정의.
	
	//iotPrint() 함수 정의
}
