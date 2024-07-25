package exer04_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnector {
	
	//インスタンス用の変数宣言
	Connection con; //接続情報
	Statement stmt; //ステートメント
	ResultSet rs; //SELECT文の結果
	
	//DB接続とアクセス実行用のメソッド
	public void connectDb() {
		try {
			//MySQLに接続して接続情報を取得
			con = DriverManager.getConnection("jdbc:mysql://localhost/exer04_01","root","kcsf");
			
			//ステートメント(statement)を作成する
			stmt = con.createStatement();
			
			//SQL文(INSERT文)の準備
			String sql = "INSERT INTO item_tbl VALUES('商品A',100);";
			
			//SQL文の(INSERTなのでexecuteUpdate使用)発行
			int result = stmt.executeUpdate(sql);
			
			//更新結果の表示
			System.out.println("更新件数:" + result);
			
			//SQL文(SELECT文)の作成
			sql = "SELECT * FROM item_tbl;";
			
			//③SQL文(SELECT文)の発行
			rs = stmt.executeQuery(sql);
			
			//④結果の表示(全データを表示).nextで行が一つずれる次の行があるかでtrue falseを返す
			while(rs.next()) {
				//name属性の値を取り出す
				String name = rs.getString("name");
				//price属性の値を取り出す
				int price = rs.getInt("price");
				System.out.println("商品名：" + name +"　"+ "価格：" + price);
			}
			
			//⑤クローズ処理
			//ResultSetのクローズ
			rs.close();
			
			//statementのクローズ
			stmt.close();
			
			//接続情報のクローズ
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
			//ステートメント(statement)を作成する
		}
	}
	public static void main(String[] args) {
		//自インスタンスの生成とメソッド呼び出し
		DbConnector db = new DbConnector();
		db.connectDb();
	}

}
