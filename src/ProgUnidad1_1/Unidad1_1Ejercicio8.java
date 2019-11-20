package ProgUnidad1_1;
//Ejercicio 8 unidad1
/*
(Par o impar) Escriba una aplicación que lea un entero y que determine 
e imprima si es impar o par [sugerencia: use el operador residuo. 
Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un 
residuo de 0 cuando se divide entre 2]
*/
import java.util.Scanner;
public class Unidad1_1Ejercicio8 {

		public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		int num;
		System.out.println("Escriba un numero: \n");
		num = entrada.nextInt();
		if (num %2 == 0){
		System.out.println("El numero es par: " + num);
		}
		if(num %2 !=0){
		System.out.println("El numero es impar: " + num);
		}
		}
	}

