/**
 * Esta clase se considera un Producto Concreto
 */
package com.fractal.zpruebafactory.vehiculo;

/**
 *
 * @author Bryan Castillo Marín
 */
public class CarroVehiculo implements Vehiculo {
    
    @Override
    public void desplazarse() {
        System.out.println("Se deplaza por tierra");
    }
    
}
