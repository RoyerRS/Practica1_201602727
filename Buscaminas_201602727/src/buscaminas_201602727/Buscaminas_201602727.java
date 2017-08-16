
package buscaminas_201602727;

import java.util.Scanner;

public class Buscaminas_201602727 {

    public static void main(String[] args) {
        
      Scanner o = new Scanner(System.in);
        int b;    
        do{
        System.out.println("1.Nombre:Rovin Royer Riquiac Salvador");
        System.out.println("2.Carne:201602727");
        System.out.println("3.IPC1 A Practica 1");
        System.out.println("4.Buscaminas");
         b = o.nextInt();
         }while(b>4); 
   switch(b){
            case 1:
                clase1 in = new clase1();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
       
        }
}
}
