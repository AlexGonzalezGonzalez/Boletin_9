
package pkg9_4;

import java.util.Scanner;

public class tabla {
    public void tabla(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero");
    int z=0,resultado,i,op=sc.nextInt();
    for(i=0;i<10;i++){
        resultado=op*z;
        System.out.println(op+" * "+z+" = "+resultado);
        z++;
}
}
}