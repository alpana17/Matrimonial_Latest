
package controller;

import Model.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Add_A extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success", FAIL="fail",NoSelected="no_selection", EXIST="exist";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        HttpSession h = request.getSession();
        String uname = (String)h.getAttribute("uname");
        String intIn = (String)h.getAttribute("intIn");

        if(intIn.equals(null))
            return mapping.findForward(NoSelected);
        Add a = new Add();
        int i=0;
        
        i=a.addExist(uname, intIn);
        
        if(i==1)
            return mapping.findForward(EXIST);
        else
        {
        i=a.add(uname, intIn);
        if(i==1)
        return mapping.findForward(SUCCESS);
        else
             return mapping.findForward(FAIL);
        }
    }
}
