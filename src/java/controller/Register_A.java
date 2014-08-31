/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import Model.*;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Register_A extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";
    private static final String FAILURE = "fail";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        Register_AFB r = (Register_AFB)form;
        String name=r.getFname();
        String gen=r.getGen();
        String pass=r.getPass();
        String c_pass=r.getC_pass();
        String uname=r.getUname();
        String em=r.getEmail();
        String rel=r.getRel();
        
        int i= Register.reg(name, gen, rel, em, uname, pass);
        
        if (i==1)
        {
          return mapping.findForward(SUCCESS);
        }
       else
        return mapping.findForward(FAILURE);
    }
}
