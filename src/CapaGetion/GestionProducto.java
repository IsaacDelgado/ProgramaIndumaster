/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaGetion;

import CapaDatos.Conexion;

import ClasesPOCO.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
@@ -14,29 +20,115 @@ import java.sql.SQLException;
 */
public class GestionProducto implements IGestiones{

    public GestionProducto() {
        try {
            Conexion.GetInstancia().Enlace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
     private Producto producto=new Producto(null,null, 0, 0, 0, null, 0, 0);
    //private Producto producto;

    /**
     * Get the value of producto
     *
     * @return the value of producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Set the value of producto
     *
     * @param producto new value of producto
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void Grabar() throws SQLException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("insert into producto(nombre,descripcion,costo,numeroSerie,precioEspecial) values ('"+this.producto.getCosto()+"','"+this.producto.getDescripcion()+"','"+this.producto.getNombre()+"','"+this.producto.getNumSerie()+"',"+this.producto.getPrecioEspecial()+")");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Modificar() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("update producto SET nombre='"+this.producto.getNombre()+"',descripcion='"+this.producto.getDescripcion()+"',costo="+this.producto.getCosto()+", numeroSerie = '"+this.producto.getNumSerie()+"' WHERE cedula = "+this.producto.getNumSerie());
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Nuevo() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.producto.setCosto(0);
    this.producto.setNombre(" ");
    this.producto.setDescripcion(" ");
    this.producto.setIva(0);
    this.producto.setPrecio(0);
    this.producto.setPrecioEspecial(0);
    this.producto.setNumSerie(" ");
   
    }

    @Override
    public void Eliminar() throws SQLException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("delete FROM producto WHERE cedula = "+producto.getNumSerie());
    Conexion.GetInstancia().Desconectar();

    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Consultar() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     try{
    Conexion.GetInstancia().Conectar();
        ResultSet consulta=Conexion.GetInstancia().EjectConsulta("select * FROM producto WHERE Cedula = "+producto.getNumSerie());
   while(consulta.next())
   {
    this.producto.setCosto(consulta.getDouble(2));
    this.producto.setNombre(consulta.getString(3));
    this.producto.setNumSerie(consulta.getString(4));
    this.producto.setIva(consulta.getDouble(5));
    this.producto.setPrecio(consulta.getDouble(6));
    this.producto.setPrecioEspecial(consulta.getDouble(7));
    this.producto.setDescripcion(consulta.getString(8));
    
   }
        Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

}
    