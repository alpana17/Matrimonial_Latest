/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import Model.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Alpana
 */
public class Login_AFB extends org.apache.struts.action.ActionForm {
    
    private String uname,pass;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public Login_AFB() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUname()== null || getUname().length()<1) {
            errors.add("uname", new ActionMessage("error.unamee.required"));
        }
        if (getPass()== null || getPass().length()<1) {
            errors.add("pass", new ActionMessage("error.pas.required"));
        }
        if (getUname().length()>=1 && getPass().length()>=1) {
            Verify_login l = new Verify_login();
            int i=0;
            try {
                i = l.verify(uname, pass);
            } catch (SQLException ex) {
                Logger.getLogger(Login_AFB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login_AFB.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i==0)
                errors.add("uname", new ActionMessage("error.unameeeee.required"));
            
            if(i==1)
                errors.add("pass", new ActionMessage("error.paass.required"));
            
        }
        return errors;
    }
       
}
