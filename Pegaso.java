/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Stack;

/**
 *
 * @author Alumno
 */
public class Pegaso {
    
    public void _1(){
        Stack pila= new Stack();
        pila.push("league of legends");
        pila.push("need for speed rivals");
        
        System.out.println("Nombres:"+pila);
        System.out.println("tamaño pila: "+pila.size());
        System.out.println("cima: "+pila.peek());
        System.out.println("pocicion de elementos: "+pila.search("need for speed rivals"));
        System.out.println("pocicion de elementos: "+pila.search("hola"));
        System.out.println("Elementos des-apilados: "+pila.pop());
        System.out.println("¿Esta la pila vacia?: "+pila.empty());
        
        System.out.println("=======================");
    }
    public void _2(){
        Stack pila = new Stack();
        
        pila.push(7.0);
        pila.push(4.0);
        pila.push(7.0);
        pila.push(5.0);
        pila.push(6.0);
        
        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.get(i));
        }
        System.out.println("=======================");
    }
    public void _3(){
        Stack pila = new Stack();
        
        pila.push(7.0);
        pila.push(4.0);
        pila.push(7.0);
        pila.push(5.0);
        pila.push(6.0);
        for (Object a : pila) {
            System.out.println(a);
            
        }
        
    }
}
