/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.*;

public class Login_Check {
    public int check(String n, String p) throws SQLException, ClassNotFoundException
    {
        int i=0;
        Connection con = Connect.create();
        PreparedStatement pst = con.prepareStatement("Select uname, pass from Register");
        ResultSet rs = pst.executeQuery();
        
        while(rs.next())
        {
            if(rs.getString("uname").equals(n) && (rs.getString("pass").equals(p)))
            {
                i=1;
                return i;
            }
        }
        return i;
    }
}
