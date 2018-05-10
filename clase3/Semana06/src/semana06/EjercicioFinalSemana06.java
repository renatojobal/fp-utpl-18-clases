
package semana06;
import java.util.Scanner;

/*
Realizar un proceso repetitivo que permita ingresar las estaturas de los 
estudiantes de una escuela para el equipo de basquet.


 * @author Renato
 */

public class EjercicioFinalSemana06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        // Declaración de variables
        double estatura = 0, promedio = 0, suma = 0;
        int contador = 0;
        int bandera = 1;
        String cadenaFinal = "";
        
        cadenaFinal = String.format("\n%s\n\n%s\n", "Reporte de Estaturas:","Estatura Estudiante");

        while(bandera == 1){
            
            contador = contador + 1;
            
            // Ingreso de las estaturas
            System.out.println("Ingrese la estatura del estudiante");
            estatura = entrada.nextDouble();

            // Validacion si estatura es menor a 1.20
            if(estatura < 1.20){
                estatura = 1.20;
            }

            // Concatenación de la estatura
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, estatura);

            // Sumatoria
            suma = suma + estatura;
            
            // Continuar
            System.out.println("Desea ingresar mas estaturas?\n 1 = 'Si continuar'\n 2 = 'No, salir'");
            bandera = entrada.nextInt();
            entrada.nextLine();
        }
        // Calculo del promedio
        promedio = suma / contador;

        // Salida
        
        System.out.printf("%s", cadenaFinal);
        System.out.printf("\n\nPromedio de estaturas: %.2f \n\nReporte generador por Dep. Deportes\n", promedio);
        
    }
}
