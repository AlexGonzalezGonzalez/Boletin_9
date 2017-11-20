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
public class calculo1 {
    Scanner sc= new Scanner(System.in);
    public void calculo1(){
    System.out.println("introduce numero de elementos da serie");
    int num=1,z=sc.nextInt(),calc;
        System.out.println("2");
    for(num=2;num<=z;num++){
       calc=num*2;
        System.out.print("+"+calc);
        
    }
}
}

