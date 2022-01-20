package studySql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mc.ys.lesson11.GisaDataVO;

public class MysqlMain {

	public static void main(String[] args) {
		MysqlMain mm = new MysqlMain();

		mm.test1();
//		try {
//			mm.test();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		System.out.println("정상 종료합니다.");
	}

	public void test2() {
		try {
			ArrayList<GisaDataVO> list = this.readyData();
			int[] stdNo = null;
			int i = 0;
			for (GisaDataVO data : list) {
				stdNo[i] = data.getStdNo();
			}
			this.deleteData(new int[] { 990001, 990010 });
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void test1() {
		// 한 줄의 데이터를 생성할 것이다.
		try {
			ArrayList<GisaDataVO> list = this.readyData();
			this.insertData(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 이미 위에서 인스턴스를 형성했기 때문에 this라는 키워드로 인스턴스 사용 가능.
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private ArrayList<GisaDataVO> readyData() throws IOException {
		// 파일의 1000라인의 정보를 GisaDataVO를 이용하여 인스턴스로 만들고 ArrayList에 저장
		String line = null;
		ArrayList<GisaDataVO> allData = new ArrayList<>();
		File file = new File("./data/Abc1115.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while ((line = br.readLine()) != null) {
			int stdNo = Integer.parseInt(line.substring(0, 6));
			String email = line.substring(6, 10);
			int kor = Integer.parseInt(line.substring(10, 13).trim());
			int eng = Integer.parseInt(line.substring(13, 16).trim());
			int math = Integer.parseInt(line.substring(16, 19).trim());
			int sci = Integer.parseInt(line.substring(19, 22).trim());
			int hist = Integer.parseInt(line.substring(22, 25).trim());
			int total = Integer.parseInt(line.substring(25, 28).trim());
			String mgrCode = line.substring(28, 29);
			String accCode = line.substring(29, 30);
			String locCode = line.substring(30);
			allData.add(new GisaDataVO(stdNo, email, kor, eng, math, sci, hist, total, mgrCode, accCode, locCode));
		}

		br.close();
		fr.close();
		return allData;
	}

	public void insertData(ArrayList<GisaDataVO> list) throws SQLException {
		// 이 방법은 가비지를 만들어내서 안 좋은 방법
		// String sql = "insert into gisatbl values(" + vo.getStdNo() + ")";

		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		// 쿼리가 지나가는 통로 만들기
		Statement stmt = con.createStatement(); // new Statement(x)
		// 아래가 긴 query를 구성하는 방법.
		// StringBuffer OR StringBuilder 사용
		for (GisaDataVO vo : list) {
			StringBuffer sql = new StringBuffer("insert into gisaTBL values(");
			sql.append(vo.getStdNo() + ",");
			sql.append("\'" + vo.getEmail() + "\',");
			sql.append(vo.getKor() + ",");
			sql.append(vo.getEng() + ",");
			sql.append(vo.getMath() + ",");
			sql.append(vo.getSci() + ",");
			sql.append(vo.getHist() + ",");
			sql.append(vo.getTotal() + ",");
			sql.append("\'" + vo.getMgrCode() + "\',");
			sql.append("\'" + vo.getAccCode() + "\',");
			sql.append("\'" + vo.getLocCode() + "\'");
			sql.append(");");
			System.out.println(sql.toString());

			// 테이블을 업데이트하는 메소드, 업데이트 된 줄 수가 몇개인지 반환
			// DML: CRUD 명령, DQL: SELECT문
			int affectedCount = stmt.executeUpdate(sql.toString());
			if (affectedCount > 0) {
				System.out.println("삽입 작업 완료");
			} else {
				System.out.println("삽입 작업 실패");
			}
		}
		stmt.close();
		con.close();
	}

	public void deleteData(int[] stdNo) throws SQLException {
		// sql 작성
		StringBuffer sql = new StringBuffer("delete from gisaTBL where stdNo = ");
		sql.append(stdNo[0] + ";");
		// Connection con 취득
		Connection con = new ConnectionManager().getConnection();
		// Statement 생성
		Statement stmt = con.createStatement();

		// 쿼리 전송
		int affectedCount = stmt.executeUpdate(sql.toString());
		// 쿼리 결과 평가
		// 작업 성공 여부 확인
		if (affectedCount > 0) {
			System.out.println("삭제 작업 완료");
		} else {
			System.out.println("삭제 작업 실패");
		}
		// 연결 종료
		stmt.close();
		con.close();
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
