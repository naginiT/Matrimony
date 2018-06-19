package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

public class CrudOperations 
{
	public static void insert()
	{
		try
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Student_name ::::::");
			String Student_name=sc.next();
			System.out.println("Enter Student_sub :::::::::::");
			String Student_sub=sc.next();
			System.out.println("Enter Student_Id ::::::::::::");
			int Student_Id=sc.nextInt();
			System.out.println("Enter Student_clg :::::::::::");
			String Student_clg=sc.next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mounika","mounika");
			PreparedStatement pstmt=conn.prepareStatement("insert into student(Student_name,Student_sub,Student_Id,Student_clg) values(?,?,?,?)");
			pstmt.setString(1, Student_name);
			pstmt.setString(2,Student_sub);
			pstmt.setInt(3,Student_Id);
			pstmt.setString(4,Student_clg);
			int i=pstmt.executeUpdate();
			
			if(i==1)
			{
				System.out.println("Insert Success");
			}
			else
			{
				System.out.println("Insert not Success");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void fetch()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mounika","mounika");
			PreparedStatement pstmt=conn.prepareStatement("select * from student");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println("Student_name:::::"+rs.getString(1));
				System.out.println("Student_sub::::::"+rs.getString(2));
				System.out.println("Student_Id:::::::"+rs.getInt(3));
				System.out.println("Student_clg::::::"+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void update()
	{
		try
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student_name to update::::::::");
			String Student_name=sc.next();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mounika","mounika");
			
			PreparedStatement pstmt=conn.prepareStatement("select * from student");
			
			ResultSet rs=pstmt.executeQuery();
			HashSet<String> hs=new HashSet<>();
			while(rs.next())
			{
				hs.add(rs.getString("Student_name"));
			}
			if(hs.contains(Student_name))
			{
				System.out.println("Record found");
				System.out.println("Enter the details to Update::::::");
				System.out.println("Enter the Student_sub:::::");
				String Student_sub=sc.next();
				
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mounika","mounika");
				
				PreparedStatement pstmt1=conn1.prepareStatement("update student set Student_sub=?  where Student_name=?");
				
				pstmt1.setString(1, Student_sub);
				pstmt1.setString(2, Student_name);
					
				int i=pstmt1.executeUpdate();
				if(i==1)
				{
					System.out.println("Update success");
				}
				else
				{
					System.out.println("Update not success");
				}
			}
			else
			{
				System.out.println("Record not found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	public static void delete()
	{
		try
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student_name to delete::::::");
			String Student_name=sc.next();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mounika","mounika");
			
			PreparedStatement pstmt=conn.prepareStatement("select * from student");
			ResultSet rs=pstmt.executeQuery();
			HashSet<String> hs=new HashSet<>();
			while(rs.next())
			{
				hs.add(rs.getString("Student_name"));
			}
			if(hs.contains(Student_name))
			{
				System.out.println("Record Found");
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mounika","mounika");
				
				PreparedStatement pstmt1=conn1.prepareStatement("delete from student where Student_name=?");
				pstmt1.setString(1,Student_name);
				int i=pstmt1.executeUpdate();
				if(i==1)
				{
					System.out.println("Delete Success");
				}
				else
				{
					System.out.println("Delete not success");
				}
			}
			else
			{
				System.out.println("Record not found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
