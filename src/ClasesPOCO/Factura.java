/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPOCO;

import java.util.Date;
import java.util.List;

/**
 *
 * @authores: Muentes Sabando Victor; Delgado Mero Jaime; Indacochea Maria Belen; Bravo Toala Luis.
 */
public class Factura
{

    public Factura(List<Producto> facturaProducto, String fechaFactura, String Detalle, double Descuento, String Codigo) {
        this.facturaProducto = facturaProducto;
        this.fechaFactura = fechaFactura;
        this.Detalle = Detalle;
        this.Descuento = Descuento;
        this.Codigo = Codigo;
    }

    public Factura() {
    }
    
     private List<Producto> facturaProducto;
     
     
     public List<Producto> getFacturaProducto() {
        return facturaProducto;
        
    }
    public void setFacturaProducto(List<Producto> facturaProducto) {
        this.facturaProducto = facturaProducto;
    }
    
    
        private String fechaFactura;

    /**
     * Get the value of fechaFactura
     *
     * @return the value of fechaFactura
     */
        
    public String getFechaFactura() {
        return fechaFactura;
    }

    /**
     * Set the value of fechaFactura
     *
     * @param fechaFactura new value of fechaFactura
     */
    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    private String Detalle;

    /**
     * Get the value of Detalle
     *
     * @return the value of Detalle
     */
    public String getDetalle() {
        return Detalle;
    }

    /**
     * Set the value of Detalle
     *
     * @param Detalle new value of Detalle
     */
    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    
    private double Descuento;

    /**
     * Get the value of Descuento
     *
     * @return the value of Descuento
     */
    public double getDescuento() {
        return Descuento;
    }

    /**
     * Set the value of Descuento
     *
     * @param Descuento new value of Descuento
     */
    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    
    private String Codigo;

    /**
     * Get the value of Codigo
     *
     * @return the value of Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * Set the value of Codigo
     *
     * @param Codigo new value of Codigo
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

}
