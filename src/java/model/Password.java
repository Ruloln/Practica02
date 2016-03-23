package model;
// Generated 22/03/2016 04:46:45 PM by Hibernate Tools 4.3.1



/**
 * Password generated by hbm2java
 */
public class Password  implements java.io.Serializable {


     private String numeroDeCuenta;
     private Usuario usuario;
     private String pass;

    public Password() {
    }

	
    public Password(Usuario usuario) {
        this.usuario = usuario;
    }
    public Password(Usuario usuario, String pass) {
       this.usuario = usuario;
       this.pass = pass;
    }
   
    public String getNumeroDeCuenta() {
        return this.numeroDeCuenta;
    }
    
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }




}


