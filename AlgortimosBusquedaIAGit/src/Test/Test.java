/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Negocio.Arboles;
import Negocio.NodoBinario;
import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;
import java.util.Stack;



/**
 *
 * @author usuario
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Ingrese el metodo a usar");
        System.out.println("1.  Busqueda a lo ancho");
        System.out.println("2.  Busqueda de profundidad");
        System.out.println("3.  Algortimo de busqueda Iterativa");
        Scanner leer = new Scanner(System.in);
        int opc = leer.nextInt();
        NodoBinario arboldebusqueda = (NodoBinario) new Arboles().crearArbol1();
        Stack <NodoBinario> piladebusqueda = new Stack();
         boolean tienehijos (NodoBinario nb){
            if(nb.getDer()==null){
                if(nb.getIzq()==null){}
            }
            return true;
        
        }
        switch(opc){
            case 1:
            System.out.println("Ingrese la letra a buscar");
            String buscar = leer.nextLine();
                piladebusqueda.push(arboldebusqueda);
                piladebusqueda.push((NodoBinario)arboldebusqueda.getDer());
                piladebusqueda.push((NodoBinario)arboldebusqueda.getIzq());
                
                if (piladebusqueda.peek().getValor().equals(buscar)){
                    System.out.println("Se halló el elemento en el arbol: " + piladebusqueda.peek().toString()); ;
                }else{
                while (!piladebusqueda.isEmpty()) {                    
                    
                    if(piladebusqueda.pop().getValor().equals(buscar)){
                        System.out.println("Se halló el elemento en el arbol: " + piladebusqueda.peek().toString()); ;
                    }else{
                    piladebusqueda.push((NodoBinario)arboldebusqueda.getDer());
                    }
                    
                 }
                }
                
                 
               
                
                break;
                
            case 2:
                System.out.println("Ingrese el valor a buscar");
                break;
            case 3:
                System.out.println("Ingrese el valor a buscar");
                break;
            }
        
        
        }
        
                
                
    
}
