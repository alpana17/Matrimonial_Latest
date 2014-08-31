

package controller;

import Model.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Login_A extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";
    private static final String FAILURE = "fail";
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Login_AFB r = (Login_AFB)form;
        String uname=r.getUname();
        String pass=r.getPass();
        
        Login_Check l=new Login_Check();
        int check = l.check(uname, pass);
        
        if(check==1)
        {
            HttpSession h = request.getSession();
            h.setAttribute("uname", uname);
            h.setAttribute("pass", pass);
            h.setMaxInactiveInterval(20);
        return mapping.findForward(SUCCESS);
        }
        else
            return mapping.findForward(FAILURE);
    }
}
