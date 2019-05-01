/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.mochila_parcial;

/**
 *
 * @author juan
 */
public class Principal 
{
    
    public static void main(String[] args) 
    {
        Mochila samsonite = new Mochila();
        
        Objeto objeto1 = new Objeto(1);
        Objeto objeto2 = new Objeto(2);
        Objeto objeto3 = new Objeto(3);
        Objeto objeto4 = new Objeto(4);
        Objeto objeto5 = new Objeto(5);
        Objeto objeto6 = new Objeto(6);
        Objeto objeto7 = new Objeto(7);
        Objeto objeto8 = new Objeto(8);
        
        if(samsonite.esVacia())
            System.out.println("Mochila vacia");
        else
            System.out.println("Mochila no esta vacia");
        System.out.println("Agregamos dos objetos al inicio");
        samsonite.agregarNodoAlInicio(objeto1);
        samsonite.agregarNodoAlInicio(objeto2);
        samsonite.verMochila();
        System.out.println("Agregamos dos objetos al final");
        samsonite.agregarNodoAlFinal(objeto3);
        samsonite.agregarNodoAlFinal(objeto4);
        samsonite.verMochila();
        if(samsonite.esVacia())
            System.out.println("Mochila vacia");
        else
            System.out.println("Mochila no esta vacia");
        System.out.println("Cantidad de objetos en nuestra mochila: " + samsonite.cantidad());
        System.out.println("Borramos el ultimo objeto");
        samsonite.borrarFinal();
        samsonite.verMochila();
        System.out.println("Borramos el primer objeto");
        samsonite.borrarInicio();
        samsonite.verMochila();
        System.out.println("Cantidad de objetos en nuestra mochila: " + samsonite.cantidad());
        System.out.println("El ultimo objeto de la mochila es: " + samsonite.verUltimo());
        System.out.println("El primer objeto de la mochila es: " + samsonite.verPrimero());
        
    }
}
