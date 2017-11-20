/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_5;

import java.util.Scanner;

/**
 *
 * @author agonzalezgonzalez
 */
public class switchc {
    public void Swt(){
        calculo1 c1=new calculo1();
        calculo2 c2=new calculo2();
        calculo3 c3=new calculo3();
    Scanner sc= new Scanner(System.in);
        System.out.println("Seleccione opcion: \n 1 para la serie 1\n 2 para la serie 2\n 3 para la serie 3");
    int op=sc.nextInt();
    switch(op){
        case 1:
            c1.calculo1();
            break;
        case 2:
            c2.calculo2();
             break;
        case 3:    
            c3.calculo3();
             break;
        default: System.out.println("erro");
}
}
}