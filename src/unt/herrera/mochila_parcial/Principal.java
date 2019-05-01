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
        
        Mochila samsonite = new Mochila();      //Mochila 1
        
        Mochila reebok = new Mochila();         //Mochila 2
        
        Mochila reebokAndSamsonite = new Mochila(); //Mochila resultante
        
        Mochila adidas = new Mochila();         //Mochila para probar funciones como USUARIO ADT.
        
        Objeto objeto1 = new Objeto(1);
        Objeto objeto2 = new Objeto(2);
        Objeto objeto3 = new Objeto(3);
        Objeto objeto4 = new Objeto(4);
        Objeto objeto5 = new Objeto(5);
        Objeto objeto6 = new Objeto(6);
        Objeto objeto7 = new Objeto(7);
        Objeto objeto8 = new Objeto(8);
        Objeto objeto9 = new Objeto(9);
        Objeto objeto10 = new Objeto(10);
        Objeto objeto11 = new Objeto(11);
        Objeto objeto12 = new Objeto(12);
        Objeto objeto13 = new Objeto(13);
        Objeto objeto14 = new Objeto(14);
        
        System.out.println(":::::::::::: MOCHILA 1 :::::::::: ");
        
        //Rellenamos mochila 1 y probamos los metodos.
        
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
        System.out.println("El ultimo objeto de la mochila es: " + samsonite.verUltimo().getDato());
        System.out.println("El primer objeto de la mochila es: " + samsonite.verPrimero().getDato());
        System.out.println("Agregamos dos objetos al final");
        samsonite.agregarNodoAlFinal(objeto5);
        samsonite.agregarNodoAlFinal(objeto6);
        samsonite.verMochila();
        if(samsonite.pertenece(objeto5))
            System.out.println("El objeto " + "[" +objeto5.getDato() + "] " + "SI pertenece a la mochila");
        else
            System.out.println("El objeto " + "[" +objeto5.getDato() + "] " + "NO pertenece a la mochila");
        if(samsonite.pertenece(objeto8))
            System.out.println("El objeto " + "[" +objeto8.getDato() + "] " + "SI pertenece a la mochila");
        else
            System.out.println("El objeto " + "[" +objeto8.getDato() + "] " + "NO pertenece a la mochila");    
        
        System.out.println("");
        System.out.println(":::::::::::: MOCHILA 2 :::::::::: ");
        
        //Rellenamos mochila 2 para probar el juntar mochilas.
        
        System.out.println("Agregamos tres objetos");
        reebok.agregarNodoAlInicio(objeto7);
        reebok.agregarNodoAlFinal(objeto8);
        reebok.agregarNodoAlFinal(objeto9);
        reebok.verMochila();
        
        
        
        System.out.println("");
        System.out.println(":::::::::::: Juntamos MOCHILA 1 y MOCHILA 2 :::::::::: ");
        
        //Juntamos las mochilas
        
        reebokAndSamsonite = samsonite.juntarMochilas(samsonite, reebok);
        reebokAndSamsonite.verMochila();
        
        
        
        //Implementamos funciones como usuario del ADT.     //CUANDO DESCOMENTO ESTO SE ARRUINA.
//        System.out.println("");
//        System.out.println(":::::::::::: COMO USUARIO :::::::::: ");
//        System.out.println("Agregamos objetos a la mochila");
//        adidas.agregarNodoAlInicio(objeto10);
//        adidas.agregarNodoAlInicio(objeto11);
//        adidas.agregarNodoAlInicio(objeto12);
//        adidas.agregarNodoAlInicio(objeto13);
//        adidas.agregarNodoAlFinal(objeto14);
//        adidas.verMochila();
//        System.out.println("Cantidad de objetos en nuestra mochila: " + adidas.cantidad());
//        cantIgual = cantidadIgualdades(adidas,objeto10);        //VER ERROR ACA.
//        System.out.println("El objeto " + "[" + objeto1.getDato() + "] " + "esta presente " + cantIgual + " veces en la mochila" );
    

        

    }
    
    static int cantIgual; 
    
    public static int cantidadIgualdades(Mochila moc, Objeto obj)       //VER ERROR EN ESTE METODO.
        {
            int coincidencias = 0 ;
            while(moc.cantidad()>0)
            {
                if(moc.verUltimo().getDato() == obj.getDato())    
                {
                    coincidencias ++;
                }
                
                moc.borrarFinal();
            }
            return coincidencias;
        }
    
//    public static boolean sonIguales(Mochila moc1, Mochila moc2)        //Chequear ERRORES. HACER MOCHILA LO VOID?
//    {
//        if(moc1.cantidad() == moc2.cantidad())
//        {
//            if(moc1.esVacia() && moc2.esVacia())
//                return true;
//            if(moc1.esVacia() || moc2.esVacia())
//                return false;
//            
//              if(moc1.pertenece(moc2.verUltimo()))
//              {
//                moc2.borrarFinal();
//                return sonIguales(moc1.borrarFinal(), moc2);
//              }
//              else
//                    return false;
//         }
//           else
//                return false;
//    }
//            
}
