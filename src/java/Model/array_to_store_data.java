package Model;

import java.sql.*;

public class array_to_store_data {
    private static String a[][]= new String[10][4] ;
    private static int i= 0;
    public static void create(String gen, String rel) throws SQLException, ClassNotFoundException
    {
    Connection con = Connect.create();
    Statement st = con.createStatement();
        String s="select uname, name, gen, rel from register";
        
        ResultSet rs = st.executeQuery(s);
        
        int j=0;
        while(rs.next())
        {
            if(gen.equals(rs.getString("gen")) && rel.equals(rs.getString("rel")))
            {
                 a[j][0]=rs.getString("uname");
                 a[j][1]=rs.getString("name");
                 a[j][2]=rs.getString("gen");
                 a[j][3]=rs.getString("rel");
                 j++;
             
            }
                i++;
        }
       
        
         con.close();
    }
    
    public static int getI(String gen, String rel) throws SQLException, ClassNotFoundException
    {
        create(gen,rel);
        return i;
    }
    
    public static String getUname(int i, String gen, String rel) throws SQLException, ClassNotFoundException
    {
        create(gen,rel);
        return a[i][0];
    }
    public static String getName(int i, String gen, String rel) throws SQLException, ClassNotFoundException
    {
        create(gen,rel);
        return a[i][1];
    }
    public static String getGen(int i, String gen, String rel) throws SQLException, ClassNotFoundException
    {
        create(gen,rel);
        return a[i][2];
    }
    public static String getRel(int i, String gen, String rel) throws SQLException, ClassNotFoundException
    {
        create(gen,rel);
        return a[i][3];
    }
    
            
}
