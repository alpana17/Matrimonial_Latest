package Model;

import java.sql.*;

public class Verify_login {
    public static int verify(String uname, String pass) throws SQLException, ClassNotFoundException
    {
        int i=0;
        Connection con=Connect.create();
        Statement st = con.createStatement();
        String s= "select uname, pass from register";
        ResultSet rs = st.executeQuery(s);
        
        while (rs.next()) 
        {
            if(rs.getString("uname").equals(uname))
            {
                i=1;
                
                if(rs.getString("uname").equals(uname) && rs.getString("pass").equals(pass))
                    i=2;
                
                con.close();
                return i;
            }
        }

        con.close();        
        return i;
    }
   
}
