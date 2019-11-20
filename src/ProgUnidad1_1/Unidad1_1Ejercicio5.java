package ProgUnidad1_1;
//Ejecicio 5 unidad 1
/*
(Calculadora del índice de masa corporal)  Las fórmulas para calcular
 el BMI son (en libras y kg):
```
BMI = ( pesoEnLibras × 703 ) / ( alturaEnPulgadas × alturaEnPulgadas)

BMI =  pesoEnKilogramos  / ( alturaEnMetros × alturaEnMetros )
```
Cree una calculadora del BMI que lea el peso del usuario en libras y la
altura en pulgadas (o, si lo prefiere, el peso del usuario en 
kilogramos y la altura en metros), para que luego calcule y muestre 
el índice de masa corporal del usuario. 
Muestre además la siguiente información del Departamento de Salud y
Servicios Humanos/Instituto Nacional de 
Salud para que el usuario pueda evaluar su BMI:
```
VALORES DE BMI
Bajo peso: menos de 18.5
Normal: entre 18.5 y 24.9
Sobrepeso: entre 25 y 29.9
Obeso: 30 o más
*/
import java.util.Scanner; // el programa usa la clase Scanner
public class Unidad1_1Ejercicio5 {

		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);
			float pesoKilos;
			float pesoLibras;
			float alturaMetros;
			float alturaPulgadas;
		    int opcion = 1;
		
		
		
			
			System.out.println("Elija opcion 1 para el peso en kilos o 2 para el peso en libras \n"); // indicador
				 opcion = entrada.nextInt(); // lee la opcion
				

		
		if(opcion == 1){
			System.out.println("Su peso en kilogramos es: \n"); // indicador
				 pesoKilos = entrada.nextInt(); // lee el peso en kilos
			System.out.println("Su altura en metros es: \n"); // indicador
				 alturaMetros = entrada.nextInt(); // lee la altura en metros
				 	float bmik =  (pesoKilos)  / (alturaMetros * alturaMetros);
			System.out.println("Su masa corporal es: \n" + bmik); // indicador
			System.out.println("\n VALORES DEL BMI \n Bajo peso: menos de 18.5\n Normal: entre 18.5 y 24.9 \n Sobrepeso: entre 25 y 29.9\n Obeso: 30 o más" ); 
			
			}
			if (opcion == 2){
			
				System.out.println("Su peso en libras es: \n"); // indicador
				 pesoLibras = entrada.nextInt(); // lee el peso en kilos
			System.out.println("Su altura en pulgadas es: \n"); // indicador
				 alturaPulgadas = entrada.nextInt(); // lee la altura en metros
				 	float bmi = (pesoLibras * 703) / (alturaPulgadas * alturaPulgadas);
			System.out.println("Su masa corporal es: \n" + bmi); // indicador
			System.out.println("\n VALORES DEL BMI \n Bajo peso: menos de 18.5\n Normal: entre 18.5 y 24.9 \n Sobrepeso: entre 25 y 29.9\n Obeso: 30 o más" ); 

			}	
		}
	}

