package ProgUnidad1;
//Ejercicio 2_13
/* Indique el orden de evaluación de ls operadores en cada una de las
 siguientes instrucciones en Java y muestre el valor de x despues de 
 ejecutar cada una de ellas
 */

public class Unidad1Ejercicio2_13 {

		public static void main(String[] args){
		System.out.print("a)x = 7 + 3 * 6 / 2 - 1 \n x =  ");
		System.out.print(7 + ((3 * 6)/ 2) - 1)  ;

	    System.out.print("\nb)x = 2 % 2 + 2 * 2 - 2 / 2 \n x =  ");
		System.out.print((2 % 2) + (2 * 2) - (2 / 2)) ;
		
		System.out.print("\nc)x = (3 * 9 * (3 + (9 * 3 / (3)))) \n x =  ");
		System.out.print(3 * 9 * (3 + (9 * 3 / (3)))) ;
		}
	}
	/*
	a)x = 7 + 3 * 6 / 2 - 1 
	 x =  15
	b)x = 2 % 2 + 2 * 2 - 2 / 2 
	 x =  3
	c)x = (3 * 9 * (3 + (9 * 3 / (3)))) 
	 x =  324
	 */

