package h;

public class TvTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV[] tvArr = new TV[3];// 길이가 3인 Tv 객체 배열
	
		//TV객체를 생성해서 TV객체 배열의 각 요소에 저장
	
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i] = new TV();
			tvArr[i].channel = i+10;//tvArr[i]의 channel에 i+10을 저장//0- 10 1-11 2- 12
		}
		for(int i=0; i< tvArr.length; i++) {
			tvArr[i].channelUp(); //tvArr[i]의 메서드를 호출. 채널이 1증가.
					//tvarr[0]-11, 1- 12, 2- 13 (맞음)
			System.out.printf("tvArr[%d].channel=%d\n",i,tvArr[i].channel);//%d. printf쓸 때 쓰는 함수. printf("변수표기 부분은 %d, %f, %5")와 같이 써줌. 
			//%d는 10진수. %d의 개수에 따라 뒤의 콤마단어 수가 달라짐.
			
		}//main의 끝
	}

}
