/**
 * Esta clase es un "Creador concreto"
 */
package com.fractal.zpruebafactory.factory;

import com.fractal.zpruebafactory.vehiculo.BarcoVehiculo;
import com.fractal.zpruebafactory.vehiculo.Vehiculo;

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
