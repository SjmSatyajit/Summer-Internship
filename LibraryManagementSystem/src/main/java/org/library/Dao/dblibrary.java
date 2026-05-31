package org.library.Dao;

import org.library.Entity.Library;

import java.sql.*;

public class dblibrary {

    private static String url = "jdbc:mysql://localhost:3306/student";
    private static String user = "root";
    private static String password = "Asm#711397";
    private static Connection connection = null;

    public static void connectToDb(){

        try {
            connection =  DriverManager.getConnection(url,user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int insert(Library library){
        String sql = "insert into librarydata values(?,?,?,?,?)";
        try {
            PreparedStatement prt = connection.prepareStatement(sql);
            prt.setInt(1,library.getId());
            prt.setString(2, library.getName());
            prt.setString(3, library.getAuthor());
            prt.setString(4, library.getPublisher());
            prt.setString(5, library.getLanguage());

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

    public int update(Library lib){
        String sql = "update librarydata set name=?, author=?, publisher=?, language=? where id=?";
        try {
            PreparedStatement prt = connection.prepareStatement(sql);
            prt.setString(1, lib.getName());
            prt.setString(2, lib.getAuthor());
            prt.setString(3, lib.getPublisher());
            prt.setString(4, lib.getLanguage());
            prt.setInt(5, lib.getId());
            return prt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayAll(){
        String sql = "select * from librarydata";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3)+"||"+rs.getString(4)+"||"+rs.getString(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getById(int id){
        connectToDb();
        try {
            PreparedStatement prt = connection.prepareStatement("select * from librarydata where id=?");
            prt.setInt(1, id);
            ResultSet rt = prt.executeQuery();
            if (rt.next()){
                System.out.println(rt.getInt(1)+"||"+rt.getString(2)+"||"+rt.getString(3)+"||"+rt.getString(4)+"||"+rt.getString(5));
            }else{
                System.out.println("Data doesn't Exist");
            }
        } catch (SQLException e) {
            System.out.println("Enter a different ID.");
        }
    }
}
