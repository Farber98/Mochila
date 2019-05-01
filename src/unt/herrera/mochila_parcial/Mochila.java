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
    private Objeto inicio;
    private int cantidad = 0;

    public Mochila() 
    {
        this.inicio = null;           //Constructora vacia  
    }

    
    
    @Override
    public void agregarNodoAlInicio(Objeto unObjeto) 
    {
        unObjeto.setSiguiente(this.inicio);
        this.inicio = unObjeto;
        cantidad++; 
    }

    @Override
    public void agregarNodoAlFinal(Objeto unObjeto) {
        if(esVacia())
            agregarNodoAlInicio(unObjeto);
        else
        {
            Objeto auxiliar = inicio;
            while(auxiliar.getSiguiente()!=null)
            {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(unObjeto);
        }
        cantidad++;
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
    public int cantidad() 
    {
        return cantidad;
    }
    

    @Override
    public void borrarFinal() 
    {
        if(esVacia())
        {
            System.out.println("No se pudo borrar porque no hay nada.");
        }
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
        {
            System.out.println("No se pudo borrar porque no hay nada.");
        }
        else
        {
            Objeto auxiliar = this.inicio;
            auxiliar.setSiguiente(auxiliar.getSiguiente());
            this.inicio = auxiliar.getSiguiente();
            cantidad--;
        }
    }

    @Override
    public Objeto verUltimo() 
    {
        if(esVacia())
        {
            System.out.println("No hay ningun objeto en la mochila");
            return null;
        }
        else
        {
            Objeto auxiliar = this.inicio;
            while(auxiliar.getSiguiente()!= null)
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
            System.out.println("Lista vacia, no se puede mostrar \n");
            return null;
        }
        else
        {
            Objeto auxiliar = this.inicio;
            return auxiliar;
        }
    }
    
    @Override
    public void verMochila()
    {
        if(esVacia())
            System.out.println("Lista vacia, no se puede mostrar \n");
        else
        {
            Objeto auxiliar = this.inicio;
            while(auxiliar != null)         //MUY IMPORTANTE SINO NO MUESTRA TODOS.
            {
                System.out.print("[" + auxiliar.getDato() + "]" + "-->");
                auxiliar = auxiliar.getSiguiente();
            }
            System.out.println("");
        }
    }
    
    @Override
    public boolean pertenece(Objeto unObjeto)
    {
        if(esVacia())
            return false;
        else
        {
            Objeto auxiliar = this.inicio;
            while(auxiliar.getSiguiente() != null)
            {
                if(auxiliar.getDato() == unObjeto.getDato())
                {
                    return true;
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }
        
        return false;
    }

    @Override
    public Mochila juntarMochilas(Mochila unaMochila, Mochila otraMochila) 
    {
        Objeto auxiliar = unaMochila.inicio;
        while(auxiliar.getSiguiente() != null)
        {
            auxiliar = auxiliar.getSiguiente();
        }
        auxiliar.setSiguiente(otraMochila.inicio);
        return unaMochila;
    }
    
    
    
    
}
   
