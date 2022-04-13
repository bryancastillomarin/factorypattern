package com.fractal.zpruebafactory.prueba2.forma;

/**
 *
 * @author bryan
 */
public class Punto extends Forma {

    public Punto(
            double largo,
            double ancho
    ) {
        super(0, 0);
    }
    
    @Override
    public int getLados() {
        return 0;
    }

    @Override
    public double getPerimetro() {
        return 0.0;
    }

    @Override
    public double getArea() {
        return 0.0;
    }
    
}
