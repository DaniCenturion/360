package Modelo.DaoImp;

import Modelo.Dao.MenuSistemaDAO;
import Modelo.Dto.MenuSistemaDTO;
import base.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuSistemaDAOIMP implements MenuSistemaDAO {

    private String sql;
    private Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public MenuSistemaDAOIMP() {
        conexion = new Conexion();

    }

    @Override
    public boolean agregarRegistro(MenuSistemaDTO dto) {
        try {
            conexion.Transaccion(Conexion.TR.INICIAR);
            sql = "INSERT INTO menu_sistema(descrip, comentario) VALUES ( ?, ?);";
            ps = conexion.obtenerConexion().prepareStatement(sql);
            ps.setString(1, dto.getDescrip());
            ps.setString(2, dto.getComentario());
            if (ps.executeUpdate() > 0) {
                conexion.Transaccion(Conexion.TR.CONFIRMAR);
            } else {
                conexion.Transaccion(Conexion.TR.CANCELAR);
                return false;
            }

            return false;
        } catch (SQLException ex) {
            Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            conexion.Transaccion(Conexion.TR.CANCELAR);
            return false;
        } finally {
            try {
                conexion.cerrarConexion();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean modificarRegistro(MenuSistemaDTO dto) {
        try {
            conexion.Transaccion(Conexion.TR.INICIAR);
            sql = "UPDATE menu_sistema SET descrip=?, comentarioo=? WHERE id=?;";
            ps = conexion.obtenerConexion().prepareStatement(sql);
            ps.setString(1, dto.getDescrip());
            ps.setString(2, dto.getComentario());
            ps.setInt(3, dto.getId());
            if (ps.executeUpdate() > 0) {
                conexion.Transaccion(Conexion.TR.CONFIRMAR);
            } else {
                conexion.Transaccion(Conexion.TR.CANCELAR);
                return false;
            }

            return false;
        } catch (SQLException ex) {
            Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            conexion.Transaccion(Conexion.TR.CANCELAR);
            return false;
        } finally {
            try {
                conexion.cerrarConexion();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean eliminarRegistro(MenuSistemaDTO dto) {
        try {
            conexion.Transaccion(Conexion.TR.INICIAR);
            sql = "DELETE FROM menu_sistema WHERE id=?;";
            ps = conexion.obtenerConexion().prepareStatement(sql);
            ps.setInt(1, dto.getId());
            if (ps.executeUpdate() > 0) {
                conexion.Transaccion(Conexion.TR.CONFIRMAR);
            } else {
                conexion.Transaccion(Conexion.TR.CANCELAR);
                return false;
            }

            return false;
        } catch (SQLException ex) {
            Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            conexion.Transaccion(Conexion.TR.CANCELAR);
            return false;
        } finally {
            try {
                conexion.cerrarConexion();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public MenuSistemaDTO recuperarRegistro(Integer id) {
        try {
            MenuSistemaDTO dto = null;
            sql = "SELECT id, descrip, comentario FROM menu_sistema WHERE id= ?;";
            ps = conexion.obtenerConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                dto = new MenuSistemaDTO();
                dto.setId(rs.getInt("id"));
                dto.setDescrip(rs.getString("descrip"));
                dto.setComentario(rs.getString("comentario"));
            }
            return dto;
        } catch (SQLException ex) {
            Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conexion.cerrarConexion();
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<MenuSistemaDTO> recuperarRegistros() {
        try {
            List<MenuSistemaDTO> lista = null;
            MenuSistemaDTO dto = null;
            sql = "SELECT id, descrip, comentario FROM menu_sistema ";
            ps = conexion.obtenerConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                dto = new MenuSistemaDTO();
                dto.setId(rs.getInt("id"));
                dto.setDescrip(rs.getString("descrip"));
                dto.setComentario(rs.getString("comentario"));
                lista.add(dto);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conexion.cerrarConexion();
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(MenuSistemaDAOIMP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String aviso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
