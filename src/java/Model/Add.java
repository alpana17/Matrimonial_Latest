package Model;

import java.sql.*;

public class Add {
    public int addExist(String uname, String intIn) throws SQLException, ClassNotFoundException
    {
        int j=0;
        
        Connection con = Connect.create();
        Statement st = con.createStatement();
        String h="select * from interested";
        ResultSet rs = st.executeQuery(h);
        
        while(rs.next())
        {
            if(rs.getString("uname").equals(uname) && rs.getString("intIn").equals(intIn))
            {
                j=1;
                con.close();
                return j;
            }
        }
        con.close();
        
        return j;
    }
    public int add(String uname, String intIn) throws SQLException, ClassNotFoundException
    {
        int i=0;
        
        Connection con = Connect.create();
        Statement st = con.createStatement();
        String s ="insert into interested values('"+uname+"','"+intIn+"')";
        i=st.executeUpdate(s);
        return i;
    }
}
