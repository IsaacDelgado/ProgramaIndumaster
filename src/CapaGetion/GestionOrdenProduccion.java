/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGetion;

import CapaDatos.Conexion;
import ClasesPOCO.Empleado;
import ClasesPOCO.OrdenProduccion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac
 */
public class GestionOrdenProduccion implements IGestiones{
    public GestionOrdenProduccion() {
         try {
            Conexion.GetInstancia().Enlace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     private OrdenProduccion ordenProduccion=new OrdenProduccion(null, null,0, null, 0, null, null,0);
    public OrdenProduccion getOrdenProduccion()
    {
    return ordenProduccion;
    }
    public void setOrdenProduccion(OrdenProduccion ordenProduccion)
    {
    this.ordenProduccion=ordenProduccion;
    }

    @Override
    public void Grabar() throws SQLException {
        try{   //numeroOrden ,nombreProducto,cantidad,fecchaEmicion,fechaEntrega,idEmpleado,idBodega
    Conexion.GetInstancia().Conectar();
   Conexion.GetInstancia().Ejecutar("insert into ordenProduccion(numeroOrden ,nombreProducto,cantidad,fecchaEmicion,fechaEntrega,idEmpleado,idBodega) values "
           + "('"+this.ordenProduccion.getNumeroOrdenProduccion()+"',"
           + "'"+this.ordenProduccion.getListaProducto()+"',"
           + "'"+this.ordenProduccion.getCantidad()+"',"
           + "'"+this.ordenProduccion.getFechaPedido()+"',"
           + "'"+this.ordenProduccion.getFechaEntrega()+"'"
           + "'"+this.ordenProduccion.getIdEmpleado()+"',"
           + "'"+this.ordenProduccion.getIdBodega()+"')");
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
