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
public class Objeto 
{
    private int dato;
    private Objeto siguiente;

    public Objeto(int dato) 
    {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Objeto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Objeto siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
