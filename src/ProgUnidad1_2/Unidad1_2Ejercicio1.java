package ProgUnidad1_2;
//Ejercicio 11 Unidad 1
/*
Pedir una nota de 0 a 10 y que muestre el mensaje de la denominación 
de la calificación según:
  
  * Nota = 5: "SUFICIENTE"
  * Nota = 6: "BIEN"
  * Nota < 5: "INSUFICIENTE"
  * Nota = 7,8: "NOTABLE"
  * Nota = 9 : "SOBRESALIENTE"
  * Nota = 10: "MATRÍCULA DE HONOR"
*/
import java.util.Scanner;
public class Unidad1_2Ejercicio1 {
	
	public static void main(String[] args){
	float num;
	Scanner entrada = new Scanner(System.in);

	System.out.println("Escriba la nota: \n");
	num = entrada.nextFloat();

	if(num >= 5 && num < 6){
	System.out.println("'SUFICIENTE'" + num);
	}
	if(num >=6 && num < 7.8){
	System.out.println("'BIEN'" + num);
	}
	if(num < 5){
	System.out.println("'INSUFICIENTE'" + num);
	}
	if(num >=7.8 && num < 8){
	System.out.println("'NOTABLE'" + num);
	}
	if(num >=9 && num < 10){
	System.out.println("'SOBRESALIENTE'" + num);
	}
	if(num == 10){
	System.out.println("'MATRÍCULA DE HONOR'" + num);
	}
	}
	}

