package domain;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import constants.Database;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data 
public class DatabaseBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Getter @Setter
	private String driver,url,username,password;
	private Connection connection;
	public DatabaseBean(String driver,String url,
			String username,String password
			) {
		this.driver=driver;
		this.url=url;
		this.username=username;
		this.password=password;
	}
	public Connection getConnection() {
		try {
			Class.forName(Database.ORACLE_DRIVER);
			connection=DriverManager.getConnection(
					Database.ORACLE_URL,
					Database.USERNAME,
					Database.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
