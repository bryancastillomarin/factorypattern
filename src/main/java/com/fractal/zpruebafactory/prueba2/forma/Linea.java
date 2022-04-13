package com.fractal.zpruebafactory.prueba2.forma;

/**
 *
 * @author bryan
 */
public class Linea extends Forma {

    public Linea(
            double largo,
            double ancho
    ) {
        super(largo, 0.01);
    }

    @Override
    public int getLados() {
        return 1;
    }

    @Override
    public double getPerimetro() {
        return getLargo();
    }

    @Override
    public double getArea() {
        return 0.0;
    }
    
}
