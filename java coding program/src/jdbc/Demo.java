package jdbc;

public class Demo {
    public static void main(String[] args) {
        Class.forName(com.mysql.cj.jdbc.Driver);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InsertDemo", "root", "Example@2023");

        // 3. create statement object
        Statement stmt = con.createStatement();
        // create
        // boolean execute = stmt.execute("create table emp1(id int,name varchar(20))");
        // insert
        // int rows = stmt.executeUpdate("INSERT INTO emp values(102,'xy')");
        // System.out.println(rows+" rows inserted to table");
        // Retrive
        ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
        while (rs.next()) {

            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        con.close();
        // Create ,Insert ,SELECT  -> Update ,Delete
    }


}



