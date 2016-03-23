/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;



import java.util.ArrayList;
import model.*;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
/**
 *
 * @author raul__000
 */
public class lista_usuarios {
    public List<Usuario> users=new ArrayList<>();
	public List<Usuario> Listar()  {
                Usuario definitivo=new Usuario();
                definitivo.setNombre("FOO");
		definitivo.getPassword().setPass("bar");
                users.add(definitivo);
                Usuario alegre=new Usuario();
                alegre.setNombre("Alegria");
		alegre.getPassword().setPass("feliz");
                users.add(alegre);
                Usuario cosmico=new Usuario();
                cosmico.setNombre("Viajero");
		cosmico.getPassword().setPass("luz");
                users.add(cosmico);
		return users;
	}


	}


