package com.fractal.zpruebafactory.prueba1.main;

import com.fractal.zpruebafactory.prueba1.factory.Carro;
import com.fractal.zpruebafactory.prueba1.factory.CreadorVehiculo;

public class Main {
    
    private static CreadorVehiculo creador;
    
    public static void main(String[] args) {
        creador = new Carro();
        creador.crearVehiculo(3);
    }
    
    
}
