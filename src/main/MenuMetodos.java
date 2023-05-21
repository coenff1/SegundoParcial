package main;
import Arreglo.ArregloOpciones;
import java.util.Scanner;
import metodos.Binaria;
import metodos.Secuencial;
import metodosordenamiento.Burbuja;
import metodosordenamiento.Insercion;
import metodosordenamiento.Quicksort;
import metodosordenamiento.Seleccion;
import metodosordenamiento.Shell;

public class MenuMetodos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu=1;

        System.out.println(" --------  Bienvenido");

        while (menu == 1) {
            System.out.println("¿De que tamaño desea el arreglo?");
            int tamaño = scan.nextInt();
            int arreglo[] = ArregloOpciones.llenado(tamaño);
            ArregloOpciones.impresion(arreglo);

            System.out.println("¿Qué método desea usar?");
            System.out.println("1 -- Burbuja");
            System.out.println("2 -- Selección");
            System.out.println("3 -- Inserción");
            System.out.println("4 -- Shell");
            System.out.println("5 -- Quicksort");
            int eleccion = scan.nextInt();

            switch (eleccion) {
                case 1:
                    Burbuja.metodoBurbuja(arreglo);
                    break;

                case 2:
                    Seleccion.metodoSeleccion(arreglo);
                    break;

                case 3:
                    Insercion.metodoInsercion(arreglo);
                    break;

                case 4:
                    Shell.metodoShell(arreglo);
                    break;

                case 5:
                    int izq = 0,
                     der = arreglo.length - 1;
                    Quicksort.metodoQuicksort(arreglo, izq, der);
                    break;
            }
            
            System.out.println("¿Desea ordenar otro vector?");
            System.out.println("1 -- Si         Otro -- Salir");
            menu=scan.nextInt();
        }
        
        System.out.println("¿De que tamaño desea el arreglo?");
        int tam = scan.nextInt();
        int arreglo[] = ArregloOpciones.llenado(tam);
        System.out.println("¿Que número desea buscar");
        int buscado = scan.nextInt();

        System.out.println("¿Que método desea utilizar?");
        System.out.println("1 -- Búsqueda binaria");
        System.out.println("2 -- Búsqueda secuencial");
        int eleccion = scan.nextInt();

        switch (eleccion) {
            case 1:
                
                int posicion=Binaria.busquedaBinaria(arreglo, buscado);
                if (posicion != -1) {
                    System.out.println("Encontrado en: " + posicion);
                } else {
                    System.out.println("El dato no se encuentra en el arreglo");
                }
                break;
                
            case 2:
                int pos=Secuencial.busquedaSecuencial(arreglo, buscado);
                if (pos != -1) {
                    System.out.println("Encontrado en: " + pos);
                } else {
                    System.out.println("El dato no se encuentra en el arreglo");
                }
                break;
        }
    }
}