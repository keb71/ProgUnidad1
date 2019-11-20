package ProgUnidad1_1;
//Ejecicio 2 unidad 1
/*
(Aritmética: menor y mayor) Escriba una aplicación que reciba tres enteros del usuario y muestre la suma, 
promedio, producto, menor y mayor de esos números. 
*/
import java.util.Scanner; // el programa usa la clase Scanner
public class Unidad1_1Ejercicio3 {

		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);
			int numero1;
			int numero2;
			int numero3;
			int suma;
			int producto;
			int promedio;
		
			System.out.println("Escriba un numero entero: \n"); // indicador
				 numero1 = entrada.nextInt(); // lee el primer número del usuario
			System.out.println("Escriba el segundo entero: \n"); // indicador
				 numero2 = entrada.nextInt(); // lee el segundo número del usuario
			System.out.println("Escriba el tercer entero: \n"); // indicador
				 numero3 = entrada.nextInt(); // lee el segundo número del usuario
			
				// suma los números, después almacena el total en suma
				
				suma = numero1 + numero2 + numero3;				
				 // muestra la suma
			System.out.println("La suma es " + suma + "\n");		  
			  
			   producto = numero1 * numero2 * numero3;	
				 // muestra el producto	
			System.out.println("La multiplicación es " + producto + "\n"); 
				
				promedio = (numero1 + numero2 + numero3) / 3;
				 // muestra el promedio
			System.out.println("La promedio es " + promedio + "\n"); 
				
			if(numero1 < numero2){
				if(numero1 < numero3){
			    	System.out.println("El menor es: " + numero1);
				}else{
			    	System.out.println("El menor es: " + numero3);
				}
				}else if (numero2 < numero3){
			    	System.out.println("El menor es: " + numero2);
				}else{
			    	System.out.println("El menor es: " + numero3);
				}
			
			if(numero1 > numero2){
				if(numero1 > numero3){
				    System.out.println("El mayor es: " + numero1);
				}else{
				    System.out.println("El mayor es: " + numero3);
				}
				}else if (numero2 > numero3){
				    System.out.println("El mayor es: " + numero2);
				}else{
				    System.out.println("El mayor es: " + numero3);
				}
				 
			
		}
	}
	/*
	Esto es lo que imprime
	Escriba un numero entero: 

	Escriba el segundo entero: 

	Escriba el tercer entero: 

	La suma es 21

	La multiplicaci?n es 300

	La promedio es 7

	El menor es: 5
	El mayor es: 10

	*/

