
package pkg9_5;

import java.util.Scanner;

public class calculo3 {
    public void calculo3(){
    Scanner sc= new Scanner(System.in);
    int num1=0,num2=1,num3,z,i;
        System.out.println("numero de elementos de la serie");
        z=sc.nextInt();
        for(i=0;i<z;i++){
            System.out.print("+"+num1);
            num3=num1+num2;
            num1=num2;
            num2=num3;
        
}
}
}