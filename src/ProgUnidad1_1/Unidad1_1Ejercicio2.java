package ProgUnidad1_1;
//Ejecicio 2 unidad 1
/*
(Diámetro, circunferencia y área de un círculoo) Java también puede 
representar números de punto flotante que contienen puntos decimales,
como 3.14159. Escriba una aplicación que reciba del usuario el radio
de un círculo como un entero, y que imprima el diámetro, 
la circunferencia y el área del círculo mediante el uso del valor de
punto flotante 3.14159 para π. 
[nota: también puede utilizar la constante predefinida Math.PI para 
el valor de π. Esta constante es más precisa que el valor 3.14159.
La clase Math se define en el paquete java.lang. Las clases en este 
paquete se importan de manera automática, por lo que no necesita 
importar la clase Math mediante la instrucción import para usarla].
 Use las siguientes fórmulas (r es el radio):
diámetro = 2r
circunferencia = 2πr
área = πr2
No almacene los resultados de cada cálculo en una variable.
En vez de ello, especifique cada cálculo como el valor que se 
imprimirá en una instrucción System.out.printf. Los valores 
producidos por los cálculos del área y de la circunferencia son 
números de punto flotante. Dichos valores pueden imprimirse con el 
especificador de formato %f en una instrucción System.out.printf.
*/
import java.util.Scanner; // el programa usa la clase Scanner
public class Unidad1_1Ejercicio2 {

		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);
				double pi = 3.14159;
				double radio;
			
			System.out.print("Escriba el radio  \n"); // indicador
				 radio = entrada.nextInt(); // lee el número radio del usuario
				 
				 	double diametro = 2 * radio;
			System.out.printf("El diametro es " + diametro + "\n");	
			        
			      // muestra el diametro	
			      	double circunferencia = 2 * pi * radio;
			System.out.printf("La circunferencia es " + circunferencia + "\n"); 
			    
				 // muestra la circunferencia
				  	double area = pi * radio * 2;
			System.out.printf("El area es " + area + "\n"); 
			   
		         // muestra el area
		}
	}
	/*
	 Escriba el radio  10
	El diametro es 20.0
	La circunferencia es 62.8318
	El area es 62.8318
	 */

