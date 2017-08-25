
package buscaminas_201602727;

import java.util.Random;
import java.util.Scanner;


public class clase1_201602727 {
public int fila = 0;
public int columna =0;
public int mina = 0;
public char tablero [][];
public char tablero2 [][];  
public int m1;
public int m2;



public clase1_201602727(int fila, int mina){
  this.fila=fila;
  this.columna=fila;
  this.mina= mina; 
  tablero = new char[fila][columna];
  tablero2 = new char[fila][columna];
  for(int i=0; i<fila; i++ ){  
      for(int j=0; j<columna; j++ ){
       tablero2 [i][j]='x';
       
      }
}
      for( int i=0; i<fila; i++){
          for(int j=0; j<columna; j++){
          tablero [i][j]='x';
          
          }
      
      }

}

public void imprimirtablero(){
  
    for(int i=0; i<fila; i++){
        for(int j=0; j<columna; j++){
                if(j==columna){
                
                    System.out.println("["+ tablero [i][j] +"]");
                } else{
                    System.out.print("["+ tablero [i][j] +"]"); 
                }
        } 
        System.out.println();
        }
}
       public static int aleatorio(int a) {
           Random aleatorio = new Random();
           int z= (int) (Math.random() * a);
           return z;
                
 }
     public void Gminas(){
         boolean full = false;
        int l = 0;
        out:
        while (l <= mina) {
            for (int i = 1; i < fila; i++) {
                for (int j = 1; j < columna; j++) {
                    int mina = aleatorio(columna);
                    if ((j == mina) && (tablero[i][j] == 'x') && (i != m1 && j != m2)) {
                        tablero[i][j] = '*';
                        ++i;
                        if (l == mina) {
                            break out;
                        }
                    }
                }
            }
        }
 
   

}
      public void checkMinas() {
        int count = 0;
        for (int n = 2; n <= tablero.length - 2; ++n) {
            for (int o = 2; o <=tablero[0].length - 2; ++o) {
                count = 0;
                if ((tablero[n + 1][o + 1] == '*') && (tablero[n][o] == 'x')) {
                    ++count;
                }
                if ((tablero[n - 1][o - 1] == '*') && (tablero[n][o] == 'x')) {
                    ++count;
                }
                if ((tablero[n - 1][o + 1] == '*') && (tablero[n][o] == 'x')) {
                    ++count;
                }
                if ((tablero[n + 1][o - 1] == '*') && (tablero[n][o] == 'x')) {
                    ++count;
                }
                if ((tablero[n - 1][o] == '*') && (tablero[n][o] == 'x')) {
                    ++count;
                }
                if ((tablero[n + 1][o] == '*') && (tablero[n][o] == 'x')) {
                    ++count;
                }
                if ((tablero[n][o + 1] == '*') && (tablero[n][o] == 'x')) {
                    ++count;
                }
                if ((tablero[n][o - 1] == '*') && (tablero[n][o] == 'x')) {
                    ++count;
                }
                if (tablero[n][o] == 'x') {
                    if (count > 0) {
                        tablero[n][o] = Integer.toString(count).charAt(0);
                    } else if (count == 0) {
                        tablero[n][o] = Integer.toString(count).charAt(0);
                    }
                }
            }
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (tablero[i][j] == 'x') {
                    tablero[i][j] = Integer.toString(0).charAt(0);
                }
            }
        }
    }
     
    public void introMovim() {
        Scanner leer = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {

            System.out.println("Introduce tu movimiento!");
            System.out.print("Introduce la fila ");
            m1 = leer.nextInt();
            System.out.print("Introduce la columna ");
            m2 = leer.nextInt();
            System.out.println("");
            if ((m1 < fila && m2 < columna) && (m1 > 0 && m2 > 0)) {
                valid = true;
            } else {
                valid = false;
            }

        }
    }   
}