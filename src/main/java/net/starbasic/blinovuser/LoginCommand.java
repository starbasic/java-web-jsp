/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.blinovuser;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Серж
 */
public class LoginCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        String page=null;
        String login = request.getParameter("login");
        String pass = request.getParameter("password");
        if(LoginLogic.checkLogin(login, pass)){
            request.setAttribute("user", login);
            page = "/jsp/main.jsp";
        } else {
            request.setAttribute("errorLoginMessage", "Incorrect login or password");
            page = "/jsp/login.jsp";
        }
        
        return page;
    }   
}
