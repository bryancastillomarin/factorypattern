/**
 * Esta clase es el "Creador Base"
 * A partir de aquí se toma la decision de qué Producto Concreto se va a crear
 */
package com.fractal.zpruebafactory.prueba1.factory;

import com.fractal.zpruebafactory.prueba1.vehiculo.Vehiculo;

/**
 *
 * @author Bryan Castillo Marín
 */
public abstract class CreadorVehiculo {
    
    public static final int BARCO = 1;
    public static final int CARRO = 2;
    public static final int AVION = 3;
    
    public void crearVehiculo(int tipo) {
        switch(tipo) {
            case BARCO: 
                obtenerVehiculo().desplazarse();
                break;
            case CARRO:
                obtenerVehiculo().desplazarse();
                break;
            case AVION:
                obtenerVehiculo().desplazarse();
                break;
            default: 
                System.out.println("No se conoce el tipo de vehiculo");
        }
    }
    
    public abstract Vehiculo obtenerVehiculo();
    
}
