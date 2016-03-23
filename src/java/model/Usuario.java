package model;
// Generated 22/03/2016 04:46:45 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String numeroDeCuenta;
     private String nombre;
     private String correo;
     private Password password;

    public Usuario() {
    }

	
    public Usuario(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public Usuario(String numeroDeCuenta, String nombre, String correo, Password password) {
       this.numeroDeCuenta = numeroDeCuenta;
       this.nombre = nombre;
       this.correo = correo;
       this.password = password;
    }
   
    public String getNumeroDeCuenta() {
        return this.numeroDeCuenta;
    }
    
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Password getPassword() {
        return this.password;
    }
    
    public void setPassword(Password password) {
        this.password = password;
    }




}


