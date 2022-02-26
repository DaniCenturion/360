
package Modelo.Dto;

import java.sql.Date;


public class PersonaDTO {

    /*
    id integer NOT NULL,
  nro_documento character varying,
  nombres character varying,
  apellidos character varying,
  fecha_nac date,
  direccion character varying,
  correo character varying,
  nro_telefono integer,
    */
        
    private Integer id;
    private String nroDocumento;
    private String nombres;
    private String apellidos;
    private Date fechaNac;
    private String dirección;
    private String correo;
    private Integer nroTelefono;

    public PersonaDTO() {
    }

    public PersonaDTO(Integer id, String nombres, String apellidos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(Integer nroTelefono) {
        this.nroTelefono = nroTelefono;
    }



    
}
