package h;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t = new TV();
		//똑같은 패키지의 TV클래스를 찾음.
		//패키지는 폴더의 개념.
		//딴 곳에 있으면 패키지이름.클래스 라고 하면 찾음. EX) my_class.TV t  = new my_class.TV처럼
		//import my_class.TV; 해도 됨
		t.setChannel(7);
		
		t.channelUp();//8
		System.out.println(t.getChannel());//8
		
		TV t2 = null;//4byte. new TV();
		t2 = t;//기존의 t에 탑승하게 됨
		t2.channelUp();//9
		System.out.println(t2.getChannel());//9
		
		t.channelUp();//10
	
		System.out.println(t.getChannel());//10
		//0x100이란? 0x200이란? 101ㅅ호 201호 같은 거낙?
		//ㄴ16진수얘기. 공 엑스 백이라고 읽음.

		TV tv1 = new TV();
		TV tv2 = new TV();
		TV tv3 = new TV();
		TV tv4 = new TV();
		TV tv5 = new TV();
		TV tv6 = new TV();
		TV tv7 = new TV();
		TV tv8 = new TV();
		TV tv9 = new TV();
		TV tv10 = new TV();
		TV tv11 = new TV();
		TV tv12 = new TV();
		
		TV[] t10 = new TV[3];
		t10[0] = new TV();//
		t10[1] = new TV();//
		t10[2] = new TV();//위와 같이 다 메모리 할당 해줘야 함.
	}

}
