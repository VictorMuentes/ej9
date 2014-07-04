/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej9;

import java.util.Scanner;

/**
 *
 * @author V1C70R MU3N735
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
         int valor=0,cont=0;
        for (int i = 0; i < 2; i++) 
        {
            System.out.println("Ingrese Valor Positivo");
            valor=entrada.nextInt();
            if (valor>0)
            {
                i=2;
            }
            else
            {
                i=0;
                System.out.println("Debe de Ingresar Valores Enteros Positivos es Decir Numeros Mayores a 0");
                
            }  
        }        
        long[] arreglo=new long[valor];
        for (int i = 0; i < arreglo.length; i++) 
        {
            arreglo[i]=i*i;           
        }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (valor==arreglo[i])
            {
                i=arreglo.length;
                cont=1;
            }
        }
        if (cont==1 || valor==1)
        {
            System.out.println("TRUE");
       
        }
        else
        {
            System.out.println("FALSE");
    
        }        
    
    }
    
}
