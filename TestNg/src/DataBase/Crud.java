package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

public class Crud 
{
	public static void insert(Connection conn)
	{
		try
		{
			@SuppressWarnings("resource")
			Scanner sc=new  Scanner(System.in);
			System.out.println("Enter the doc_name::::");
			String doc_name=sc.next();
			System.out.println("Enter specialist_in :::::");
			String specialist_in=sc.next();
			System.out.println("Enter the id:::::::::::");
			int id=sc.nextInt();
			System.out.println("Enter the hsptl_name::::::::::::::::");
			String hsptl_name=sc.next();
			PreparedStatement pstmt=conn.prepareStatement("insert into hospital (doc_name,specialist_in,id,hsptl_name) values(?,?,?,?)");
			
			pstmt.setString(1,doc_name );
			pstmt.setString(2,specialist_in );
			pstmt.setInt(3, id);
			pstmt.setString(4, hsptl_name);
			int i=pstmt.executeUpdate();
			if(i==1){
				System.out.println("Insert Success");
			}else{
				System.out.println("Insert Not Success");
			}			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void fetch(Connection conn)
	{
		try{
			PreparedStatement pstmt=conn.prepareStatement("select * from hospital");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println("doc_name::::"+rs.getString("doc_name"));
				System.out.println("specialist_in:::::"+rs.getString(2));
				System.out.println("id:::::::::::"+rs.getInt(3));
				System.out.println("hsptl_name::::::::::::::::"+rs.getString(4));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
	
	
	
	public static void update(Connection conn)
	{
		try{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the doc_name to Update:::::::");
			String doc_name=sc.next();
			PreparedStatement pstmt=conn.prepareStatement("select * from hospital");
			ResultSet rs=pstmt.executeQuery();
			HashSet<String> hs=new HashSet<>();
			while(rs.next()){
				hs.add(rs.getString("doc_name"));
			}
			if(hs.contains(doc_name)){
				System.out.println("Record Found");
				System.out.println("Enter the Details to Update::::::");
				System.out.println("Enter the specialist_in:::::");
				String specialist_in=sc.next();
				System.out.println("Enter the id:::::::::::");
				int id=sc.nextInt();
				System.out.println("Enter the hsptl_name::::::::::::::::");
				String hsptl_name=sc.next();
		
				PreparedStatement pstmt1=conn.prepareStatement("update hospital set specialist_in=?,id=?,hsptl_name=? where doc_name=?");
				pstmt1.setString(4, doc_name);
				pstmt1.setString(1, specialist_in);
				pstmt1.setInt(2,id );
				pstmt1.setString(3, hsptl_name);
				int i=pstmt1.executeUpdate();
				if(i==1)
				{
					System.out.println("Update Success");
				}
				else
				{
					System.out.println("Update Not Success");
				}					
			}
			else
			{
				System.out.println("Record Not Found");
			}			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	public static void delete(Connection conn)
	{
		try
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the doc_name to Delete:::::::");
			String doc_name=sc.next();
			PreparedStatement pstmt=conn.prepareStatement("select * from hospital");
			ResultSet rs=pstmt.executeQuery();
			HashSet<String> hs=new HashSet<>();
			while(rs.next())
			{
				hs.add(rs.getString("doc_name"));
			}
			if(hs.contains(doc_name))
			{
				System.out.println("Record Found");
				PreparedStatement pstmt1=conn.prepareStatement("delete from hospital where doc_name =?");
				pstmt1.setString(1, doc_name);
				int i=pstmt1.executeUpdate();
				if(i==1)
				{
					System.out.println("Delete Success");
				}
				else
				{
					System.out.println("Delete Not Success");
				}
			}
			else
			{
				System.out.println("Record Not Found");
			}
		}
		catch(Exception e)
		{
			System.out.println("hai");
			
		}}
}
