import java.util.Scanner;

public class Salida2 {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String ciudad;

        System.out.println("Ingresa tu nombre:");
        nombre = Entrada.nextLine();
        System.out.println("Ingresa tu edad:");
        edad = Entrada.nextInt();
        Entrada.nextLine();
        System.out.println("Ingresa tu ciudad:");
        ciudad = Entrada.nextLine();

        System.out.printf("Hola %s %n tienes %d anyos %n ", nombre, edad);
        System.out.println("vives en " + ciudad);

        // esto se hace para liberar los recursos asociados con el objeto Scanner y evitar posibles fugas de memoria. Es una buena práctica cerrar los objetos Scanner cuando ya no se necesitan, especialmente si se están utilizando para leer datos desde el teclado o desde archivos, ya que pueden consumir recursos del sistema si no se cierran adecuadamente. Al llamar a Entrada.close(), se libera cualquier recurso asociado con el objeto Scanner y se evita que el programa consuma recursos innecesarios.
        Entrada.close();

    }
}
