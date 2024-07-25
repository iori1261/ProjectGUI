package task_final03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {
    Connection con;
    Statement stmt;

    public DbConnector() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/task_final03", "root", "kcsf");
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet exeSelect(String sql) {
        ResultSet res = null;
        try {
            res = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public int exeUpdate(String sql) {
        int res = 0;
        try {
            res = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public void close() {
        try {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
