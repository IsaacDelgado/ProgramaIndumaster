/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaGetion;

import CapaDatos.Conexion;
import ClasesPOCO.Cliente;
import java.sql.SQLException;

/**
 *
 * @author V1C70R MU3N735
 */
public class GestionCliente implements IGestiones {

    public GestionCliente() {
        Conexion.GetInstancia().Enlace();
        
    }

    private Cliente client=new Cliente(null, ' ', null, null, null, null, null);
    public Cliente getCliente()
    {
    return client;
    }
    public void setCliente(Cliente client)
    {
    this.client=client;
    }
    
    @Override
    public void Grabar() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("insert into cliente(cedula,nombres,apellidos,direccion,telefono,correo,sexo) values ('"+this.client.getCedula()+"','"+this.client.getNombres()+"','"+this.client.getApellidos()+"','"+this.client.getDireccion()+"','"+this.client.getTelefono()+"','"+this.client.getCorreo()+"',"+this.client.getSexo()+")");
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
