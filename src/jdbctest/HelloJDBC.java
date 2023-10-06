package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloJDBC {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
                                                  //本機+埠號3306/schema名稱?/時區
	public static final String USER = "root"; //mySQL的帳號
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String PASSWORD = "cha10312"; //mySQL的密碼
	public static void main(String[] args) {
		//宣告在外面的使用完要記得關閉
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的部門編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的部門名稱");
		String dname = sc.next();
		System.out.println("要新增的部門所在地");
		String loc = sc.next();
		
		sc.close();
		
		PreparedStatement pstmt = null;

		
		
		try {
			//step1: 載入驅動
			Class.forName(DRIVER);
			System.out.println("載入成功");
			
			//step2: 建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");
			
			//step3: 送出SQL指令,只有values可以暫時用?代替
			pstmt =con.prepareStatement("insert into department values (?, ?, ?)");
			
			pstmt.setInt(1, deptno); //(索引值, 內容)把上面內容的?補上
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);;
			
			pstmt.executeUpdate();
			
//			stmt = con.createStatement();
//			//("裡面是字串,內容是新增的SQL指令")
//			int count = stmt.executeUpdate("insert into department values (50, '人事部', '中壢')");
//			System.out.println(count +"row(s) updated." );
			
//			stmt = con.createStatement(); //statement
//			//回傳查詢結果
//			                           //select 欄位1, 欄位2 必須跟底下get方法順序對應的上
//			rs = stmt.executeQuery("select * from department order by deptno");
//			while(rs.next()) {
//				int deptno = rs.getInt("deptno"); //rs.getInt(1) **索引值從1開始!
//				String dname = rs.getString("dname"); //rs.getString(2)
//				String loc = rs.getString("loc"); //rs.getString(3);
//				
//				System.out.println("DEPTNO = " + deptno);
//				System.out.println("DNAME = " + dname);
//				System.out.println("LOC = " + loc);
//				System.out.println("================");
//			}
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch (SQLException se) {
			se.printStackTrace();
			
		}finally {
			if(rs != null) { //如果有連線成功才要關閉, 沒連線成功, 連線結果是null, 會無法執行關閉
				try {
					rs.close();
				}catch (SQLException se) {
					se.printStackTrace();
				}
			}
			if(pstmt != null) { //如果有連線成功才要關閉, 沒連線成功, 連線結果是null, 會無法執行關閉
				try {
					pstmt.close();
				}catch (SQLException se) {
					se.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
		}	
	}

}
