package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-01T12:08:44")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile SingularAttribute<TipoUsuario, String> nombreTipo;
    public static volatile SingularAttribute<TipoUsuario, Integer> id;
    public static volatile ListAttribute<TipoUsuario, Usuario> usuariosTipo;

}