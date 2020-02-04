package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. 커넥터 설정
		// 2. DB연결
		// 3. SQL문 만들기
		// 4. SQL문을 mySQL 프로그램에 전송
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1. 커넥터 설정 성공 --------------");
		
		String url = "jdbc:mysql://localhost:3309/shoes";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println("2. DB연결 성공 -----------------");
		
		String sql = "insert into member values ('summer','summer','summer','summer')";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		System.out.println("3. SQL문 만들기 성공 -------------");
		
		ps.executeUpdate();
		
		System.out.println("4. SQL문 전송 성공 --------------");
		
	}

}
