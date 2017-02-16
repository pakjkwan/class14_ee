package util;
import java.sql.*;

import constants.Database;
public class JdbcTest {
	public String getName() {
		String rs="";
		try {
			Class.forName(Database.ORACLE_DRIVER);
			Connection connection=DriverManager.getConnection(
					Database.ORACLE_URL,
					Database.USERNAME,
					Database.PASSWORD
					);
			Statement stmt=connection.createStatement();
			String sql="SELECT * FROM Member WHERE id='hong'";
			ResultSet set=stmt.executeQuery(sql);
			if(set.next()){
				rs=set.getString("name");
			}
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		return rs;
		
	}
}
