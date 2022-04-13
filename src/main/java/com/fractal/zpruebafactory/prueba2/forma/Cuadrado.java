package com.fractal.zpruebafactory.prueba2.forma;

/**
 *
 * @author bryan
 */
public class Cuadrado extends Forma {

    public Cuadrado(
            double largo,
            double ancho
    ) {
        super(largo, ancho);
    }

    @Override
    public int getLados() {
        return 4;
    }

    @Override
    public double getPerimetro() {
        return getLados() * getLargo();
    }

    @Override
    public double getArea() {
        return getLargo() * getLargo();
    }
    
}
