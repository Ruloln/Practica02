/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


import control.Login;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import model.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import model.Password;

import org.apache.commons.codec.digest.DigestUtils;
import usuarios.lista_usuarios;


@ManagedBean
@SessionScoped


/**
 *
 * @author raul__000
 */
@Named(value = "beanIngreso")

public class beanIngreso implements Serializable {

    /**
     * Creates a new instance of beanIngreso
     */
    public beanIngreso() {
    }
    	private String usuario ;
        private String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getUsuario() {
        return usuario;
    }
public String  ingresar() throws Exception{
        Login l=new Login();
        if(l.LogIn(usuario, pass)){
            return "aprobado";
        }
        return "negado";
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   




	

        public String regresar(){
        return "regreso";
    }
    public String avanzar(){
        return "avanzar";
    }
    public String retroceder(){
        return "retroceder";
    }
}
