
package controller;

import Model.Delete_Check;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Delete_A extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";
    private static final String FAILURE = "fail";
    private static final String FAIL_PASS = "fail_pass";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        HttpSession h = request.getSession();
        String uname = (String)h.getAttribute("uname");
        
        Delete_AFB d = (Delete_AFB)form;
        //String dob=d.getDob();
        String email=d.getEmail();
        String name=d.getUname();
        String pass = d.getPass();
        String c_pass=d.getC_pass();
        
        if(pass.equals(c_pass) && name.equals(uname))
        {
            Delete_Check dc = new Delete_Check();
            int i=dc.check(/*dob, */email, uname, pass);
            
            if(i==1)
            {
                dc.del(name);
               return mapping.findForward(SUCCESS);
            }
            else
                return mapping.findForward(FAILURE);
        }
        return mapping.findForward(FAIL_PASS);
    }
}
