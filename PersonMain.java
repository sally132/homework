package S;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setHeight(150);//직접적으로 p.height = 값; 이렇게 넣는 것은 지양한다.
		p.setWeight(45);
		p.setBmi();
	
		System.out.println(p.getBmi());
		//height의 값을 출력하시오
		//weight의 값을 출력하시오
		
		p.getHeight();//위의 문제 답
		p.getWeight();
		System.out.println(p.getHeight());
		System.out.println(p.getWeight());
		//★셋은 설정, 겟은 가져오는 것
	}

}

class Person{
	int height;//멤버변수 height//set, get이 필요함.
	int weight;//멤버변수 weight//읽어오는 경우는 get/set, get
	float bmi;//멤버변수 bmi//set, get 
	
	void setHeight(int h) {
		//전달 받은 값을 멤버 변수에 할당.
		if(h > 0) {
			height = h;			
		}
	}//height멤버변수의 setter
	int getHeight(){
		return height;
	}//height멤버변수 getter
	
	void setWeight(int w) {		
		weight = w;//return 해주는 거 없음. weight에 세팅만 하는 것. 그래서 void됨.
	} 
	int getWeight() {
		return weight;
	}
	
	void setBmi() {
		//setBmi() 호출하기 전에 height, weight 의 값이 할당되어 있어야 함
		bmi =weight/(float)((height*0.01)*(height*0.01)); //체중/키*키(m)
		System.out.println(bmi);
	}
	float getBmi() {
		return bmi;
	}
}