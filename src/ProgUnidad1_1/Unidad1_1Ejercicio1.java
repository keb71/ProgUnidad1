package ProgUnidad1_1;
//Ejecicio 1 unidad 1
	/*(Aritmética) Escriba una aplicación que pida al usuario que escriba
	dos números, que obtenga los números del usuario e imprima la suma, 
	producto, diferencia y cociente (división) de los números.*/
import java.util.Scanner; // el programa usa la clase Scanner
public class Unidad1_1Ejercicio1 {
	

	
		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);
			int num1;
			int num2;
			int suma;
			int producto;
			int diferencia;
			int division;
			System.out.print("Escriba un numero entero: \n"); // indicador
				 num1 = entrada.nextInt(); // lee el primer número del usuario
			System.out.print("Escriba el segundo entero: \n"); // indicador
				 num2 = entrada.nextInt(); // lee el segundo número del usuario
				// suma los números, después almacena el total en suma
				
				suma = num1 + num2;				
				 // muestra la suma
			System.out.printf("La suma es " + suma + "\n");		  
			   producto = num1 * num2;
				 // muestra la producto	
			System.out.printf("La multiplicación es " + producto + "\n"); 
			diferencia = num1 - num2;
				 // muestra la diferencia
			System.out.printf("La resta es " + diferencia + "\n"); 
				 division = num1 / num2;
				 // muestra la division
			System.out.printf("La división es " + division + "\n"); 
		}
	}
	/*
	Esto es lo que imprime

	Escriba un numero entero: 4
	Escriba el segundo entero: 2
	La suma es 6
	La multiplicaci?n es 8
	La resta es 2
	La divisi?n es 2
	*/

