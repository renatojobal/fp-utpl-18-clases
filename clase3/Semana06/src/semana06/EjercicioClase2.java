
package semana06;
import java.util.Scanner;
/**
 *
 * @author Renato
 */
public class EjercicioClase2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int edad=0, suma = 0, contador = 1;
        String cadenaFinal = "";
        cadenaFinal = String.format("\n%s\t%s\n", "Edad", "Suma");
        while(contador <= 5){
            System.out.println("Ingrese el valor de edad");
            edad = entrada.nextInt();
            suma = suma + edad;
            cadenaFinal = String.format("%s%d\t%d\n", cadenaFinal, edad, suma);
            contador = contador + 1;
        }
        System.out.printf("%s", cadenaFinal);

    }
}




