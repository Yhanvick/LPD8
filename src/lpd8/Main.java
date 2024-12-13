package lpd8;

import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        Main actividad = new Main();
        int[] lista = actividad.solicitarNumeros(10);
        System.out.println("Lista de Números Ingresada");
        actividad.mostrarListaDeEnteros(lista);

        lista = actividad.ordenarListaPorPrimos(lista);

        System.out.println("Lista de Numeros Ordenada");
        actividad.mostrarListaDeEnteros(lista);
        
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if ((numero % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] solicitarNumeros(int cantidad) {
    	System.out.println("Ingresa 10 números");
        int[] lista = new int[cantidad];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = scanner.nextInt();
        }
        return lista;
    }

    public int[] ordenarListaPorPrimos(int[] array) {
        int indexPrimo = 0;

        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {


                int intTemporal = array[indexPrimo];
                array[indexPrimo] = array[i];
                array[i] = intTemporal;

                indexPrimo++;

            }
        }
        return array;
    }

    public void mostrarListaDeEnteros(int[] array) {
    	for(int i = 0; i < array.length; i++) {
    		System.out.println(i + " - " + array[i]);
    	}
    }
}

/*
 Arreglosint[] Usa arreglos para almacenar y procesar números
 https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 
 *Método esPrimo Verifica si un número es primo usando divisibilidad y Math.sqr
 https//docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 
 *Ordenación por primos Reorganiza el arreglo intercambiando valores}https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 */


/*
 * Crear un programa en Java que realice lo siguiente:
Debe solicitar al usuario 10 números por consola y almacenarlos en un array.
Debe pasar los números que sean primos a las primeras posiciones, desplazando los demás números al final, de tal forma que no se pierda ningún número.
Debe mostrar por consola el array original, mostrando el índice seguido del valor de la posición.
Debe mostrar por consola el array que contiene los números primos al principio, mostrando el índice seguido del valor de la posición. El orden de los números no importa, siempre y cuando los números primos vayan al principio del array.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
Array original mostrando la posición del array más el valor.
0 - 1
1 - 2
2 - 3
3 - 4
4 - 5
5 - 6
6 - 7
7 - 8
8 - 9
9 - 10
Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor.
0 - 2
1 - 3
2 - 5
3 - 7
4 - 1
5 - 4
6 - 6
7 - 8
8 - 9
9 - 10
 * */
