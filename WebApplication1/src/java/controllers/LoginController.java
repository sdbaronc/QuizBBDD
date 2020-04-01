/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.UsuarioDAO;
import java.io.IOException;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import model.Usuario;

/**
 *
 * @author Usuario
 */
@Named(value = "loginController")

@SessionScoped
public class LoginController implements Serializable{
    private Usuario usuario;
    private Usuario usuarioAutenticado;
    
    @EJB
    private UsuarioDAO ejbDao;
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

    /**
     * Creates a new instance of loginController
     */
    public LoginController() {
        usuario=new Usuario();
        
    }
    
    
    
    public void login() throws IOException{
        usuarioAutenticado= ejbDao.encontrarUsuario(usuario.getCorreo(), usuario.getClave());
        FacesContext ctx = FacesContext.getCurrentInstance();
        if(usuarioAutenticado!=null){
            ctx.getExternalContext().redirect("home");
        }
        else{ctx.getExternalContext().redirect("index");}
    }
    
    
}
