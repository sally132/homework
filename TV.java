package h;

public class TV {
	//Tv의 속성(멤버변수)
	String color; //"4K" "UHD" "8K"//TV해상도
	boolean power; //전원상태(on/off)
	int channel; //채널
	
	void setColor(String c) {

		color = c;
	}
	
	String getColor() {
		return color;
	}
	void setPower(boolean p) {
		power = p;
	}
	boolean getPower() {
		return power;
	}
	void setChannel(int i) {
		channel = i;	
	}
	int getChannel() {
		return channel;
	}
	
	
	
	//tv의 기능(메서드)
	void power() {
		power = !power;//power를 틀으면 power가 아니게 되는 것. 반대의 값으로 만들어줌
	} //TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {
		++channel;
	}//TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() {
		--channel;
	}//TV의 채널을 낮추는 기능을 하는 메서드
}
