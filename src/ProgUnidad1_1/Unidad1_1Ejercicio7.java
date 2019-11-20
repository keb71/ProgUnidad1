package ProgUnidad1_1;
// Ejercicio 7 Unidad 1
/*
(Comparación de enteros) Escriba una aplicación que pida al usuario que 
escriba dos enteros, que obtenga los números del usuario y muestre el 
número más grande, seguido de las palabras “es más grande”.
Si los números son iguales, imprima el mensaje “Estos números son
iguales”.
*/
import java.util.Scanner; //el programa usa la clase scanner
public class Unidad1_1Ejercicio7 {
	
		public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		int num1;
		int num2;
		System.out.println("Escriba un numero entero: \n");
			num1 = entrada.nextInt();
		System.out.println("Escriba el segundo numero entero: \n");
			num2 = entrada.nextInt();

		if(num1 > num2){
			System.out.println(num1 + "es más grande");
			}
		if(num1 < num2){
				System.out.println(num2 + "es mas grande");
			}
		if(num1 == num2){
			System.out.println("estos numeros son iguales");
			}
		
		}
	}

