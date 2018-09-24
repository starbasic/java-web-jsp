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
public interface ActionCommand {
    String execute(HttpServletRequest request);
}
