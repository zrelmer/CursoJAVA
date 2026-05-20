// ENTRADA DE DATOS EN JAVA
// IMPORTAMOS LA CLASE SCANNER PARA LEER DATOS DESDE EL TECLADO
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        // lo primero que hacemos es crear un objeto de la clase Scanner
        // se usa System.in para indicar que queremos leer desde el teclado
        // Entrada es el nombre del objeto que vamos a usar para leer los datos
        // new Scanner(System.in) es el constructor de la clase Scanner que nos permite crear un nuevo objeto Scanner que lee desde el teclado
        Scanner Entrada = new Scanner(System.in);

        // creamos dos variables para almacenar el nombre y la edad del usuario
        String nombre;
        String ciudad;
        int edad;

        System.out.println("Ingresa tu nombre:");
        // usamos el método nextLine() del objeto Entrada para leer una línea de texto desde el teclado y almacenarla en la variable nombre
        nombre = Entrada.nextLine();

        System.out.println("Ingresa tu edad:");
        edad = Entrada.nextInt();
        Entrada.nextLine();

        System.out.println("Ingresa tu ciudad:");
        ciudad = Entrada.nextLine();

        // imprimimos un mensaje de bienvenida utilizando la información proporcionada por el usuario
        System.out.println("Hola " + nombre + ", tienes " + edad + " años y vives en " + ciudad + ".");

        // mostramos el nombre, la edad y la ciudad del usuario
        // se finaliza el script utilizando el método close() del objeto Entrada para liberar los recursos asociados con el objeto Scanner
        Entrada.close();

    }
}