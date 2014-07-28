/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

/**
 *
 * @author V1C70R MU3N735
 */
public class bodega {

    public bodega(String fechaSalida, String fechaIngreso, String area, int idBodega) {
        this.fechaSalida = fechaSalida;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.idBodega = idBodega;
    }

   
    
    
    private String fechaSalida;

    /**
     * Get the value of fechaSalida
     *
     * @return the value of fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Set the value of fechaSalida
     *
     * @param fechaSalida new value of fechaSalida
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    private String fechaIngreso;

    /**
     * Get the value of fechaIngreso
     *
     * @return the value of fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Set the value of fechaIngreso
     *
     * @param fechaIngreso new value of fechaIngreso
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    private String area;

    /**
     * Get the value of area
     *
     * @return the value of area
     */
    public String getArea() {
        return area;
    }

    /**
     * Set the value of area
     *
     * @param area new value of area
     */
    public void setArea(String area) {
        this.area = area;
    }

    
    private int idBodega;

    /**
     * Get the value of idBodega
     *
     * @return the value of idBodega
     */
    public int getIdBodega() {
        return idBodega;
    }

    /**
     * Set the value of idBodega
     *
     * @param idBodega new value of idBodega
     */
    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }

}
