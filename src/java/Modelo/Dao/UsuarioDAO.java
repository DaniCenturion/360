
package Modelo.Dao;

import Base.BaseSQL;
import Modelo.Dto.UsuarioDTO;


public interface UsuarioDAO extends BaseSQL<UsuarioDTO>{
    Boolean inactivarUsuario(Integer id);
    
}
