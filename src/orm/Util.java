package orm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//把固定的資料例如常數存在這邊, 方便日後維護
public class Util {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //本機+埠號3306/schema名稱?/時區
    public static final String USER = "root"; //mySQL的帳號
    public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
    public static final String PASSWORD = "cha10312"; //mySQL的密碼
    
	public static void CloseResources(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (rs != null) { // 如果有連線成功才要關閉, 沒連線成功, 連線結果是null, 會無法執行關閉
			try {
				rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		if (pstmt != null) { // 如果有連線成功才要關閉, 沒連線成功, 連線結果是null, 會無法執行關閉
			try {
				pstmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

}
