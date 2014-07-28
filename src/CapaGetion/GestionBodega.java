/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaGetion;

import CapaDatos.Conexion;
import ClasesPOCO.bodega;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author V1C70R MU3N735
 */
public class GestionBodega implements IGestiones{

    public GestionBodega() {
        try {
            Conexion.GetInstancia().Enlace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private bodega bodeg;

    /**
     * Get the value of bodeg
     *
     * @return the value of bodeg
     */
    public bodega getBodeg() {
        return bodeg;
    }

    /**
     * Set the value of bodeg
     *
     * @param bodeg new value of bodeg
     */
    public void setBodeg(bodega bodeg) {
        this.bodeg = bodeg;
    }

    @Override
    public void Grabar() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("insert into bodega(area,fechaIngreso,fechaSalida) values ('"+this.bodeg.getArea()+"','"+this.bodeg.getFechaIngreso()+"','"+this.bodeg.getFechaSalida()+"')");
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
//    try{
//    Conexion.GetInstancia().Conectar();
//    Conexion.GetInstancia().Ejecutar("update cliente SET nombres='"+this.client.getNombres()+"',apellidos='"+this.client.getApellidos()+"', direccion = '"+this.client.getDireccion()+"',telefono='"+this.client.getTelefono()+"',correo='"+this.client.getCorreo()+"', sexo = '"+this.client.getSexo()+"' WHERE cedula = "+this.client.getCedula());
//    Conexion.GetInstancia().Desconectar();
//    }
//    catch(SQLException e)
//    {
//    throw e;
//    }
    }

    @Override
    public void Nuevo() throws SQLException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.bodeg.setArea(" ");
    this.bodeg.setFechaIngreso(" ");
    this.bodeg.setFechaSalida(" ");
//    this.client.setDireccion(" ");
//    this.client.setTelefono(" ");
//    this.client.setCorreo(" ");
//    this.client.setSexo(" ");
    }

    @Override
    public void Eliminar() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    try{
//    Conexion.GetInstancia().Conectar();
//    Conexion.GetInstancia().Ejecutar("delete FROM cliente WHERE cedula = "+client.getCedula());
//    Conexion.GetInstancia().Desconectar();
//
//    }
//    catch(SQLException e)
//    {
//    throw e;
//    }
    }

    @Override
    public void Consultar() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     try{
    Conexion.GetInstancia().Conectar();
        ResultSet consulta=Conexion.GetInstancia().EjectConsulta("select fechaIngreso,fechaSalida,area FROM bodega WHERE area = "+bodeg.getArea());
   while(consulta.next())
   {
    this.bodeg.setArea(consulta.getString(5));
    this.bodeg.setFechaIngreso(consulta.getString(2));
    this.bodeg.setFechaSalida(consulta.getString(3));
    
   }
        Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    
    }
    
}
