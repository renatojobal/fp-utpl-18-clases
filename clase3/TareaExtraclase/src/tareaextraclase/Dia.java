
package tareaextraclase;

import java.util.Scanner;

/*
Ejercicio: 
Una solución que permita leer el número de día (un valor entre 1 y 7) 
e imprima Lunes si es 1, Martes si es 2, ... , Domingo si es 7.
(usar instrucción switch)
 
@author Renato
*/
public class Dia {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    // DECLARACION DE VARIABLES
    int opcion;
    // INGRESO DE DATOS
    System.out.println("Ingrese el número de día: ");
    opcion = entrada.nextInt();
    // CALCULO
    switch(opcion){
        case 1:
            System.out.printf("Día %d %s\n", opcion, "Lunes");            
            break;
        case 2:
            System.out.printf("Día %d %s\n", opcion, "Martes");
            break;
        case 3:
            System.out.printf("Día %d %s\n", opcion, "Miercoles");
            break;
        case 4:
            System.out.printf("Día %d %s\n", opcion, "Jueves");
            break;
        case 5:
            System.out.printf("Día %d %s\n", opcion, "Viernes");
            break;
        case 6:
            System.out.printf("Día %d %s\n", opcion, "Sabado");
            break;
        case 7:
            System.out.printf("Día %d %s\n", opcion, "Domingo");
            break;
        default:
            System.out.printf("Respuesta incorrecta: %d\n", opcion);
            
    } 
    }
}
