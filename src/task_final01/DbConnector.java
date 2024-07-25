package task_final01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {
	//インスタンス用の変数宣言
	Connection con; //接続情報
	Statement stmt; //ステートメント
	//DB接続とアクセス実行用のメソッド

	public DbConnector() {

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost/task_final01","root","kcsf");
			stmt = con.createStatement();

		}catch(SQLException e){

		}

	}


	public ResultSet exeSelect(String sql) {
		ResultSet res = null;

		try {
			res = stmt.executeQuery(sql);

		}catch(SQLException e) {

		}
		return res;
	}

}
