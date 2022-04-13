/**
 * Esta clase es un "Creador concreto"
 */
package com.fractal.zpruebafactory.prueba1.factory;

import com.fractal.zpruebafactory.prueba1.vehiculo.BarcoVehiculo;
import com.fractal.zpruebafactory.prueba1.vehiculo.Vehiculo;

/**
 *
 * @author Bryan Castillo Marín
 */
public class Barco extends CreadorVehiculo {

    @Override
    public Vehiculo obtenerVehiculo() {
        return new BarcoVehiculo();
    }
    
}
