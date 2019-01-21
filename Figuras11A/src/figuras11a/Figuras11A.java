package figuras11a;
import java.util.*;
/**
 * Figuras11A
 * Programa que muestre las siguiente figura
 *       *
 *      ***
 *     *****
 *    *******
 *   *********      la altura se lee por teclado
 */
public class Figuras11A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int filas, i, j, k, asteriscos;
        do{
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        }while(filas<=0);
        asteriscos=1; // Esta variable contiene el número de asteriscos que se escriben en cada fila
	for(i=1;i<=filas;i++){  // Total de filas de la pirámide. Para cada fila.....
	    for(j=1;j<=filas-i;j++){  // Escribimos primero los blancos. En cada fila i hay filas-i blancos
		System.out.print(" ");
	    }
	    for(k=1;k<=asteriscos;k++){       // A continuación escribimos los asteriscos. En la primera fila hay solo uno
		System.out.print("*");
            }
            asteriscos+=2; // en cada fila hay 2 asteriscos más que en la anterior
	    System.out.println();//Salto de línea
	}
    }
}
