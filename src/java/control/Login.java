/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.*;
import usuarios.*;
/**
 *
 * @author raul__000
 */
public class Login {
    public boolean LogIn(String usuario,String password) {
        lista_usuarios u=new lista_usuarios();
        for(Usuario a:u.Listar()){
            if(a.getNombre().equals(usuario) && a.getPassword().getPass().equals(password)){
                return true;
            }
        }
        return false;
    }
}
