
package Modelo.Dto;


public class MenuSistemaDTO {
    private Integer id;
    private String descrip;
    private String comentario;

    public MenuSistemaDTO() {
    }



    public void setId(Integer id){ 
        this.id = id;
    
    }
    public void setDescrip( String descrip){ 
        this.descrip = descrip;
    
    }
    public void setComentario( String comentario){ 
        this.comentario = comentario;    
    }
    
    public Integer getId(){
        return id;   
    }

    public String getDescrip(){
         return descrip;
    }
    public String getComentario(){
         return comentario;
    }
}