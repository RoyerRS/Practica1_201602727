
package buscaminas_201602727;

import java.io.IOException;
import java.util.Scanner;

public class Buscaminas_201602727 {
    

    public static void main(String[] args) throws IOException {
        
      Scanner o = new Scanner(System.in);
        char entrar;
        int a; 
        int opcion;
        
        for(;;){
        System.out.println("Nombre:Rovin Royer Riquiac Salvador");
        System.out.println("Carne:201602727");
        System.out.println("IPC1 A Practica 1");
        System.out.println("Buscaminas");
        System.out.println("Presionar enter:");
        
        entrar = (char)System.in.read();
            System.out.println("=======================");
            System.out.println("BUSCAMINAS!!!");
            System.out.println("1. Principiante");
            System.out.println("2. Intermedio");
            System.out.println("3. Experto");
            System.out.println("4. Salir");
            System.out.println("Seleccione opcion:");
            System.out.println("");
            
            System.out.println("=======================");
            a = o.nextInt();
           
   switch(a){
            case 1:
                
            char ast;   
            System.out.println("Nivel Principiante");
            
            clase1_201602727 abc = new clase1_201602727(4,4); 
            abc.imprimirtablero();
            
            System.out.println("Voltear: V");
            System.out.println("Reiniciar: R");
            System.out.println("Salir: S");
            ast = (char)System.in.read();
             
             switch(ast){
            
                case 'V':
                    break;
                case 'R':
                    break;
                case 'S':
                
                System.exit(0);
                    break;        
            }
                 break;
            case 2:
                char bst;
                
            System.out.println("Nivel Intermedio");
            
            clase1_201602727 bbc = new clase1_201602727(6,6); 
            bbc.imprimirtablero();
            
            System.out.println("Voltear: V");
            System.out.println("Reiniciar: R");
            System.out.println("Salir: S");
            System.out.println("Seleccione f y C:");
            bst = (char)System.in.read();
                switch (bst){
                
                }
                break;
            case 3:
                   char cst;
                
            System.out.println("Nivel Avanzado");
            
            clase1_201602727 cbc = new clase1_201602727(8,8); 
            cbc.imprimirtablero();
            
            System.out.println("Voltear: V");
            System.out.println("Reiniciar: R");
            System.out.println("Salir: S");
            
            cst = (char)System.in.read();
                switch (cst){
                
                }
                break;
            case 4:
                System.exit(0);
                break;
       
        }
        }
 
        }
}
    
