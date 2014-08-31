
package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Delete_AFB extends org.apache.struts.action.ActionForm {
    
    private String uname,email,pass,c_pass;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
    public Delete_AFB() {
        super();
        
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
       /* if (getDob()==null)
            errors.add("dob", new ActionMessage("error.dobb.required"));*/
        if (getUname() == null || getUname().length() < 1 || getUname().length()>50) {
            errors.add("uname", new ActionMessage("error.unaame.required"));
           }
        if (getPass()==null || getPass().length()<1){
            errors.add("pass", new ActionMessage("error.passs.required"));
        }
        if (getC_pass()==null || getC_pass().length()<1){
            errors.add("c_pass", new ActionMessage("error.c_passs.required"));
        }
        if (getEmail()==null || getEmail().length()>50 || getEmail().length()<1){
            errors.add("email", new ActionMessage("error.emaill.required"));
        }
        
        return errors;
    }
}
