package springbasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnection {
	public static Properties getConnection() throws Exception {

		Properties prop = new Properties();
		InputStream input = new FileInputStream("src/main/resources/dbproperties");
		prop.load(input);
		input.close();
		return prop;
	}

	public static void main(String[] args) {



		Connection connection = null;

		try {

			Properties prop = getConnection();

			String driverClass = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");

			Class.forName(driverClass);

			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {
				System.out.println("connection created ");
			}

			else {
				System.out.println(" unable to create connection");
			}

		}catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}