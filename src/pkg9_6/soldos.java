
package pkg9_6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class soldos {
    public void soldos(){
        Scanner sc= new Scanner(System.in);
        double soldo,i,z=0,q=0,w=0,porcentaje;
            System.out.println("introduzca soldo");
            soldo=sc.nextDouble();
            while(soldo!=0){
            
            for(i=0;i<10;i++){
                while(soldo!=0){
                 System.out.println("introduzca soldo");
            soldo=sc.nextInt();
              
            if(soldo>=1000&&soldo<=1750)
                z++;
            else if (soldo<1000&&soldo>0)
           q++;
            
            else if(soldo>1750)
            w++;
            
            else {
        
}
            }
         
}
            DecimalFormat df= new DecimalFormat("#.00");
            
            porcentaje=q/(z+q+w)*100;
            System.out.println("porcentaje = a "+df.format(porcentaje)+"%");
}
}
}