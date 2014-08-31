package Model;

import java.sql.*;

public class Register {
    public static int reg(String name, String gen, String rel, String em, String uname, String pass) throws SQLException, ClassNotFoundException
    {
        int i=0;
        Connection con=Connect.create();
        Statement st = con.createStatement();
        String q = "insert into register values('"+name+"','"+gen+"', '"+rel+"', '"+em+"','"+uname+"','"+pass+"')";
        i= st.executeUpdate(q);
        con.close();
        
        return i;
    }
}
