package semana06;

/**
 * Ejercicio Java Ciclo Repetitivo en clase
 * @author Renato
 */
public class EjerecicioClase {

    public static void main(String[] args) {
        int suma = 0, contador = 0;
        System.out.printf("%s\t%s\n","Contador","Suma");
        while(contador <= 4){
            suma = suma + contador;
            System.out.printf("   %d\t\t %d\n", contador, suma);
            contador = contador + 1;
        }
    }
    
}
