
package pkg9_3;

import java.util.Scanner;

public class rectangulo {
    public void area(){
    Scanner sc= new Scanner(System.in);
    int b,h,area;
        
    do{
    System.out.println("Introduzca base");
    b= sc.nextInt();
    
    }
    while (b<=0);
    
        if (b>0){
    do{        
    System.out.println("Introduzca altura");
    h=sc.nextInt();
   
    }
    while (h<=0);
        if (h>0){
        area=b*h;
        System.out.println("La area es de "+area);
        }
         
            
            }      
         
        
    
        

    
    }
}
