
package Modelo.Dto;

public class MenuItemSistemaDTO {

private Integer id;
private String descrip;
private String comentario;
private MenuSistemaDTO menuSistema;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public MenuSistemaDTO getMenuSistema() {
        return menuSistema;
    }

    public void setMenuSistema(MenuSistemaDTO menuSistema) {
        this.menuSistema = menuSistema;
    }

    

}
