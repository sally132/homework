package h;

public class NewStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewStudent n = new NewStudent();
		n.setName("고길동");
		n.setBan(4);
		n.setNo(21);
		n.setMusic(100);
		n.setMath(10);
	
		//객체배열 3개짜리 선언. 임의의 값 할당;

		NewStudent n2 = new NewStudent();
		n2.setName("김민지");
		n2.setBan(4);
		n2.setNo(23);
		n2.setMusic(50);
		n2.setMath(30);
		
		NewStudent n3 = new NewStudent();
		n3.setName("하니");
		n3.setBan(8);
		n3.setNo(1);
		n3.setMusic(70);
		n3.setMath(100);;
		
		NewStudent n4 = new NewStudent();
		n4.setName("해린");
		n4.setBan(2);
		n4.setNo(3);
		n4.setMusic(80);
		n4.setMath(90);
	}
	

}
class NewStudent{
	String name;
	int ban;
	int no;
	int music;
	int math;
	
	
	void setName(String _name) {
		name = _name;
		
	}
	//겟, 셋 만들어야 함.
	String getName(){
		return name;
	}
	
	void setBan(int _ban) {
		ban = _ban;
	}
	int getBan() {
		return ban;
		
	}
	
	void setNo(int _no) {
		no = _no;
	}
	int getNo() {
		return no;
	}
	
	void setMusic(int _music) {
		music = _music;
	}
	int getMusic() {
		return music;
	}
	void setMath(int _math) {
		math = _math;
	}
	int getMaht() {
		return math;
	}
	
	
	
	
	
	
	
	
	
	
}
