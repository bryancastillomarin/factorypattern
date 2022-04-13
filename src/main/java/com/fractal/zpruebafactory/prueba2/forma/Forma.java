package com.fractal.zpruebafactory.prueba2.forma;

/**
 *
 * @author bryan
 */
public abstract class Forma {
    
    private double largo;
    private double ancho;
    
    public Forma(
            double largo,
            double ancho
    ) {
        this.ancho = ancho;
        this.largo = largo;
    }
    
    public abstract int getLados();
    
    public abstract double getPerimetro();
    
    public abstract double getArea();

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
