package net.starbasic.blinovuser;
import javax.servlet.http.HttpServletRequest;

class ActionFactory {
    ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand current = new EmptyCommand();
        String action = request.getParameter("command");
        if(action!=null && !action.isEmpty()){
           
            try{
                CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
                current = currentEnum.getCurrentCommand();
            }catch(IllegalArgumentException e){
                request.setAttribute("wrongAction", action + "\n" + e.getMessage());
            }
        }
        return current;
    }
}
