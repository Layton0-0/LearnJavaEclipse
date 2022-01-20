package studySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	// 커넥션 전용 메소드 작성
	public Connection getConnection() {
		Connection con = null;
		// 서버 접속에 필요한 정보
		String url = "jdbc:mysql://localhost:3306/shopdb";
		// 접속한 뒤에 작업을 하기 위해 필요한 라이브러리 클래스
		String driver = "com.mysql.jdbc.Driver";
		// 아이디
		String id = "root";
		// 비밀번호
		String pwd = "mcys1309";

		// 데이터 베이스 작업을 하거나 데이터와 해당 클래스와의 연결고리를 만들어주기 위함
		try {
			Class.forName(driver);
			// DriverManager에 들어가는 건 위의 Class.forName(driver)의 결과이다.
			// = 오른쪽에 있는 건 서버에서 일어나는 일.
			con = DriverManager.getConnection(url, id, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (con != null) {
			System.out.println("connected");
		} else {
			System.out.println("fail connection");
		}
		return con;
	}
}
