package com.fractal.zpruebafactory.prueba2.main;

import com.fractal.zpruebafactory.prueba2.factory.Factory;
import com.fractal.zpruebafactory.prueba2.forma.Forma;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Main {

    private static int figura;
    private static double largo;
    private static double ancho;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Figura: ");
        figura = sc.nextInt();
        if (figura == Factory.PUNTO) {
        }
        if (figura == Factory.LINEA) {
            System.out.println("Largo: ");
            largo = sc.nextInt();
        }
        if (figura == Factory.CUADRADO) {
            System.out.println("Lado: ");
            largo = sc.nextInt();
        }
        if (figura == Factory.TRIANGULO) {
            System.out.println("Base: ");
            largo = sc.nextInt();
            System.out.println("Altura: ");
            ancho = sc.nextInt();
        }
        try {
            Forma forma = Factory.crearForma(figura, largo, ancho);
            System.out.println("Area: " + forma.getArea());
            System.out.println("Lados: " + forma.getLados());
            System.out.println("Perimetro: " + forma.getPerimetro());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
