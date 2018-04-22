
package tareaextraclase;

import java.util.Scanner;

/*
Ejercicio:
Una empresa dedicada a vender teléfonos celulares, en base a las siguientes 
consideraciones:

- Si el cliente es de tipo 1 se le descuenta 10%
- Si el cliente es de tipo 2 se le descuenta 20%
- Si el cliente es de tipo 3 se le descuenta 30%
 
La solución debe imprimir el siguiente reporte:

    Nombre: Luis Alvarez
    Tipo de Cliente: 1
    Cantidad de Celulares: 20
    Precio por cada celular: 300
    Subtotal a pagar: cantidad de celulares * precio c/celular
    Descuento: (se debe obtener el descuento)
    Valor final a pagar: Subtotal - Descuento.

Importante, en base al reporte requerido usted debe analizar el conjunto de 
datos de entrada necesarios.

(usar la instrucción que se crea conveniente)


 @author Renato
 */
public class Venta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables
        String nombre;
        int tipo, cantidad;
        double precioUnitario, subtotal, descuento, total;
        
        // Ingreso de datos
        System.out.println("Ingrese nombre y apellido del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Seleccione el tipo de cliente(1,2,3): ");
        tipo = entrada.nextInt();
        System.out.println("Ingrese la cantidad de celulares que compra: ");
        cantidad = entrada.nextInt();
        
        // entrada.nextLine(); // limpiando el scanner
        System.out.println("Ingrese el valor de cada celular: ");
        precioUnitario = entrada.nextDouble();
        
        // Calculo del descuento
        
        // Salida
    
    }
}
