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
public class Mochila implements IMochila
{

    Objeto inicio;
    int cantidad = 0;

    public Mochila() 
    {
        this.inicio = null;
    }
    
    
    
    @Override
    public void agregarNodoAlInicio(Objeto unObjeto) 
    {
        unObjeto.setSiguiente(this.inicio);
        this.inicio = unObjeto;
        cantidad++;
    }

    @Override
    public void agregarNodoAlFinal(Objeto unObjeto) 
    {
        if(esVacia())
            agregarNodoAlInicio(unObjeto);
        else
        {
            Objeto auxiliar = this.inicio;
                while(auxiliar.getSiguiente() != null)
                {
                    auxiliar = auxiliar.getSiguiente();
                }
                auxiliar.setSiguiente(unObjeto);
        }
    }

    @Override
    public boolean esVacia() 
    {
        if(this.inicio == null)
            return true;
        else
            return false;
    }

    @Override
    public void borrarFinal() 
    {
        if(esVacia())
            System.out.println("Lista vacia, no se puede borrar.");
        else
        {
            Objeto auxiliar = this.inicio;
            while(auxiliar.getSiguiente().getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(null);
            cantidad--;
        }
        
    }

    @Override
    public void borrarInicio() 
    {
        if(esVacia())
            System.out.println("Lista vacia, no se puede borrar.");
        else
        {
            Objeto auxiliar = this.inicio;
            this.inicio = auxiliar.getSiguiente();
            cantidad--;
        }
    }

    @Override
    public Objeto verUltimo() 
    {
        if(esVacia())
            return null;
        else
        {
            Objeto auxiliar = this.inicio;
            while(auxiliar.getSiguiente() != null )
            {
            auxiliar = auxiliar.getSiguiente();
            }
            return auxiliar;
        }
    }

    @Override
    public Objeto verPrimero() 
    {
        if(esVacia())
        {
            return null;
        }
        else
        {   
            Objeto auxiliar = this.inicio;
            return auxiliar;
        }
    }

    @Override
    public int cantidad() 
    {
        return cantidad;
    }

    @Override
    public void verMochila() 
    {
        Objeto auxiliar = this.inicio;
        System.out.println("OBJETOS EN MOCHILA: ");
                while(auxiliar != null)
                {
                    System.out.print("["+auxiliar.getDato()+"]-->");
                    auxiliar = auxiliar.getSiguiente();
                }
                System.out.println("");
    }

    private boolean pertenece(Objeto unObjeto, Objeto inicio)
    {
        if(inicio == null)
            return false;
        if(unObjeto.getDato() == inicio.getDato() )
            return true;
        else
            return pertenece(unObjeto,inicio.getSiguiente());    
    }
    
    @Override
    public boolean pertenece(Objeto unObjeto) 
    {
        return pertenece(unObjeto,this.inicio);
    }
    
}
