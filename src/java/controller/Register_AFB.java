

package controller;

import Model.*;
import java.sql.*;
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
public class Register_AFB extends org.apache.struts.action.ActionForm {
    
    private String fname, gen, rel, email, uname,pass,c_pass;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }


    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getC_pass() {
        return c_pass;
    }

    public void setC_pass(String c_pass) {
        this.c_pass = c_pass;
    }
    
    public Register_AFB() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
       if (getFname() == null || getFname().length() < 1 || getFname().length()>50) {
            errors.add("fname", new ActionMessage("error.name.required"));
           }
        if (getUname().length() > 1 ) {
            Verify_login l = new Verify_login();
            int i=1;
            try {
                i = l.verify(uname,pass);
            } catch (SQLException ex) {
                Logger.getLogger(Login_AFB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login_AFB.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i==1)
            errors.add("uname", new ActionMessage("error.unaaame.required"));
           }
        if (getGen()== null  || getGen().length()<1) {
            errors.add("gen", new ActionMessage("error.gen.required"));
           }
        
        if (getEmail()== null ||getEmail().length()<1) {
            errors.add("email", new ActionMessage("error.email.required"));
           }
        if (getC_pass()== null || getC_pass().length()<1) {
            errors.add("C_pass", new ActionMessage("error.c_pass.required"));
           }
        if (getPass()== null || getPass().length()<1) {
            errors.add("pass", new ActionMessage("error.pass.required"));
           }
        if (!(getC_pass().equals(getPass()))) {
            errors.add("pass", new ActionMessage("error.notmatched.required"));
           }
        if (getRel()== null || getRel().length()<1) {
            errors.add("rel", new ActionMessage("error.rel.required"));
           }
        if (getUname()== null || getUname().length() < 1 || getUname().length()>50) {
            errors.add("uname", new ActionMessage("error.uname.required"));
           }
        return errors;
    }
}
