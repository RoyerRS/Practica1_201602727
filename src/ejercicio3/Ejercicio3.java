/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Dell
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu in = new Menu();
        
        while(true){
        
        System.out.println("1. Usuario");
        System.out.println("2. Palabras palindromas");
        System.out.println("3. Salir");
        int opcion = in.getInt("Elejir una opcion");
        opciones(opcion);
        }
        }
    public static void opciones(int opcion) {
        switch(opcion){
        
         case 1:
             
                System.out.println("Menu de usuario");
                System.out.println("1. Ingrese usuario");
                System.out.println("2. Mostrar todos los usarios");
                System.out.println("3. Mostrar un usuario personalizado");
                System.out.println("4. Menu principal");
                System.out.println("5. Salir");
               
                
            break;
            
         case 2:
               palindromas in = new palindromas();
            break;
            
          case 3:
               System.exit(0); 
            break;
        
        }
    }
    
       
    
}
