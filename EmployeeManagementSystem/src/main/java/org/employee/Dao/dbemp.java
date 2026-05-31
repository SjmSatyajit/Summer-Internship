package org.employee.Dao;

import org.employee.Entity.Employee;

import java.sql.*;


public class dbemp {

    private static String url = "jdbc:mysql://localhost:3306/student";
    private static String user = "root";
    private static String password = "Asm#711397";
    private static Connection connection = null;

    public static void connectToDb(){

        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int insert(Employee employee){
        String sql = "insert into employeedata values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement prt = connection.prepareStatement(sql);
            prt.setInt(1,employee.getId());
            prt.setString(2, employee.getName());
            prt.setString(3, employee.getDob());
            prt.setString(4, employee.getDepartment());
            prt.setString(5, employee.getPhoneNo());
            prt.setString(6, employee.getAccNo());
            prt.setString(7, employee.getSalary());
            return prt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteById(int id){
        connectToDb();
        try {
            PreparedStatement prt = connection.prepareStatement("delete from employeedata where id=?");
            prt.setInt(1, id);

            int rows = prt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int update(Employee emp){
        String sql = "update employeedata set name=?, dob=?, department=?, phoneNo=?, accNo=?, salary=? where id=?";
        try {
            PreparedStatement prt = connection.prepareStatement(sql);
            prt.setString(1, emp.getName());
            prt.setString(2, emp.getDob());
            prt.setString(3, emp.getDepartment());
            prt.setString(4, emp.getPhoneNo());
            prt.setString(5, emp.getAccNo());
            prt.setString(6, emp.getSalary());
            prt.setInt(7, emp.getId());
            return prt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayAll(){
        String sql = "select * from employeedata";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3)+"||"+rs.getString(4)+"||"+rs.getString(5)+"||"+rs.getString(6)+"||"+rs.getString(7));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getByid(int id){
        connectToDb();
        try {
            PreparedStatement prt = connection.prepareStatement("select * from employeedata where id=?");
            prt.setInt(1, id);
            ResultSet rt = prt.executeQuery();
            if (rt.next()){
                System.out.println(rt.getInt(1)+"||"+rt.getString(2)+"||"+rt.getString(3)+"||"+rt.getString(4)+"||"+rt.getString(5)+"||"+rt.getString(6)+"||"+rt.getString(7));
            }else{
                System.out.println("Data doesn't Exist");
            }
        } catch (SQLException e) {
            System.out.println("Enter a different ID.");
        }
    }
}
