/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package comprobar.usuario;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "ComprobarUsuario")
public class ComprobarUsuario {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "Comprobar")
    public Boolean Comprobar(@WebParam(name = "user") String user,
                             @WebParam(name = "password") String password) {
        // Simularemos las credenciales de un usuario
        String realUser = "username";
        String realPassword = "mypassword";
        
        try {
            if (realUser.equals(user) && realPassword.equals(password)){
                return true;
            } else if (realUser.equals(user) && !realPassword.equals(password)){
                return false;
            } else if (!realUser.equals(user) && !realPassword.equals(password)){
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
