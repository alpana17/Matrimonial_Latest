/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Find_Aaa extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        HttpSession h = request.getSession();
        String uname = (String)h.getAttribute("uname");
        String pass = (String)h.getAttribute("pass");
        
        find_Aa f = (find_Aa)form;
        
        String gen= f.getGen();
        String rel = f.getRel();
        
        h.setAttribute("gen", gen);
        h.setAttribute("rel", rel);
        
        return mapping.findForward(SUCCESS);
    }
}
