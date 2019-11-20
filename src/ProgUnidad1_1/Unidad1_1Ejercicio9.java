package ProgUnidad1_1;
// Ejercicio 9 Unidad 1
/*
(Múltiplos) Escriba una aplicación que lea dos enteros, determine si 
el primero es un múltiplo del segundo e imprima el resultado. 
[Sugerencia: use el operador residuo].
*/

import java.util.Scanner;
public class Unidad1_1Ejercicio9 {

		public static void main(String[] args){
		int num1;
		int num2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba un numero: \n");
		num1 = entrada.nextInt();
		
		System.out.println("Escriba otro numero: \n");
		num2 = entrada.nextInt();
		
		if(num1 %num2 == 0){
		System.out.println(num1 + "es multiplo de" + num2);
		}
		if(num1 %num2 != 0){
		System.out.println(num1 + " no es multiplo de " + num2);
		} 
		}
	}

