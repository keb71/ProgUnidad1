package ProgUnidad1_1;
//Ejecicio 6 unidad 1
/*
(Cálculo trayecto del automóvil) Escriba una aplicación que calcule el coste del trayecto de un automóvil:

- Total de kilómetros conducidos por trayecto
- Costo por litro de gasolina/diesel.
- Número litros/100km.
## Ejercicios de ampliación
*/
import java.util.Scanner; // el programa usa la clase Scanner
public class Unidad1_1Ejercicio6 {
	
		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);
			float kilometros;
			float litros;
			float litrosCienKm = 7.0f;
			float precioLitro;
			float precioLitroCien;
				System.out.println("Ponga los kilometros de su trayecto: \n"); // indicador
				 kilometros = entrada.nextFloat(); // lee el trayecto
				 	System.out.println("Ponga el precio del litro de gasolina o diesel: \n"); // indicador
				     precioLitro = entrada.nextFloat(); // lee el precio litro
				  precioLitroCien  = litrosCienKm * precioLitro;
		        float precioTrayecto = kilometros *  precioLitroCien / 100;
		    	System.out.println("Ponga el precio de su trayecto es: \n" + precioTrayecto);
		   }
		    
		   }

