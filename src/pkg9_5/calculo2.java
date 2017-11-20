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
public class calculo2 {
    public void calculo2(){
    Scanner sc=new Scanner(System.in);
    System.out.println("introduzca numero de elementos");
    int num,z=sc.nextInt();
    for(num=1;num<=z;num++){
        
        if(num%2==0){
            System.out.print("+"+num);
            
        }
            else {
            System.out.print("-"+num);
            
        }
    }
    }
}
