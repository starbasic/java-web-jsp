/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.blinovuser;

/**
 *
 * @author Серж
 */
class LoginLogic {
    private final static String ADMIN_LOGIN = "admin";
    private final static String ADMIN_PASS = "Qwe123";
    static boolean checkLogin(String enterLogin, String enterPassword) {
        //return false;
        
        
        
        return ADMIN_LOGIN.equals(enterLogin)&&ADMIN_PASS.equals(enterPassword); 
    }
    
}
