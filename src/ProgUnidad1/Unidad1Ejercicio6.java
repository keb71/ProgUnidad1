package ProgUnidad1;
//Ejercicio 6 Unidad 1


	//a) Este programa calculara el producto de tres enteros
//b) importo el programa de Scanner para crear el objeto 
	import java.util.Scanner;
public class Unidad1Ejercicio6 {

		public static void main(String[] args){

	//b) Creo el objeto Scanner
	Scanner entrada = new Scanner(System.in);

	//c) Declarar las variables x, y, z y resultado de tipo int.
	int x;
	int y;
	int z;

	//d) Pedir al usuario que escriba el primer entero.
		System.out.println("Escriba el primer entero: ");
	//e) Leer el primer entero del usuario y almacenarlo en la variable x.
	                 x = entrada.nextInt();  
	//f) Pedir al usuario que escriba el segundo entero.
			System.out.println("Escriba el segundo entero: ");
	//g) Leer el segundo entero del usuario y almacenarlo en la variable y.
	    		y = entrada.nextInt();
	//h) Pedir al usuario que escriba el tercer entero.
			System.out.println("Escriba el tercer entero: ");
	//i) Leer el tercer entero del usuario y almacenarlo en la variable z.
			z = entrada.nextInt();
	//j) Calcular el producto de los tres enteros contenidos en las variables x, y y z, y asignar el
	//resultado a la variable resultado.
			int resultado = x * y * z;
	//k) Usar System.out.printf para mostrar el mensaje “El producto es”, seguido del valor de la
	//variable resultado
			System.out.printf("El producto es %f " + resultado); 
			
					}
		}

