package unt.herrera.mochila_parcial;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        Mochila nike = new Mochila();
        Mochila puma = new Mochila();
        
        Objeto obj1 = new Objeto(1);
        Objeto obj2 = new Objeto(2);
        Objeto obj3 = new Objeto(3);
        Objeto obj4 = new Objeto(4);
        Objeto obj5 = new Objeto(5);
        Objeto obj6 = new Objeto(6);
        Objeto obj7 = new Objeto(7);
        
        Objeto obj8 = new Objeto(1);
        Objeto obj9 = new Objeto(2);
        Objeto obj10 = new Objeto(3);
        Objeto obj11 = new Objeto(4);
        Objeto obj12 = new Objeto(5);
        Objeto obj13 = new Objeto(6);
        Objeto obj14 = new Objeto(7);
        
        System.out.println(":::::::::: MOCHILA 1 :::::::::::");
        if(nike.esVacia())
            System.out.println("VACIA");
        else
            System.out.println("TIENE ALGO");
        nike.agregarNodoAlInicio(obj1);
        if(nike.esVacia())
            System.out.println("VACIA");
        else
            System.out.println("TIENE ALGO");
        nike.agregarNodoAlInicio(obj2);
        nike.verMochila();
        nike.agregarNodoAlFinal(obj3);
        nike.agregarNodoAlFinal(obj4);
        System.out.println("La cantidad de objetos es: " + nike.cantidad());
        nike.verMochila();
        nike.borrarFinal();
        nike.verMochila();
        nike.borrarFinal();
        nike.verMochila();
        nike.borrarInicio();
        nike.verMochila();
        nike.borrarInicio();
        nike.verMochila();
        if(nike.pertenece(obj2))
            System.out.println("El objeto "+ obj2.getDato()+" SI pertenece");
        else
            System.out.println("El objeto "+ obj2.getDato()+" NO pertenece");
        nike.agregarNodoAlInicio(obj1);
        nike.agregarNodoAlInicio(obj2);
        nike.verMochila();
        if(nike.pertenece(obj2))
            System.out.println("El objeto "+ obj2.getDato()+" SI pertenece");
        else
            System.out.println("El objeto "+ obj2.getDato()+" NO pertenece");
        nike.agregarNodoAlInicio(obj3);
        nike.agregarNodoAlInicio(obj4);
        nike.verMochila();
        System.out.println("El primer objeto es: " + nike.verPrimero().getDato());
        System.out.println("El ultimo objeto es: " + nike.verUltimo().getDato());
        System.out.println("");
        System.out.println(":::::::::: MOCHILA 2 :::::::::::");
        puma.agregarNodoAlInicio(obj14);
        puma.agregarNodoAlInicio(obj13);
        puma.agregarNodoAlInicio(obj12);
        puma.agregarNodoAlInicio(obj11);
        puma.agregarNodoAlInicio(obj10);
        puma.agregarNodoAlInicio(obj9);
        System.out.println("");
        System.out.println(":::::::::: MOCHILA 2 :::::::::::");
        puma.verMochila();
        System.out.println(":::::::::::::::::::::UNION:::::::::::::::: ");
        union(nike,puma).verMochila();
    }
    
    public static Mochila union(Mochila uno, Mochila dos)
    {
        Objeto auxiliar1 = uno.inicio;
        Objeto auxiliar2 = dos.inicio;
        while(auxiliar1.getSiguiente()!= null)
        {
            auxiliar1 = auxiliar1.getSiguiente();
        }
        auxiliar1.setSiguiente(auxiliar2);
        return uno;
    }
}
