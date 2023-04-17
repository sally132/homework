package B;

public class _230417A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int []  {1, 2, 3};
		int [] a2 = new int[4];
		a2[0]=a[0];
		a2[1] = a[1];
		a2[2] = a[2];
		a2[3] = 4; //새로넣음
		int [] a3 = a2;
		a3[0] = 5;
		System.out.println(a3[0]);//5;
		System.out.println(a2[0]);//1; 라고 생각했는데 5라는듯
	}

}
