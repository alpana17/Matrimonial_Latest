/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.*;


public class Connect {
     public static Connection create() throws SQLException, ClassNotFoundException
    {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = null;
    con = DriverManager.getConnection("jdbc:oracle:thin:@Alpana-PC:1522:orcl1","hr","hr");
    return con;
            }
}
