package com.fractal.zpruebafactory.prueba2.forma;

/**
 *
 * @author bryan
 */
public class Triangulo extends Forma {

    public Triangulo(
            double base,
            double altura
    ) {
        super(base, altura);
    }

    @Override
    public int getLados() {
        return 3;
    }

    @Override
    public double getPerimetro() {
        return getLargo() * getLados();
    }

    @Override
    public double getArea() {
        return (getLargo() * getAncho()) / 2;
    }
    
}
