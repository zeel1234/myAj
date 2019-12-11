import java.util.*;
import java.sql.*;

class prac1
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3308/employee_master","root","");
		System.out.println("Hello");


		System.out.println("View all records.");
		System.out.println("View specific record based on primary key.");
		System.out.println("View specific employee detail based on emp_code filter.");
		System.out.println("Update specific record based on primary key.");
		System.out.println("Delete specific record based on primary key.");
		System.out.println("Update specific record based on the field emp_code.");
		System.out.println("Delete specific record based on the field emp_code.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice");
		int ch=sc.nextInt();

		switch(ch)
		{
			case 1:
			{
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from emp_detail");
				while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+ " "+rs.getString(9));
				con.close();
			}
			break;
			case 2:
			{
				System.out.println("Enter ID: "  );
				String eid = sc.next();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from emp_detail where emp_id ="+eid);
       			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+ " "+rs.getString(9));
				con.close();
			}
			break;
			case 3:
						{
							System.out.println("Enter ID: "  );
							String eid = sc.next();
							Statement st = con.createStatement();
							ResultSet rs = st.executeQuery("select * from emp_detail where emp_id ="+eid+ "groupby emp_code");
			       			while(rs.next())
							System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+ " "+rs.getString(9));
							con.close();
						}
			break;
			case 4:
						{
							System.out.println("Enter ID: "  );
							String eid = sc.next();
							Statement st = con.createStatement();
							ResultSet rs = st.executeQuery("select * from emp_detail where emp_id ="+eid);
			       			while(rs.next())
							System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+ " "+rs.getString(9));
							con.close();
						}
			break;
			case 5:
						{
							System.out.println("Enter ID: "  );
							String eid = sc.next();
							Statement st = con.createStatement();
							ResultSet rs = st.executeQuery("select * from emp_detail where emp_id ="+eid);
			       			while(rs.next())
							System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+ " "+rs.getString(9));
							con.close();
						}
			break;
		}


		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}