
package Base;

import java.util.List;


public interface BaseSQL<T> {   

    public boolean agregarRegistro(T dto);
    public boolean modificarRegistro(T dto);
    public boolean eliminarRegistro(T dto);
    public T recuperarRegistro(Integer id);
    public List<T> recuperarRegistros();
    public String aviso(); 


}
