package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainApp 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mounika","mounika");
		Crud.insert(conn);
		Crud.fetch(conn);
		Crud.update(conn);
		Crud.delete(conn);
	}
}
