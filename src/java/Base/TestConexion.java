
package Base;

import Modelo.Dto.MenuSistemaDTO;
import base.Conexion;


public class TestConexion {
       private Conexion conexion;
       private MenuSistemaDTO dto;
       
    public TestConexion() {
        conexion = new Conexion();
        dto = new MenuSistemaDTO();
        dto.setId(1223);
        dto.setDescrip("descrip");
        dto.setComentario("comentario");
    }

  
    
    public static void main(String[] args) {
        new TestConexion();
    }
    
}
