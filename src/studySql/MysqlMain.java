package studySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlMain {

	public static void main(String[] args) {
		MysqlMain mm = new MysqlMain();
		try {
			mm.test();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertData(GisaDataVO vo) {
		// 이 방법은 가비지를 만들어내서 안 좋은 방법
		// String sql = "insert into gisatbl values(" + vo.getStdNo() + ")";
		
		// 아래가 query를 구성하는 방법.
		// StringBuffer OR StringBuilder 사용
		StringBuffer sb = new StringBuffer();
	}

	// 객체 지향 프로그램이기 때문에 각 객체들 간의 상호작용만 이해, 필요한 정보를 제공해주면 나머지는 객체가 알아서 해줌.
	public void test() throws ClassNotFoundException, SQLException {
		// 서버 접속에 필요한 정보
		String url = "jdbc:mysql://localhost:3306/shopdb";
		// 접속한 뒤에 작업을 하기 위해 필요한 라이브러리 클래스
		String driver = "com.mysql.jdbc.Driver";
		// 아이디
		String id = "root";
		// 비밀번호
		String pwd = "mcys1309";

		// 데이터 베이스 작업을 하거나 데이터와 해당 클래스와의 연결고리를 만들어주기 위함
		Class.forName(driver);
		// DriverManager에 들어가는 건 위의 Class.forName(driver)의 결과이다.
		// = 오른쪽에 있는 건 서버에서 일어나는 일.
		Connection con = DriverManager.getConnection(url, id, pwd);

		if (con != null) {
			System.out.println("connected");
			con.close();
		} else {
			System.out.println("fail connection");
		}
	}

}
