/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

/**
 *
 * @author Isaac
 */
public class Producto {

    public Producto(int id, double costo, double iva, int numSerie, double precio, double precioEspecial) {
        this.id = id;
        this.costo = costo;
        this.iva = iva;
        this.numSerie = numSerie;
        this.precio = precio;
        this.precioEspecial = precioEspecial;
    }
    
    
    
    private int id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    private double costo;

    /**
     * Get the value of costo
     *
     * @return the value of costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Set the value of costo
     *
     * @param costo new value of costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    private double iva;

    /**
     * Get the value of iva
     *
     * @return the value of iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * Set the value of iva
     *
     * @param iva new value of iva
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    private int numSerie;

    /**
     * Get the value of numSerie
     *
     * @return the value of numSerie
     */
    public int getNumSerie() {
        return numSerie;
    }

    /**
     * Set the value of numSerie
     *
     * @param numSerie new value of numSerie
     */
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    
        private double precio;

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private double precioEspecial;

    /**
     * Get the value of precioEspecial
     *
     * @return the value of precioEspecial
     */
    public double getPrecioEspecial() {
        return precioEspecial;
    }

    /**
     * Set the value of precioEspecial
     *
     * @param precioEspecial new value of precioEspecial
     */
    public void setPrecioEspecial(double precioEspecial) {
        this.precioEspecial = precioEspecial;
    }

}
