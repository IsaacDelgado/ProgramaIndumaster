/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

import java.sql.Date;

/**
 *
 * @author V1C70R MU3N735
 */
public class Empleado extends Persona{

  
   
    private int idEmpleado;

    public Empleado(String direccion, String sexo, String telefono, String correo, String apellidos, String nombres, String cedula, int idEmpleado,Date fechaNacimiento,Date fechaIngreso,String Cargo) {
        super(direccion, sexo, telefono, correo, apellidos, nombres, cedula);
        setIdEmpleado(idEmpleado);
        setFechaNacimiento(fechaNacimiento);
        setFechaIngreso(fechaIngreso);
        setCargo(cargo);
    }

      
    /**
     * Get the value of idEmpleado
     *
     * @return the value of idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Set the value of idEmpleado
     *
     * @param idEmpleado new value of idEmpleado
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    private Date fechaNacimiento;

    /**
     * Get the value of fechaNacimiento
     *
     * @return the value of fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Set the value of fechaNacimiento
     *
     * @param fechaNacimiento new value of fechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private Date fechaIngreso;

    /**
     * Get the value of fechaIngreso
     *
     * @return the value of fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Set the value of fechaIngreso
     *
     * @param fechaIngreso new value of fechaIngreso
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    private String cargo;

    /**
     * Get the value of cargo
     *
     * @return the value of cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Set the value of cargo
     *
     * @param cargo new value of cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
