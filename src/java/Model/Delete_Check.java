
package Model;

import java.sql.*;

public class Delete_Check {
    
    public int check(/*String dob,*/String email,String uname,String pass) throws SQLException, ClassNotFoundException
    {
        int i =0;
        Connection con=Connect.create();
        String s="delete from register WHERE uname=? AND email=? AND pass=?";
        PreparedStatement pst = con.prepareStatement(s);
        pst.setString(1, uname);
        pst.setString(2, email);
        pst.setString(3, pass);
        i=pst.executeUpdate();
        
        con.close();
        
        return i;
    }
    
    public void del(String name) throws SQLException, ClassNotFoundException
    {
        
        Connection con1=Connect.create();
        String s1 = "delete from interested where uname=? OR intin=?";
        PreparedStatement st = con1.prepareStatement(s1);
        st.setString(1, name);
        st.setString(2, name);
        
        st.executeUpdate();
        con1.close();
    }
}
