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
public interface IMochila 
{
    public void agregarNodoAlInicio(Objeto unObjeto);
    
    public void agregarNodoAlFinal(Objeto unObjeto);
    
    public boolean esVacia();
    
    public void borrarFinal();
    
    public void borrarInicio();
    
    public int verUltimo();
    
    public int verPrimero();
    
    public int cantidad();
    
    public void verMochila();
    
}
