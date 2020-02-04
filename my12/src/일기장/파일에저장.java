package 일기장;

import java.io.FileWriter;
import java.io.IOException;

public class 파일에저장 {

	public static void main(String[] args) throws Exception {
		
		// 파일을 인식 + 파일에 저장
		// - 에러가 발생할 수 있는 가능성이 큼
		// - 에러가 발생했을 때 어떻게 처리할 지 입력
		
		// 1. 파일에 저장, 읽어오는 경우
		// 2. 채팅 프로그램 만드는 경우
		// - 네트워크로 연결하는 경우
		// 3. DB 프로그램을 사용하는 경우
		
		FileWriter file = new FileWriter("20200121.txt");
		
		file.write("HELLO" + "\n");
		file.write("HI" + "\n");
		file.close();
		
		
		
		
	}

}
