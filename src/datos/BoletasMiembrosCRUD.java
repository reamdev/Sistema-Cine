package datos;

import database.TipoConexion;
import entidades.BoletasMiembros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BoletasMiembrosCRUD {
    private final TipoConexion TC = new TipoConexion();
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;
    private String consulta;
    
    public boolean modificarPorMP(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boletos_miembros SET id_mp = ? WHERE id_mp = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setInt(2, id);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean modificarPorMiembros(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boletos_miembros SET id_miembro = ? WHERE id_miembro = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setInt(2, id);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean modificarPorPeli(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boletos_miembros SET id_peli = ? WHERE id_peli = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setInt(2, id);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean modificarPorSala(int codigo, int id) {
        resp = false;
        consulta = "UPDATE boletos_miembros SET id_sala = ? WHERE id_sala = ?";
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, codigo);
            ps.setInt(2, id);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean eliminar(int code) {
        consulta = "DELETE FROM boletos_miembros WHERE id_boleto = ?";
        resp = false;
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean eliminarPorMiembro(int code) {
        consulta = "DELETE FROM boletos_miembros WHERE id_miembro = ?";
        resp = false;
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean eliminarPorPeli(int code) {
        consulta = "DELETE FROM boletos_miembros WHERE id_peli = ?";
        resp = false;
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean eliminarPorSala(int code) {
        consulta = "DELETE FROM boletos_miembros WHERE id_sala = ?";
        resp = false;
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
    
    public boolean eliminarPorMPago(int code) {
        consulta = "DELETE FROM boletos_miembros WHERE id_mp = ?";
        resp = false;
        
        try{
            ps = TC.consultaSQL(consulta);
            ps.setInt(1, code);
            if(ps.executeUpdate()>0){
                resp = true;
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            TC.getConexion().desconectar();
        }
        
        return resp;
    }
}