package com.fractal.zpruebafactory.prueba2.factory;

import com.fractal.zpruebafactory.prueba2.forma.Cuadrado;
import com.fractal.zpruebafactory.prueba2.forma.Forma;
import com.fractal.zpruebafactory.prueba2.forma.Linea;
import com.fractal.zpruebafactory.prueba2.forma.Punto;
import com.fractal.zpruebafactory.prueba2.forma.Triangulo;

/**
 *
 * @author bryan
 */
public class Factory {
    
    public static final int PUNTO = 1;
    public static final int LINEA = 2;
    public static final int TRIANGULO = 3;
    public static final int CUADRADO = 4;
    
    public static Forma crearForma(
            int forma,
            double largo,
            double ancho
    ) throws Exception {
        switch (forma) {
            case PUNTO:
                return new Punto(0, 0);
            case LINEA:
                return new Linea(largo, 0);
            case TRIANGULO:
                return new Triangulo(largo, ancho);//base, altura
            case CUADRADO: 
                return new Cuadrado(largo, largo);
            default: 
                throw new Exception("La forma no está contemplada");
        }
    }
}
