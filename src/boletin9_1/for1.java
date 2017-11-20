/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author agonzalezgonzalez
 */
public class for1 {
    public void cFor(){
        
        Scanner sc = new Scanner(System.in);
        
    int positivo=0,negativo=0,cero=0,i,a;
    for(i=0;i<10;i++){
        System.out.println("Introduzca numero");
        a=sc.nextInt();
        if (a>0)
            positivo++;
        else if (a==0)
            cero++;
        else 
            negativo++;
        
            
        
}
    System.out.println(positivo+" son positivos");
        System.out.println(cero+" son nulos");
        System.out.println(negativo+" son negativos");
    
    
}
    
}