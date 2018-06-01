/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Dario - Carlos Miscelanea
 */
public class Ejercicio1 {
    
    public static int ejercicio;
    public static double num1, num2, num3, num4, horas;
    public static String nombre;
    public static double resultado;
    public static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        System.out.println("Ejercisios Fundamentos de programacion");
        System.out.println("");
        menu();
        solicitarNumero();
        
    }
    //Solicitamos 
    public static void solicitarNumero() {
        System.out.println("");
        System.out.println("Escoja una opción del 1 al 80 para ver los ejercicios o 99 para Salir");
        ejercicio = entrada.nextInt();
        llamarNumeral(ejercicio);
    }
    private static void llamarEjercicio(int numeral) {
        
        switch (numeral){
            case 1:
                    System.out.println("**ÁREA DE UN TRIÁNGULO**");
                    System.out.println("Indique la Base del triángulo");
                    num1 = entrada.nextInt();
                    System.out.println("Indique la Altura del triángulo");
                    num2 = entrada.nextInt();
                    areaTriangulo(num1,num2);			
                    solicitarNumero();
        }
            
           
    }

    private static void areaTriangulo(double base, double altura) {
        resultado = (( base * altura ) / 2);
        System.out.println("El área del tiángulo es: " + resultado);
    }
    
    private static void llamarNumeral(int numeral) {
        if (numeral >= 1) {
            if (numeral <= 80) {
                llamarEjercicio(numeral);
            }else{
                if (numeral == 99) {
                    System.out.println("Saliendo.........");
                    System.out.println("gracias..........");
                }else{
                    System.out.println("Escoja una opción del 1 al 80 para ver los ejercicios o 99 para Salir");
                    Scanner entrada = new Scanner(System.in);
                    ejercicio = entrada.nextInt();
                    llamarNumeral(ejercicio);
                }  
            }
        }
    }
    
    private static void menu() {
        System.out.println("Operadores\n" +
        "1. Código java que permita calcular el área de un triángulo.\n" +
        "2. Código java para introducir dos números por teclado y sumarlos.\n" +
        "3. Código java para introducir un número por teclado y visualizar el número elevado al\n" +
        "cuadrado.\n" +
        "4. Escribir un programa en Java que imprima por pantalla la suma de 1234 y 532.\n" +
        "5. Escribir un programa en Java que imprima por pantalla la resta de 1234 y 532.\n" +
        "6. Escribir un programa en Java que imprima por pantalla la multiplicación de 1234 y 532\n" +
        "7. Escribir un programa en Java que imprima por pantalla la división de 1234 entre 532\n" +
        "8. Escribir un programa en Java que imprima por pantalla el módulo de 1234 entre 532\n" +
        "9. Escribir un programa en Java que convierta de euros a dólares. Recibirá un número\n" +
        "decimal correspondiente a la cantidad en euros y contestará con la cantidad\n" +
        "correspondiente en dólares.\n" +
        "10. Escribir un programa en Java que calcule el área de un rectángulo del cual se le\n" +
        "proporcionará por el teclado su altura y anchura (números decimales).\n" +
        "11. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del\n" +
        "perímetro.\n" +
        "12. Diseñar un algoritmo que determine el área y el volumen de un cilindro.\n" +
        "13. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la\n" +
        "misma, y el área (Pi*R) ^2 del círculo inscrito.\n" +
        "14. Calcular el promedio de tres números introducidos por teclado.\n" +
        "15. Pidiendo el ingreso del numerador y denominador de 2 fracciones mostrar la suma.\n" +
        "16. Realizar un algoritmo que calcule la potencia de un número real elevado a un número\n" +
        "natural\n" +
        "Condicionales\n" +
        "17. Código para saber si un número es positivo o negativo.\n" +
        "18. Escribir un programa en Java que lea dos números del teclado y diga cuál es el mayor y\n" +
        "cual el menor.\n" +
        "19. Escriba un programa que lea tres números enteros positivos, y que calcule e imprima en\n" +
        "pantalla el menor y el mayor de todos ellos.20. Calcular el sueldo de los empleados de una empresa. \n" +
        "Para ello se deberá pedir el nombre\n" +
        "del empleado, las horas normales trabajadas y las horas extras. Tener en cuenta que el\n" +
        "valor de la hora es de $4 y que las horas extras se pagan doble.\n" +
        "21. Dados dos números A y B sumarlos si A es menor a B sino restarlos.\n" +
        "22. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por\n" +
        "cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división n\n" +
        "es posible.\n" +
        "23. numDia es una variable numérica que puede tomar 7 valores, ellos son 1, 2, 3, 4, 5, 6 o 7.\n" +
        "Mostar el nombre el nombre del día de la semana que corresponde al valor de la variable\n" +
        "numDia.\n" +
        "24. Dadas las longitudes de los tres lados de un triángulo determinar si es equilátero o no.\n" +
        "25. Dados dos números A y B sumarlos si al menos uno de ellos es negativo en caso contrario\n" +
        "multiplicarlos.\n" +
        "26. Pidiendo el día y el mes de nacimiento mostrar el signo.\n" +
        "27. Pidiendo el ingreso de la base y la altura de un cuadrilátero, indicar si es cuadrado o\n" +
        "rectángulo. Para cualquiera de los dos casos mostrar el perímetro y la superficie de la\n" +
        "figura.\n" +
        "28. Un negocio hace descuentos en las ventas de sus productos. Si la compra es inferior a\n" +
        "$100 el descuento es del 5%, si es mayor o igual a 100 y menor a 200 el descuento es del\n" +
        "10% sino será del 15%. Dado el precio de la venta mostrar el descuento realizado en pesos\n" +
        "y el precio final con descuento.\n" +
        "29. Pedir el ingreso de los datos de nacimientos de un hospital: día, mes, año y sexo (1-\n" +
        "femenino 2-masculino). Muestra el total de varones, el total de mujeres, el total general.\n" +
        "30. Se deberá pedir el sexo (F-M) y el estado civil (S-C-V-D) de las personas que lleguen a un\n" +
        "espectáculo. Se deberán mostrar la cantidad y el porcentaje de hombres solteros, mujeres\n" +
        "solteras, hombres casados, mujeres casadas, etc.\n" +
        "31. Realizar un algoritmo que determine si un año es bisiesto o no lo es.\n" +
        "32. Dados el día y mes de dos fechas, donde la primera fecha es menor a la segunda y ambas\n" +
        "pertenece a al mismo año, calcular los días que median entre ambas. Suponiendo que\n" +
        "todos los meses tienen treinta días.\n" +
        "33. Pidiendo la hora de ingreso y la hora de salida mostrar cuanto tiempo transcurrió. Las\n" +
        "horas deberán pedirse como HI, MI, SI (hora de ingreso, minuto de ingreso y segundo de\n" +
        "ingreso) y como HS, MS, SS (hora de salida, minuto de salida y segundo de salida)\n" +
        "Ciclos\n" +
        "34.Imprimir todos los múltiplos de 3 que hay entre 1 y 100.\n" +
        "35.Imprimir los números impares entre 0 y 100.\n" +
        "36.Imprimir los números pares del 0 al 100.\n" +
        "37.Escribir un programa en Java que imprima por pantalla los números del 1 al 3.\n" +
        "38.Escribir un programa en Java que imprima por pantalla los números del 1 al 9.\n" +
        "39.Escribir un programa en Java que imprima por pantalla los números del 1 al 10.000.\n" +
        "40.Escribir un programa en Java que imprima por pantalla los números del 5 al 10.\n" +
        "41.Escribir un programa en Java que imprima por pantalla los números del 5 al 15.\n" +
        "42.Escribir un programa en Java que imprima por pantalla los números del 5 al 15.000.\n" +
        "43.Escribir un programa en Java que imprima 200 veces la palabra “hola”.\n" +
        "44.Escribir un programa en Java que imprima por pantalla los cuadrados de los números del 1\n" +
        "al 30.\n" +
        "45.Escribir un programa en Java que multiplique los 20 primeros número naturales (1*2*3*4*5...).\n" +
        "46.Escribir un programa en Java que sume los cuadrados de los cien primeros números\n" +
        "naturales, mostrando el resultado en pantalla.\n" +
        "47.Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de\n" +
        "los 100 número siguientes, mostrando el resultado en pantalla. (Ejemplo: el usuario digita 5, se\n" +
        " debe sumar 5+6+7+8+... hasta que complete 100 números).\n" +
        "48.Escribir un programa en Java que lea un número entero por el teclado e imprima todos los\n" +
        "números impares menores que él.\n" +
        "49.Halle el número factorial de un número ingresado por el usuario.\n" +
        "50.Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y las\n" +
        "convierta a grados Celsius mostrándola. El programa finalizará cuando lea un valor de\n" +
        "temperatura igual a 999. La conversión de grados Fahrenheit (F) a Celsius (C) está dada por\n" +
        "C = 5/9(F - 32).\n" +
        "51.Implemente una sentencia switch que escriba un mensaje en cada caso (10 opciones).Inclúyala en \n" +
        "bucle de prueba for (5 repeticiones). Utilice también un break tras cada caso y\n" +
        "pruébelo.\n" +
        "52.Imprima los números primos hasta un número ingresado por el usuario.\n" +
        "53.Muestre por pantalla la tabla de multiplicar que el usuario desee.\n" +
        "54.Construya el algoritmo que permita generar e imprimir los múltiplos de 6 menores que\n" +
        "100\n" +
        "55.Construya el algoritmo que permita el ingreso de una serie de números y que determine cuantos \n" +
        "números positivos, cuantos números negativos y cuantos ceros hay. Como primer dato pedir la cantidad\n" +
        " de números que forman la lista.\n" +
        "56.Se dispone de un conjunto de números positivos. Calcular y escribir su promedio sabiendo\n" +
        "que se ingresará un valor menor a 0 para indicar el fin del conjunto de valores\n" +
        "\n" +
        "57.Calcular el perímetro y la superficie de N rectángulos pidiendo la base y la altura.\n" +
        "58.Hacer un programa que nos dé una tabla de los números factoriales de los diez primeros\n" +
        "números naturales.\n" +
        "59.Hacer un programa que muestre las tablas de multiplicar del 1 al 9. Cada tabla debe tener\n" +
        "su título.\n" +
        "60.Pedir sucesivamente 20 valores numéricos. A cada valor multiplicarlo por 3 y sumarle 5. \n" +
        "Mostrar el retorno de dicha expresión junto con el número que la origina. Al final mostrar\n" +
        "el valor acumulado.\n" +
        "61. Dados dos números naturales, el primero menor al segundo, generar y mostrar todos los\n" +
        "números comprendidos entre ellos en secuencia ascendente.\n" +
        "62. Diseñar un algoritmo que escriba el cubo de los números del 1 al 20.\n" +
        "63. Diseñar un algoritmo que escriba el cubo de los números naturales tales que el cubo tenga\n" +
        "como máximo cuatro cifras.\n" +
        "64. Realizar un algoritmo que muestre los valores de todas las piezas del domino de forma\n" +
        "ordenada: 0-0 0-1 1-1 0-2 1-2 2-2\n" +
        "65. Realizar un algoritmo que muestre por pantalla la tabla de multiplicar del dos. Hacer tres\n" +
        "versiones utilizando en cada una de ellas cada una de las estructuras repetitivas (for,\n" +
        "while, do while).\n" +
        "66. Realizar un algoritmo que determine el valor del cociente y el resto de una división entre\n" +
        "números enteros ingresados por el usuario.\n" +
        "67. Dada la serie de números naturales de Fibonacci: Sucesión: 1, 1, 2, 3, 5, 8, 13, 21,... diseñar\n" +
        "un algoritmo que pida un número natural y calcule e imprima la serie hasta el número\n" +
        "ingresado.\n" +
        "68. Se recibe una lista de números. Calcular y mostrar el promedio de los valores positivos y el\n" +
        "promedio de los negativos.\n" +
        "69. Sumar todos los números que se introducen mientras no sea 0.\n" +
        "70. Pedir los datos de los alumnos, estos son: sexo, edad y altura. Al final del programa se\n" +
        "deberá mostrar la cantidad de varones, la cantidad de mujeres, la altura promedio y la\n" +
        "cantidad de alumnos que tienen una altura mayor a 1.5 metros. El programa debe\n" +
        "finalizar cuando la edad sea igual a 0.\n" +
        "71. Ingresar como datos las temperaturas registradas durante todo el día a intervalo de\n" +
        "media hora comenzando desde la hora 0. Determinar las horas en la cual se produjo la\n" +
        "temperatura mínima y la máxima.\n" +
        "72. Determinar si un número ingresado N es par o impar, controlar que el número ingresado\n" +
        "sea entero y positivo.\n" +
        "Arreglos\n" +
        "73. Escriba un programa en java que genere aleatoriamente (Ayuda: Vea la clase Math para\n" +
        "saber cómo generar números aleatorios en java) un array de números reales, y lo ordene\n" +
        "mediante un método de ordenamiento (burbuja, selección o inserción) de menor a mayor.\n" +
        "La cantidad de números será definida por el usuario.\n" +
        "74. Elabore una aplicación que permita introducir 20 elementos de tipo entero en un arreglo,\n" +
        "el programa mostrara impreso el arreglo en orden inverso.\n" +
        "75. Hacer un programa que lea diez valores enteros en un array y los muestre en pantalla.\n" +
        "después que los ordene de menor a mayor y los vuelva a mostrar. y finalmente que los\n" +
        "ordene de mayor a menor y los muestre por tercera vez.\n" +
        "76. Elabore un programa que encuentre al número mayor y menor de un arreglo y luego\n" +
        "muestre en qué posición se encontraban estos números originalmente.77. Elabore un programa \n" +
        "que imprima en orden inverso una cadena de caracteres.\n" +
        "78. elabore un programa que permita introducir un arreglo de 10 elementos, el programa\n" +
        "mostrara un histograma de esos datos (el histograma se interpretara con la salida de n\n" +
        "asteriscos donde n es el valor de cada elemento del arreglo) ej.: el arreglo es 2,3,4 el\n" +
        "histograma será 2->** 3->*** 4->****\n" +
        "79. Elabore un programa que permita introducir un arreglo de 25 elementos de tipo entero.\n" +
        "luego pedir al usuario que introduzca un número. el programa mostrara el número de\n" +
        "veces que se repite dicho valor en el arreglo\n" +
        "80. Elabore un programa que permita introducir un arreglo de 8 elementos de tipo entero. El\n" +
        "programa mostrara un arreglo en donde muestre un 1 para los primos y un 0 para los no\n" +
        "primos.");
    }

    

    

    
                
            
    
}
