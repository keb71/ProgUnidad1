package ProgUnidad1_1;
//Ejercicio 10 Unidad 1
/*(Valor entero de un carácter)  Java puede también representar letras 
en mayúsculas, en minúsculas y en una considerable variedad de símbolos
especiales. Cada carácter tiene su correspondiente representación 
entera. El conjunto de caracteres que utiliza una computadora, junto 
con las correspondientes representaciones enteras de esos caracteres, 
se conocen como el conjunto de caracteres de esa computadora. Usted 
puede indicar un valor de carácter en un programa con sólo encerrar ese 
carácter entre comillas sencillas, como en ‘A’.
Usted puede determinar el equivalente entero de un carácter si antepone 
a ese carácter la palabra (int), como en  ```(int) 'A'```
Esta forma se conoce como operador de conversión de tipo (casting). 
La siguiente instrucción imprime un carácter y su equivalente entero:

System.out.printf( “El caracter %c tiene el valor %d%n”, ‘A’, ((int) ‘A’));

Cuando se ejecuta esta instrucción, muestra el carácter A y el valor 65 
(del conjunto de caracteres conocido como Unicode® como parte de la 
cadena. El especificador de formato %c es un receptáculo para un 
carácter (en este caso, elcarácter 'A').
Utilizando instrucciones similares a la mostrada anteriormente en este 
ejercicio, escriba una aplicación que muestre los equivalentes enteros 
de algunas letras en mayúsculas, en minúsculas, dígitos y símbolos 
especiales. Muestre los equivalentes enteros de los siguientes 
caracteres: A B C a b c 0 1 2 $ * + / y el carácter en blanco.
*/
public class Unidad1_1Ejercicio10 {

	public static void main(String[] args){
	System.out.printf("El caracter %c tiene el valor %d%n", 'A', ((int) 'A'));
	System.out.printf("El caracter %c tiene el valor %d%n", 'B', ((int) 'B'));
	System.out.printf("El caracter %c tiene el valor %d%n", 'C', ((int) 'C'));
	System.out.printf("El caracter %c tiene el valor %d%n", 'a', ((int) 'a'));
	System.out.printf("El caracter %c tiene el valor %d%n", 'b', ((int) 'b'));
	System.out.printf("El caracter %c tiene el valor %d%n", 'c', ((int) 'c'));
	System.out.printf("El caracter %c tiene el valor %d%n", '0', ((int) '0'));
	System.out.printf("El caracter %c tiene el valor %d%n", '1', ((int) '1'));
	System.out.printf("El caracter %c tiene el valor %d%n", '2', ((int) '2'));
	System.out.printf("El caracter %c tiene el valor %d%n", '$', ((int) '$'));
	System.out.printf("El caracter %c tiene el valor %d%n", '*', ((int) '*'));
	System.out.printf("El caracter %c tiene el valor %d%n", '+', ((int) '+'));
	System.out.printf("El caracter %c tiene el valor %d%n", '/', ((int) '/'));
	System.out.printf("El caracter %c tiene el valor %d%n", ' ', ((int) ' '));
	}
	}
	/*
	El caracter A tiene el valor 65
	El caracter B tiene el valor 66
	El caracter C tiene el valor 67
	El caracter a tiene el valor 97
	El caracter b tiene el valor 98
	El caracter c tiene el valor 99
	El caracter 0 tiene el valor 48
	El caracter 1 tiene el valor 49
	El caracter 2 tiene el valor 50
	El caracter $ tiene el valor 36
	El caracter * tiene el valor 42
	El caracter + tiene el valor 43
	El caracter / tiene el valor 47
	El caracter   tiene el valor 32 
	*/

