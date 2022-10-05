/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;
import java.util.ArrayList;

/**
 *
 * @author aniba
 */
public class Testarrays {
    static Persona [] [] MatriPer = new Persona [2] [2];
    static int numeros[]=new int[3];
    public static void main(String[] args) {
        //declarar mi array de numeros de 3 elementos de tipo entero
        Integer numeros[]=new Integer[3];
        
        //imprimir por pantalla el array
        System.out.println("numeros: "+numeros);
        
        numeros [0]= 15;
        numeros[1]= 3;
        numeros[2]=5;
        
        for (int i=0;i<3;i++){
            System.out.println("numeros["+i+"] = "+numeros[i]);
        
        }
        
        Persona p1=new Persona("Juan","Rodriguez","fnudshfsu");
        Persona p2=new Persona("jose","Rodriguez","adadad");
        Persona p3=new Persona("pepe","Prieto","gfdgdsaf");
        Persona p4=new Persona("Antonio","Rez","adhghghd");
        Persona p5=new Persona("Fede","ddso","gfasdaddsaf");
        
        ArrayList<Persona> lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        System.out.println("Personas: ");
        for (Persona j : lista){
            System.out.println(j.toString());
        }
        
        
        //Matriz con empleados
        
        
        MatriPer [0][0]= p1;
        MatriPer [0][1]= p2;
        MatriPer [1][0]= p4;
        MatriPer [1][1]= p5;
        for (int i = 0; i < MatriPer.length; i++) {
            for (int j = 0; j < MatriPer.length; j++) {
                System.out.println("Personas [" + i + "] ["+ j + "] = " +MatriPer [i][j]);
                
            }
            
        }
        
        
        
        
        //llamamos al metodo imprimir tanto mi listado de numeros enteros como mi listado de personas
        System.out.println("Imprimiendo numeros: ");
        imprimir(numeros);
        System.out.println("Imprimiendo perosnas");
        //imprimir(lista);
        //no deja imprimir la lista de personas ya que un arrays no puede ser object
        //Imprimiendo numeros con metodos de arg variables
        imprimirNumeros(1,2,4);
        System.out.println("Segunda llamada con 2 arg: ");
        imprimirNumeros(3,7);
        
    }
    //metodo imprimir edades y personas
    //declarar edades y personas como variables estaticas
    public static void imprimir(Object lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("lista["+ i + "] = "+ lista [i]);
            
        }
        
        
    }
    public static void imprimirNumeros(int... numeros){
        System.out.println("cantidad de numeros: "+numeros.length);
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Numero[ =" +i + "] = "+ numeros[i]);
            
            
            
        }
  
        
        
        
    }
    
}
