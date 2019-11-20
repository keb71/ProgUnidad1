package ProgUnidad1_2;
//Ejercicio 13 Unidad 1
/*
Escribe un programa que realice el cambio de ºC a ºF y viceversa. 
El programa debe preguntar por si el usuario quiere Celsius o 
Fahrenheit. El programa debe verificar que si el usuario introduce 
por teclado "Celsius" debe luego preguntar por el número y calcular y 
mostrar en pantallas la conversión a ºF. De forma análoga si el usuario 
introduce "Fahr" para comprobar que el usuario quiere de ºF a ºC.

La fórmula es C = (5/9) * (F * 32).Despeja la F para poder calcular los ºF.

Ejemplo de salida:

```
#### Conversión ºF a ºC / ºC a ªF
>Escriba 0 si quiere convertir de ºF a ºC y escriba 1 si quiere pasar 
de ºC a ºF.
0
 Ha elegido pasar de ºF a ºC, escriba el número de ºF?
70º
 La conversión de 77 ºF son 25 ºC.
```

No es necesario que se trabaje con datos double o float, puedes realizar 
los cálculos con enteros por ahora
*/
import java.util.Scanner;
public class Unidad1_2Ejercicio3 {

		public static void main(String[] args){
			
			int gradoC;
			int gradoF;
			int conversorC;
			int conversorF;
			
			Scanner entrada = new Scanner(System.in);
				
				System.out.println("Elija la 1 para convertir en ºC \n Elija 2 para convertir en ºF: \n");
			int opcion;
			opcion = entrada.nextInt();
			
			if (opcion == 1){
				System.out.println("Ha elegido pasar de ºF a ºC, escriba el número en ºF \n");
				gradoF = entrada.nextInt();
				conversorC = (5/9) * (gradoF * 32);
				System.out.println("Son " + conversorC + " ºC");
				}
				
			if (opcion == 2){
				System.out.println("Ha elegido pasar de ºC a ºF, escriba el número en ºC \n");
				gradoC = entrada.nextInt();
				conversorF = (gradoC * (9 / 5)) + 32;
				System.out.println("Son " + conversorF + " ºC");
				}
	}
}

