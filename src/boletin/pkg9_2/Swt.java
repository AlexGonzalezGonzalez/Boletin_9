/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9_2;

import java.util.Scanner;

/**
 *
 * @author agonzalezgonzalez
 */
public class Swt {
    public void Swt(){
        suma sum=new suma();
        producto prod=new producto();
        int op;
        Scanner sc= new Scanner(System.in);
        System.out.println("Seleccione la operacion a efectuar: 1-->Suma 2-->Producto");
        op=sc.nextInt();
        
        switch (op){
            
            case 1: 
                sum.Suma();
                break;
            case 2: 
                prod.producto();
                break;
}
}
}