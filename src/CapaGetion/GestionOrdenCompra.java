/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGetion;

import CapaDatos.Conexion;
import ClasesPOCO.OrdenCompra;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac
 */
public class GestionOrdenCompra implements IGestiones{

    public GestionOrdenCompra() {
         try {
            Conexion.GetInstancia().Enlace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionOrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     private OrdenCompra ordenCompra=new OrdenCompra(0, null,0, null, 0,0);
    public OrdenCompra getorOrdenCompra()
    {
    return ordenCompra;
    }
    public void setOrdenCompra(OrdenCompra ordenCompra)
    {
    this.ordenCompra=ordenCompra;
    }
    
    @Override
    public void Grabar() throws SQLException {
        try{  
    Conexion.GetInstancia().Conectar();
   Conexion.GetInstancia().Ejecutar("insert into ordenProduccion(numeroOrdenCompra ,nombreMateriaPrima,cantidad,fechaCompra,idBodega,idProveedor) values "
           + "('"+this.ordenCompra.getNumeroOrdenCompra()+"',"
           + "'"+this.ordenCompra.getNombreMateriaPrima()+"',"
           + "'"+this.ordenCompra.getCantidad()+"',"
           + "'"+this.ordenCompra.getFechaCompra()+"',"
           + "'"+this.ordenCompra.getIdBodega()+"'"
           + "'"+this.ordenCompra.getIdProveedor()+"',"
           + ")");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
     }
    

    @Override
    public void Modificar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Nuevo() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
