package 생성자;

public class DB연결 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// DB에 데이터를 넣으려면
		// 자바에서 sql문을 만든 다음
		// mySQL 프로그램으로 sql문을 네트워크 전송해야 함
		// 자바 안에 sql문이 들어가야 함
		
		// 회원가입 insert
		// 회원탈퇴 delete
		// 회원정보수정 update
		// 회원검색 select
		
		// JAVA 화면 ----- SQL -----> mySQL
		
		// 1. 커넥터 설정 OK
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1. 커넥터 설정 성공");
		
		

	}

}
