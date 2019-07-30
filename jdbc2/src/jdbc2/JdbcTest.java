package jdbc2;

import java.sql.*;
public class JdbcTest {
public static void main(String[] args) 
		throws SQLException,ClassNotFoundException 
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cn016=DriverManager.getConnection(
	"jdbc:oracle:thin:@localhost:1521:orcl",
	"system","1234");			//Connection Object Created
Statement st=cn016.createStatement();
ResultSet rs016=st.executeQuery(
		"select id,name,age from emp");
while(rs016.next())
{
int id=rs016.getInt("id");
String en=rs016.getString("name");
int a=rs016.getInt("age");
System.out.printf("id : "+id +"\tName : "+en+"\tage : "+a);
}}}