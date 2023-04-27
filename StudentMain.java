package S;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "장동건";
		s.korean = 90;
		s.english = 80;
		s.math = 100;
		/*s.hap(80,90,100);*/
		s.hap();
		s.avg();
		
		Student star2 = new Student();
		star2.name = "현빈";
		star2.english = 80;
		star2.math = 70;
		star2.total = 240;
		star2.hap();
		star2.avg();
		
		
		Student star3 = new Student();
		star3.name = "아이유";
		star3.korean = 100;
		star3.english = 100;
		star3.math = 100;
		star3.hap();
		star3.avg();
		
		/*for(int i=1; i<4; i++) {
			System.out.println("Student"+"star['"+i+"]'"+"new Student();");
			if(i==1) {
				
				
			}
			for(int j=1; j<7; j++) {
				System.out.println("star[")
				
			}
			
		}
	}*/

}
}


class Student{
	String name;
	int korean;
	int english;
	int math;
	//int total = korean + english + math ;
	int total;
	float avg = total/3;
	
	/*int hap(int korean, int english, int math){
		return korean + english + math;
	}*/
	void hap (){
		 total = korean + english + math;
		 System.out.println(total);
	}
	void avg() {
			hap();
			avg = total/3.0f;
			print(avg+"");
		}
	void print(String str){
		System.out.println(str);
			
		}

	}

