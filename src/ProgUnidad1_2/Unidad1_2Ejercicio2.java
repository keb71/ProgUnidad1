package ProgUnidad1_2;
//Ejercicio 12 Unidad 1
/*
Pedir el día, mes y año (todos datos enteros) de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son
30 días. Los años parten desde el año 1, menores son incorrectos. 
*/
import java.util.Scanner;
public class Unidad1_2Ejercicio2 {

		public static void main(String[] args){
			
			int dia;
			int mes;
			int anio;
			
			
			Scanner entrada = new Scanner(System.in);
				
				System.out.println("Escria el dia, mes y año: ");
	                       
			
			dia = entrada.nextInt();
			mes = entrada.nextInt();
			anio = entrada.nextInt();
			
			if ( dia > 30 || dia < 1){
				System.out.println(" No es una fecha correcta " + dia +" - "+ mes +" - "+ anio);            
						
			   }	
				
	                else if (mes < 1 ||  mes > 12){
				System.out.println(" No es una fecha correta " + dia +" - "+ mes +" - "+ anio);
				
				}

	                else if (anio < 1 || anio > 2019){
				System.out.println(" No es una fecha correta " + dia +" - "+ mes +" - "+ anio);
						
				}   
	                      else{
				System.out.println(" Es una fecha correta " + dia +" - "+ mes +" - "+ anio);
	            }
	}
}
