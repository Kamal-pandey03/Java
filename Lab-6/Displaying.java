import java.sql.*;
import java.util.Scanner;

class Displaying{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
    try{
        String url="jdbc:mysql://localhost:3306/kamal";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn=DriverManager.getConnection(url,"root","");
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM Students");
        while(rs.next()){
            System.out.println("Roll no: "+rs.getInt(1)+"\tName: "+rs.getString(2)+"\tFaculty: "+rs.getString(3));
        }
        cn.close();
    }catch(ClassNotFoundException e){
        System.out.println(e.getMessage());
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    scan.close();
    } 
}
